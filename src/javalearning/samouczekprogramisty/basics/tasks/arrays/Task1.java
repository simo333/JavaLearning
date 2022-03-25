package javalearning.samouczekprogramisty.basics.tasks.arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String[] test = task1.getNextFiveLettersOfAlphabet('y');
        Arrays.stream(test).forEach(System.out::println);
    }

    public String[] getNextFiveLettersOfAlphabet(char a){
        String[] result = new String[5];
        int charAt = a;
        for(int i = 0; i < 5; i++) {
            if(i + charAt + 1 > 122)
                result[i] = String.valueOf(' ');
            else result[i] = String.valueOf((char) (i + charAt + 1));
        }
        return result;
    }
}
