package javalearning.ocpjavabook.practicetesting.stringprocessing.formatting;

import java.io.File;
import java.util.Formatter;

public class FormattedStrings {
    public static void main(String[] args) {
        String name = "Shreya";
        String name2 = "Szymon";

        System.out.printf("My name is %2$s", name, name2);
        System.out.println();

        //%b
        String namee = "Shreya";
        Integer age = null;
        boolean isShort = false;

        System.out.format("Name %b, age %b, isShort %b", namee, age, isShort);
        System.out.format("\nName defined %10b.", name);
        System.out.format("\nName defined %.3b.", name);
        System.out.format("\nName defined %-10b.", name);
        System.out.println();

        //%d %f
        Double num = 12.12345;
        System.out.printf("[%f]", num   );
        System.out.println();
        System.out.printf("[%010f]", 12.12345);
        System.out.println();
        System.out.printf("[%-10f]", 12.123459999999999992);
        System.out.println();
        System.out.printf("[%10.3f]", 12.98765);
        System.out.println();
        System.out.printf("[%,f]", 123456789.12345);
        System.out.println();

        System.out.printf("[%d]", 12345);
        System.out.println();
        System.out.printf("[%010d]", 12345);
        System.out.println();
        System.out.printf("%(,d", -123456789);
        System.out.println();
        //System.out.printf("[%10.2d]", 12345.345D);
        System.out.println();

        //%s
        String name3 = "Harry";
        Integer age1 = null;
        String[] skills = {"Java", "Android"};
        System.out.format("Name is %s, age is %s, skills are %s", name3, age1, skills);
    }
}
