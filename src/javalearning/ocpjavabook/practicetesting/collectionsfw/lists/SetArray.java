package javalearning.ocpjavabook.practicetesting.collectionsfw.lists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetArray {
    public static void main(String[] args) {

        Set<City> citySet = new LinkedHashSet<>();
        citySet.add(new City("Rozanna"));
        citySet.add(new City("Orchowo"));
        citySet.add(new City("Marcinkowo"));

        System.out.println(citySet);

        List<City> cityList = new ArrayList<>();
        cityList.add(new City("Rozanna"));
        cityList.add(new City("Rozanna"));
        cityList.add(new City("Rozanna"));
        cityList.add(new City("Rozana"));

        citySet.addAll(cityList);
        System.out.println(citySet);



    }
}
