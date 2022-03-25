package javalearning.ocpjavabook.practicetesting.overloading.secondtask;

public class TravelAgent {
    public static void main(String args[]) {
        System.out.println(Travel.bookTicket(new Engineer()));

        Employee emp = new CEO();

        System.out.println(Travel.bookTicket(emp));

        Employee emp1 = new Employee();

        System.out.println(emp.age + " " + emp.name);
    }
}
