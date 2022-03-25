package javalearning.samouczekprogramisty.intermediate.generics.oracletasks.task8;

import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "", "ab", "abcde", "abcd", "abc");
        System.out.println(findMaxInRange(list, 0, 3));
    }

    public static <T extends Comparable<T>>
    T findMaxInRange(List<T> list, int beginRange, int endRange) {
        T max = list.get(beginRange);
        for (++beginRange; beginRange <= endRange; beginRange++) {
            if (max.compareTo(list.get(beginRange)) < 0)
                max = list.get(beginRange);
        }
        return max;
    }
}
