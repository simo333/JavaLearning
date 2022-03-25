package javalearning.samouczekprogramisty.basics.conditionsandloops;

public class Task3 {
    public static void main(String[] args) {
        //Method 1
        System.out.println("Method 1:");
        for(int i = -10; i<=40; i++){
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
        //Method 2
        System.out.println("Method 2:");
        for(int i = -9; i<=40; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
