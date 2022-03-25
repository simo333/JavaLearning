package javalearning.ocpjavabook.practicetesting.streams;

import java.util.*;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class StreamPractice2 {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("Java", "Magazine", "is", "the", "best");

        Map<String, Long> letterCount = words.map(w -> w.split(""))
                                                            .flatMap(Arrays::stream)
                                                            .collect(groupingBy(identity(), counting()));

        letterCount.keySet().stream()
                .map(key -> "Letter: " + key.toLowerCase() + "  |   Amount: " + letterCount.get(key))
                .forEach(System.out::println);

        //TODO
        System.out.println("");
        List<Employee> employeeList = Arrays.asList(
                new Employee("Szmon", "Pk", 1996, 6320, JobTitle.BOSS, Nation.POLAND),
                new Employee("Jlia", "Kk", 2000, 2800, JobTitle.WORKER, Nation.POLAND),
                new Employee("Dominka", "Ka", 2000, 1400, JobTitle.TRAINEE, Nation.UKRAINE),
                new Employee("Patyk", "Rk", 1999, 3000, JobTitle.WORKER, Nation.POLAND),
                new Employee("Daian", "Ps", 1998, 3100, JobTitle.WORKER, Nation.POLAND),
                new Employee("Dmian", "Ke", 1993, 2400, JobTitle.WORKER, Nation.UKRAINE),
                new Employee("Miołaj", "Tk", 1998, 1500, JobTitle.TRAINEE, Nation.UKRAINE),
                new Employee("Jaub", "To", 2002, 1450, JobTitle.TRAINEE, Nation.UKRAINE),
                new Employee("Łkasz", "Pek", 1991, 3500, JobTitle.WORKER, Nation.POLAND),
                new Employee("Adm", "Dowski", 1971, 1500, JobTitle.TRAINEE, Nation.POLAND)
        );

        double sumOfAllSalaries = employeeList.stream().collect(summingDouble(Employee::getSalary));
        System.out.println("Sum of all salaries is equal to " + sumOfAllSalaries);

        double averageSalary = employeeList.stream().collect(averagingDouble(Employee::getSalary));
        System.out.println("Average salary is equal to " + averageSalary);

        System.out.println();

        Map<JobTitle, List<Employee>> employeeByJobTitle = employeeList.stream()
                .collect(groupingBy(Employee::getJobTitle));
        for(JobTitle title : employeeByJobTitle.keySet())
            System.out.println(title + ": " + employeeByJobTitle.get(title));

        System.out.println("");

        Map<JobTitle, Double> averageSalaryByJobTitle = employeeList.stream().collect(groupingBy(
                Employee::getJobTitle, averagingDouble(Employee::getSalary)));
        for(JobTitle title : averageSalaryByJobTitle.keySet())
            System.out.println(title + " - average salary: " + averageSalaryByJobTitle.get(title));

        System.out.println();

        Map<JobTitle, Optional<Employee>> oldestEmployeeByJobTitle = employeeList.stream().collect(
                groupingBy(Employee::getJobTitle, minBy(Comparator.comparing(Employee::getYearOfBirth))));
        for(JobTitle title : oldestEmployeeByJobTitle.keySet())
            System.out.println("Oldest employee among " + title + " is " + oldestEmployeeByJobTitle.get(title).get()
            + " - " + oldestEmployeeByJobTitle.get(title).get().getYearOfBirth());

        System.out.println();

        Map<JobTitle, Map<Nation, Double>> salariesByNationByJobTitle = employeeList.stream().collect(groupingBy(
                Employee::getJobTitle, groupingBy(Employee::getNation, averagingDouble(Employee::getSalary))));

        for(JobTitle title : salariesByNationByJobTitle.keySet()) {
            for (Nation nation : salariesByNationByJobTitle.get(title).keySet())
                System.out.println(title + ": " + nation + ": " + salariesByNationByJobTitle.get(title).get(nation));
        }

        System.out.println();

        System.out.println(getTheOldestNationEmpByJobTitle(employeeList, Nation.POLAND, JobTitle.WORKER));
    }

    public static Employee getTheOldestNationEmpByJobTitle(List<Employee> list, Nation nation, JobTitle jobTitle){
        return list.stream()
                .filter(e -> e.getJobTitle() == jobTitle)
                .filter(e -> e.getNation() == nation)
                .min(Comparator.comparingInt(Employee::getYearOfBirth))
                .orElse(null);
    }
}

