package javalearning.ocpjavabook.practicetesting.nio2.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingDirsFiles {
    private Path path;
    private final Path basePath;
    private Path actualPathLocation;

    CreatingDirsFiles(Path path) {
        this.path = path;
        this.actualPathLocation = this.path;
        this.basePath = path;
        try {
            if(!Files.exists(path))
                Files.createDirectory(path);
        }
        catch (IOException ioe){
            System.out.println("Setting base directory failed.");
        }
        System.out.println("Base path set to: " + this.path);
    }

    //creating methods
    public void createDir(Path dir) {
        try {
            path = Paths.get(path.toString(), dir.toString());
            if(!Files.exists(path))
                Files.createDirectories(path);
            System.out.println("Created directory: " + path );
        }
        catch (IOException ioe) {
            System.out.println("IO Exception");
        }
    }
    public void createFile(String fileName){
        try {
            Path newFile = Paths.get(actualPathLocation.toString(), fileName.toString());
            if(!Files.exists(newFile)) {
                Files.createFile(newFile);
                System.out.println("File created - " + fileName);
            }

        } catch (IOException ioe) {
            System.out.println("File could not be created.");
        }
    }

    //deleting methods
    public void deleteDir(Path pathToDelete){
        try {
            Path path = Paths.get(actualPathLocation.toString(), pathToDelete.toString());
            if (Files.exists(path)) {
                Files.delete(path);
                System.out.println("Successfully deleted.");
            }
        } catch (IOException ioe) {
            System.out.println("No such directory.");
        }
    }

    //moving methods
    public void moveToDir(Path dir) {
        Path newDir = Paths.get(actualPathLocation.toString(), dir.toString());
        if(Files.exists(newDir)) {
            actualPathLocation = Paths.get(actualPathLocation.toString(), dir.toString());
            System.out.println("Moved to: " + actualPathLocation);
        }
        else if(!Files.exists(newDir)){
            System.out.println("No such directory.");
        }
    }
    public void back(){
        actualPathLocation = Paths.get(actualPathLocation.toString(),"..");
        actualPathLocation.normalize();
        System.out.println("You moved back. Now you are here: " + actualPathLocation);
    }
    public void backToRoot(){
        actualPathLocation = Paths.get(actualPathLocation.getRoot().toString());
        actualPathLocation.normalize();
        System.out.println("You moved back. Now you are here: " + actualPathLocation);
    }
    public void backToBase(){
        actualPathLocation = basePath;
        System.out.println("You moved back to your base directory. You are here: " + actualPathLocation);
    }




}
