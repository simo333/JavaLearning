package javalearning.ocpjavabook.practicetesting.collectionsfw.maps;

import java.util.*;

public class HashMapTest {
    enum IceCream {CHOCOLATE, STRAWBERRY, WALNUT}
    enum Color {RED, BLUE, YELLOW}

    public static void main(String[] args) {
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Szymon", 15300D);
        salaryMap.put("Radek", 10D);
        salaryMap.put("Zenon", 1200D);

//        Set<String> keys = salaryMap.keySet();
//        for(String k : keys)
//            System.out.println(k);
//
//        Set<Double> values = new LinkedHashSet<>(salaryMap.values());
//        for(Double v : values)
//            System.out.println(v);

        Map<String, List<IceCream>> iceCreamMap = new HashMap<>();

        List<IceCream> iceCreamList = new ArrayList<>();
        iceCreamList.add(IceCream.CHOCOLATE);
        iceCreamList.add(IceCream.WALNUT);

        iceCreamMap.put("Szymon", iceCreamList);
        System.out.println(iceCreamMap.get("Szymon"));

        Map<Emp, Double> workers = new HashMap<>();
        workers.put(new Emp("Szymon"), 13000D);

        Emp emp = new Emp("Szymon");
        System.out.println(workers.containsValue(13000.0));

        Map<Color, String> colorMap = new HashMap<>();
        colorMap.put(Color.RED, "Passion");
        colorMap.put(Color.BLUE, "Stability");
        colorMap.put(Color.YELLOW, "Energy");

        Collection<String> mood = colorMap.values();
        Set<Color> colors = colorMap.keySet();
        Set<Map.Entry<Color, String>> colorsMood = colorMap.entrySet();

        for(String s : mood)
            System.out.println(s);

        for (Color c : colors)
            System.out.println(c);

        for (Map.Entry pair : colorsMood)
            System.out.println(pair.getKey() + ":" + pair.getValue());
    }
}
