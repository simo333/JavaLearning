package javalearning.ocpjavabook.practicetesting.stringprocessing.strings;

public class ReplacingStrings {

    public static void main(String[] args) {

        //replacing methods
        String str = "RENT-TENT";
        System.out.println(str);
        System.out.println(str.substring(2,5));
        System.out.println(str.subSequence(3,7));
        String newStr = str.replace(str.substring(2,5), str.subSequence(3,7));
        System.out.println(newStr);

        System.out.println();
        String str2 = "cat cup copp";
        String newString = str2.replaceAll("c.p", "()");
        System.out.println(newString);
        System.out.println();

        //other methods
        String strr = "My heart belongs to you";
        System.out.println(strr.endsWith("you"));
        System.out.println(strr.startsWith("M"));
        System.out.println(strr.startsWith("h", 3));

    }
}
