package javalearning.ocpjavabook.practicetesting.exceptions.customexceptions;

public class UserActivity {
    public void login(String user, String pwd) throws LoginException {
        if (!findInDatabase(user,pwd))
            throw new LoginException("Invalid username or password");
    }

    private boolean findInDatabase(String user, String pwd){
        return false;
    }
}
