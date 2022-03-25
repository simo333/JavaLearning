package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task7;

public class Task7 {
    public static boolean isPalindrome(String toCheck){
        int checkAmount = toCheck.length() / 2;
        char[] stringArr = toCheck.toCharArray();
        for(int i = 0; i < checkAmount; i++){
            if(stringArr[i] != stringArr[toCheck.length() - i - 1])
                return false;
        }
        return true;
    }
}
