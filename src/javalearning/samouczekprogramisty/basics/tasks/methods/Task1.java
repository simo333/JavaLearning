package javalearning.samouczekprogramisty.basics.tasks.methods;

import java.time.LocalDateTime;
import java.time.Month;


public class Task1 {
    public static void main(String[] args) {
        LocalDateTime myBirthDay = LocalDateTime.of(2000, Month.MAY, 1, 0, 0);
        System.out.println("Your age is: " + computeYourAge(myBirthDay));
    }

    static int computeYourAge(LocalDateTime dateOfBirth){
        if(LocalDateTime.now().getDayOfYear() < dateOfBirth.getDayOfYear())
            return LocalDateTime.now().minusYears(dateOfBirth.getYear()).getYear() - 1;
        return LocalDateTime.now().minusYears(dateOfBirth.getYear()).getYear();
    }
}
