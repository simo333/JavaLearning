package javalearning.samouczekprogramisty.intermediate.streams.task2;

import javalearning.ocpjavabook.practicetesting.streams.BoardGame;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Task2 {
    public static void main(String[] args) {
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
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.98"), 2, 4)
        );

        System.out.println(getMin(games, Comparator.comparing(BoardGame::getPrice)).getName());

        boolean isAllAbove50Price = games.stream()
                .allMatch(n -> n.getPrice().compareTo(BigDecimal.valueOf(50)) > 0);
        System.out.println(isAllAbove50Price);

        boolean isAnyAbove300Price = games.stream()
                .anyMatch(g -> g.getPrice().compareTo(BigDecimal.valueOf(300)) > 0);
        System.out.println(isAnyAbove300Price);


    }
    public static <T> T getMin(List<T> list, Comparator<? super T> comparator) {
        return list.stream()
                .reduce(BinaryOperator.minBy(comparator))
                .orElseThrow();
    }
}
