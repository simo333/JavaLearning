package javalearning.samouczekprogramisty.basics.tasks.methods;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getName("SzymonPoniedziałek"));
        System.out.println(getName("Szymon Poniedziałek"));
    }

    static String getName(String totalName){
        char[] nameArr = totalName.toCharArray();
        for(int i = 1; i < nameArr.length; i++) {
            if(Character.isUpperCase(nameArr[i]))
                return String.valueOf(nameArr).substring(0, i).replaceAll("\\s", "");
        }
        throw new IllegalArgumentException("Cannot find a name.");
    }
}
