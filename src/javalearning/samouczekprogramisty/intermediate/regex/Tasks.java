package javalearning.samouczekprogramisty.intermediate.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(sz?)+");
        Matcher matcher = pattern.matcher("szyszunias");
        matcher.results().forEach(s -> System.out.println(s.group()));
    }

    @Test
    void test1() {
        Pattern pattern = Pattern.compile("-?\\d+(,?\\d)*");

        assertTrue(pattern.matcher("-9,1").matches());
        assertTrue(pattern.matcher("0").matches());
        assertFalse(pattern.matcher("-9,").matches());

    }

    @Test
    void test2() {
        Pattern pattern = Pattern.compile("\\d{1,3}[A-Z]?(/\\d{1,3}[A-Z]?)?");

        assertTrue(pattern.matcher("1").matches());
        assertTrue(pattern.matcher("23").matches());
        assertTrue(pattern.matcher("231").matches());
        assertTrue(pattern.matcher("1A").matches());
        assertTrue(pattern.matcher("12A").matches());
        assertTrue(pattern.matcher("156C").matches());
        assertTrue(pattern.matcher("15A/23C").matches());
        assertFalse(pattern.matcher("A").matches());
        assertFalse(pattern.matcher("A/C").matches());
        assertFalse(pattern.matcher("A/12").matches());
        assertFalse(pattern.matcher("132/A").matches());
        assertFalse(pattern.matcher("A/").matches());
        assertFalse(pattern.matcher("12/").matches());
    }

    @Test
    void test3() {
        Pattern pattern = Pattern.compile("\\w{2,20}[- ]?\\w{0,20}(\\s\\w{2,20})?");

        assertTrue(pattern.matcher("Szymankowszczyzna").matches());
        assertTrue(pattern.matcher("Jazgarzewszczyzna").matches());
        assertTrue(pattern.matcher("Os").matches());
        assertTrue(pattern.matcher("Wierzchoslawiczki").matches());
        assertTrue(pattern.matcher("Przedmiescie Szczebrzeszynskie").matches());
        assertTrue(pattern.matcher("Sobienie Kielczewskie Pierwsze").matches());
    }

    @Test
    void test4() {
        Pattern pattern = Pattern.compile("<(.+?)>");
        Matcher matcher = pattern.matcher("<em>some emphasized text</em>");

        assertTrue(matcher.find());
        System.out.println(matcher.group(1));
    }

    @Test
    void test5() {
        Pattern pattern = Pattern.compile("(.{3,5}?)");
        Matcher matcher = pattern.matcher("12345");

        assertTrue(matcher.find());
        System.out.println(matcher.group(1));
    }

    @Test
    void test6() {
        Pattern pattern = Pattern.compile("czerwony|zielony|niebieski");
        Matcher matcher = pattern.matcher("czerwony samochód");

        assertTrue(matcher.find());
    }

    @Test
    void test7() {
        Pattern pattern = Pattern.compile("(?<day>\\d{2})\\.(?<month>\\d{2})\\.(?<year>\\d{4})");
        Matcher matcher = pattern.matcher("04.01.2015");
        if (matcher.find()) {
            System.out.println(matcher.group("day"));
            System.out.println(matcher.group("month"));
            System.out.println(matcher.group("year"));
        }
    }

    @Test
    void test8() {
        Pattern pattern = Pattern.compile("m");
        assertTrue(pattern.matcher("szymon").find());

        Pattern pattern2 = Pattern.compile("^m");
        assertFalse(pattern2.matcher("szymon").find());

        Pattern pattern3 = Pattern.compile("mon$");
        assertTrue(pattern3.matcher("szymon").find());

    }
}


