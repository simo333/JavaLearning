package javalearning.ocpjavabook.practicetesting.exceptions.customexceptions;

public class LoginException extends Exception{
    public LoginException(){
        super();
    }
    public LoginException(String message){
        super(message);
    }
}
