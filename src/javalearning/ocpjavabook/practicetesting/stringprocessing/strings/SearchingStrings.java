package javalearning.ocpjavabook.practicetesting.stringprocessing.strings;

public class SearchingStrings {
    public static void main(String[] args) {
        //Methods indexOf and lastIndexOf
        String sentence = "paint the cup and the plate";

        System.out.println(sentence.indexOf('t'));
        System.out.println(sentence.lastIndexOf('t',15));

        System.out.println(sentence.indexOf("the"));
        System.out.println(sentence.indexOf('t', 15));

        System.out.println(sentence.lastIndexOf("the"));
        System.out.println(sentence.lastIndexOf('t'));

        //Method contains
        StringBuilder sb = new StringBuilder("the");
        String str = "the";

        System.out.println(sentence.contains(sb));
        System.out.println(sentence.contains(str));

        //Methods subSequence and subString
        System.out.println(sentence.subSequence(2,7));
        System.out.println(sentence.substring(20));

        //Method split
        System.out.println();
        String[] tokens1 = sentence.split("c.p");
        for(String s : tokens1)
            System.out.println(s);

        System.out.println();
        String[] tokens2 = sentence.split("\\s", 3);
        for(String s : tokens2)
            System.out.println(s);


    }
}
