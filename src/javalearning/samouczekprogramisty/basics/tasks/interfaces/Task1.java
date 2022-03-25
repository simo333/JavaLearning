package javalearning.samouczekprogramisty.basics.tasks.interfaces;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5);
        figures[1] = new Triangle(5, 3);
        figures[2] = new Rectangle(10, 5);

        Arrays.stream(figures).forEach(n -> {
            System.out.println("Figure type - " + n.getFigureType().toUpperCase() + ":");
            System.out.println("* perimeter = " + BigDecimal.valueOf(n.getPerimeter())
                    .setScale(2, RoundingMode.HALF_UP));
            System.out.println("* area = " + BigDecimal.valueOf(n.getArea())
                    .setScale(2, RoundingMode.HALF_UP));
        });
    }
}
