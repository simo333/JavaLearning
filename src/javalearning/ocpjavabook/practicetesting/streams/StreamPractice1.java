package javalearning.ocpjavabook.practicetesting.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice1 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Szymon", "Poniedziałek", 1996, 6320, JobTitle.BOSS, Nation.POLAND),
                new Employee("Julia", "Kubiak", 2000, 2800, JobTitle.WORKER, Nation.POLAND),
                new Employee("Dominika", "Kantorska", 2000, 1400, JobTitle.TRAINEE, Nation.UKRAINE),
                new Employee("Patryk", "Roszak", 1999, 3000, JobTitle.WORKER, Nation.POLAND),
                new Employee("Damian", "Papis", 1998, 3100, JobTitle.WORKER, Nation.POLAND),
                new Employee("Damian", "Krauze", 1993, 2400, JobTitle.WORKER, Nation.UKRAINE),
                new Employee("Mikołaj", "Tomczak", 1998, 1500, JobTitle.TRAINEE, Nation.UKRAINE),
                new Employee("Jakub", "Tomczak", 2002, 1450, JobTitle.TRAINEE, Nation.UKRAINE),
                new Employee("Łukasz", "Poniedziałek", 1991, 3500, JobTitle.WORKER, Nation.POLAND)
        );

        Optional<String> bosses = employeeList.stream()
                .filter(e -> e.getJobTitle() == JobTitle.BOSS)
                .map(e -> "Boss: " + e.getFirstName() + " " + e.getLastName())
                .findAny();
        System.out.println(bosses.orElse("No employee of job title BOSS."));

        employeeList.stream()
                .filter(e -> e.getSalary() > 2000)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(e -> e.getFirstName() + " " + e.getLastName() + ", salary: " + e.getSalary())
                .forEach(System.out::println);

        System.out.println("****************************************************");

        List<Employee> workers = employeeList.stream()
                .filter(e -> e.getJobTitle() == JobTitle.WORKER)
                .sorted(Comparator.comparing(Employee::getLastName))
                .collect(Collectors.toList());

        for(Employee w : workers)
            System.out.println(w.getFirstName() + " " + w.getLastName() + ": " + w.getJobTitle());


        double maxSalary = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getSalary)
                .get();
        System.out.println("Biggest salary is " + maxSalary);

        double minSalaryAmongWorkers = employeeList.stream()
                .filter(e -> e.getJobTitle() == JobTitle.WORKER)
                .min(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getSalary)
                .get();
        System.out.println("Lowest salary among workers is " + minSalaryAmongWorkers);

        System.out.println("");
        System.out.println("***********************************************************");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .collect(Collectors.toList());

        for(Integer i : evenSquares)
            System.out.println(i);


    }





}
