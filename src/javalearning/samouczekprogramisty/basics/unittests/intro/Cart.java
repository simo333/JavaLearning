package javalearning.samouczekprogramisty.basics.unittests.intro;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item, Integer> orderedItems = new HashMap<>();

    public void getCartView(){
        if(orderedItems.isEmpty())
            System.out.println("Your cart is empty.");
        else {
            System.out.println("Your cart contains:");
            orderedItems.keySet()
                    .forEach(n -> System.out.println(n.getName() +
                            "\t price each: " + n.getPrice() +
                            "\t amount: " + orderedItems.get(n)));
        }
    }

    public Map<Item, Integer> getCartMap(){
        return orderedItems;
    }

    public void addToCart(Item item, Integer amount){
        if(amount < 1)
            throw new IllegalArgumentException("You cannot add 0 or less items.");
        if(orderedItems.containsKey(item))
           orderedItems.put(item, orderedItems.get(item) + amount);
        orderedItems.putIfAbsent(item, amount);
    }

    public void deleteFromCart(Item item, Integer amount){
        if(orderedItems.containsKey(item))
            if(orderedItems.get(item) > amount)
                orderedItems.put(item, orderedItems.get(item) - amount);
            else throw new IllegalArgumentException("You cannot remove more items than you have added.");
        else throw new IllegalArgumentException("No such item in your cart.");
    }
    public void deleteFromCart(Item item) {
        if(orderedItems.containsKey(item))

            orderedItems.remove(item);
        else throw new IllegalArgumentException("No such item in your cart.");
    }

    public double getCartValue(){
        return orderedItems.keySet()
                .stream()
                .mapToDouble(this::getItemsValue)
                .sum();
    }

    private double getItemsValue(Item item){
        return orderedItems.get(item) * item.getPrice();
    }
}
