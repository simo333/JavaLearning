package javalearning.ocpjavabook.practicetesting.iofundamentals.console;

import java.io.Console;
import java.io.File;
import java.io.PrintWriter;

public class FromConsoleToFile {
    public static void main(String args[]) throws Exception {
        try (PrintWriter pw = new PrintWriter(
                new File("login-credentials.txt"));) {
            Console console = System.console();
            String username = console.readLine("Username:");
            //String pwd = console.readPassword("Password:");
            pw.println(username);
            //pw.println(pwd);
            pw.flush();
        }
    }
}
