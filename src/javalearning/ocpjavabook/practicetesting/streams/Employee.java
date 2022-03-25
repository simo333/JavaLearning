package javalearning.ocpjavabook.practicetesting.streams;

public class Employee {
    private static int employeeIdCounter = 0;
    private int employeeId;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private double salary;
    private JobTitle jobTitle;
    private final Nation nation;


    public Employee(String firstName, String lastName, int yearOfBirth, double salary, JobTitle jobTitle, Nation nation) {
        this.employeeId = ++employeeIdCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.nation = nation;
    }

    public static int getEmployeeIdCounter() {
        return employeeIdCounter;
    }

    public static void setEmployeeIdCounter(int employeeIdCounter) {
        Employee.employeeIdCounter = employeeIdCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Nation getNation() {
        return nation;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
