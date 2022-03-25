package javalearning.ocpjavabook.practicetesting.overloading.secondtask;

public class Employee {
    String name;
    int age;

    Employee () {
        this(25,"John");
    }
    Employee (String newName) {
        name = newName;
        age = 24;
    }
    Employee (String newName, int newAge) {
        name = newName;
        age = newAge;
    }
    Employee (int newAge, String newName) {
        name = newName;
        age = newAge;
    }

    {
        System.out.println("Instance init");
    }

}
