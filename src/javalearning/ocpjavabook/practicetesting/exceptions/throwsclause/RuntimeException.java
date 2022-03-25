package javalearning.ocpjavabook.practicetesting.exceptions.throwsclause;

public class RuntimeException {
    public void readFile(String file){
        if(file == null)
            throw new NullPointerException();
        else System.out.println("Reading file");
    }
}
