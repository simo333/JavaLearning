package javalearning.ocpjavabook.practicetesting.generics.genericinterface;

public class MapLegendNonGeneric implements MyMap<String, Integer>{

    @Override
    public void put(String key, Integer value) {

    }

    @Override
    public Integer get(String key) {
        return null;
    }
}
