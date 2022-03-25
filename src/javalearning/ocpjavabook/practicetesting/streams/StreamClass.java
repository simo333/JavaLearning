package javalearning.ocpjavabook.practicetesting.streams;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamClass {
    private static long counter;

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Optional<String> stream = list.stream()
                                        .filter(element -> {
                                           System.out.println("filter() was called");
                                           return element.contains("2");
                                        }).map(element -> {
                                            System.out.println("map() was called");
                                            return element.toUpperCase();
                                        }).findFirst();
        System.out.println(counter);
        System.out.println("**********************************************************");

        int reduced = IntStream.range(2,6).reduce(10, (a, b) -> {
            System.out.println("a=" + a + "   |  b=" + b);
            return a + a + a;
            });
        System.out.println("Result is " + reduced);

        System.out.println("**********************************************************");

        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> collectorCollection =
                productList.stream().map(Product::getName).collect(Collectors.toList());
        System.out.println(collectorCollection);

        String listToString = productList.stream().map(Product::getName)
                .collect(Collectors.joining("/ ", "(", ")"));
        System.out.println(listToString);

        double averagePrice = productList.stream()
                .collect(Collectors.averagingInt(Product::getPrice));
        System.out.println("Average price is " + averagePrice);

        IntSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingInt(Product::getPrice));
        System.out.println(statistics);

        Map<Integer, List<Product>> collectorMapOfLists = productList.stream()
                .collect(Collectors.groupingBy(Product::getPrice));

        System.out.println(collectorMapOfLists);

        Map<Boolean, List<Product>> mapPartitioned = productList.stream()
                .collect(Collectors.partitioningBy(element -> element.getPrice() > 15));
        System.out.println(mapPartitioned);

        Set<Product> unmodifiableSet = productList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
        System.out.println(unmodifiableSet);
    }






}
