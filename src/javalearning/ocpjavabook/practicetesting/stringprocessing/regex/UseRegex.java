package javalearning.ocpjavabook.practicetesting.stringprocessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseRegex {
    public static void main(String[] args) {
        String targetString = "I am fine to dine at nine";
        String regex = "[fdn]ine";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println("\\\\d");
        targetString = "A5C7 %-";
        regex = "\\d";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println("\\\\D");
        targetString = "A5C7 %-";
        regex = "\\D";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println("\\\\s");
        targetString = "A5C7 %-";
        regex = "\\s";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println("\\\\S");
        targetString = "A5C7 %-";
        regex = "\\S";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println("\\\\w");
        targetString = "A5C7 %-";
        regex = "\\w";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println("\\\\W");
        targetString = "A5C7 %-";
        regex = "\\W";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        targetString = "Simo";
        regex = "[g-jn-p]";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        String newString = matcher.replaceAll("e");
        System.out.printf("New string: %s", newString);
        System.out.println();

        System.out.println("\\\\b");
        targetString = "the leather in their coat made her seethe";
        regex = "\\bthe";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println("Searchihg Aug or August: ");
        targetString = "aug august";
        regex = "aug(ust)?";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group() + " starts at " + matcher.start() + ", ends at " + matcher.end());
        }

        System.out.println();
        targetString = "761cars8 5dogs-total846";
        regex = "\\d\\d";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
