package javalearning.ocpjavabook.practicetesting.stringprocessing.parsingtokenizing;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("The \tnew \nProgrammer exam");
        while(scanner.hasNext())
            System.out.println(scanner.next());

        System.out.println();
        Scanner scanner1 = new Scanner("The1new22Programmer exam6");
        scanner1.useDelimiter("[\\d]+");
        while (scanner1.hasNext())
            System.out.println(scanner1.next());


        Scanner scanner2 = new Scanner("The1new22Programmer exam6");
        System.out.println();
        scanner2.useDelimiter("[\\sA-Za-z]+");
        while (scanner2.hasNext())
            System.out.println(scanner2.next());

        Scanner scanner3 = new Scanner("Shreya,20,true");
        scanner3.useDelimiter(",");
        System.out.println(scanner3.next());
        System.out.println(scanner3.nextInt());
        System.out.println(scanner3.nextBoolean());

        System.out.println();

        Scanner scanner4 = new Scanner ("1 2 4 The new 55 Programmer 44 exam");
        scanner4.useDelimiter("[\\sA-Za-z]+");
        int total = 0;
        while(scanner4.hasNextInt())
            total = total + scanner4.nextInt();
        System.out.println("Total = " + total);
    }
}
