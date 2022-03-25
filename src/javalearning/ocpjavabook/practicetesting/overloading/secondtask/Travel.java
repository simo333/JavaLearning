package javalearning.ocpjavabook.practicetesting.overloading.secondtask;

public class Travel {
    static String bookTicket (Employee val) {
        return "Employee: economy class";
    }
    static String bookTicket (CEO val) {
        return "CEO: business class";
    }
    static String bookTicket (Engineer val) {
        return "Engineer: engineering";
    }
}
