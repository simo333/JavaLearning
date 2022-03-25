package javalearning.samouczekprogramisty.intermediate.trywithresources;

public class HtmlEditor {
    public static void main(String[] args) {
        try (
            HtmlTag h1 = new HtmlTag("h1");
            HtmlTag body = new HtmlTag("body");
            HtmlTag title = new HtmlTag("title");
        ){
            title.setBodyTag("The title of something of this title");
        } catch (Exception e) {
            System.err.println("ERROR - 404");
            e.printStackTrace();
        }
    }
}
