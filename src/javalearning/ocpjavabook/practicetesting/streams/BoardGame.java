package javalearning.ocpjavabook.practicetesting.streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BoardGame {
    public final String name;
    public final double rating;
    public final BigDecimal price;
    public int minPlayers;
    public int maxPlayers;

    public BoardGame(String name, double rating, BigDecimal price, int minPlayers, int maxPlayers) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public static void main(String[] args) throws Exception {
        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );

        System.out.println("Games that can play more than 4 players, has ratings over 8 point " +
                            "and cost less than 150. Printed in the upper case:");
        games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                .map(g -> g.name.toUpperCase())
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("Games that costs over 100 and minimal amount of players is 2:");
        games.stream()
                .filter(g -> new BigDecimal(100).compareTo(g.price) < 0)
                .filter(g -> g.minPlayers >= 2)
                .map(g -> g.name)
                .forEach(System.out::println);



        //ZADANIE 1 - https://www.samouczekprogramisty.pl/strumienie-w-jezyku-java/
        System.out.println("");
        System.out.println("Zadanie 1:");
        BoardGame bestGame;
        bestGame = games.stream()
                .filter(g -> g.name.contains("a"))
                .max(Comparator.comparingDouble(g -> g.rating))
                .orElseThrow(() -> new Exception("No salaries found."));
        System.out.println("Best game is " + bestGame.name);

        //ZADANIE 2 - https://www.samouczekprogramisty.pl/strumienie-w-jezyku-java/
        System.out.println("");
        System.out.println("Zadanie 2:");
        BoardGame min = games.stream()
                .reduce(BinaryOperator.minBy(Comparator.comparingDouble(game -> game.getPrice().doubleValue())))
                .get();

        System.out.println("Min: " + min.name + " -> price: " + min.getPrice());

        //ZADANIE 3 - https://www.samouczekprogramisty.pl/strumienie-w-jezyku-java/
        System.out.println("");
        System.out.println("Zadanie 3:");
        
    }





}
