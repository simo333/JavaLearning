package javalearning.samouczekprogramisty.intermediate.trywithresources;

public class HtmlTag implements AutoCloseable{
    private String tag;

    public HtmlTag(String tag) {
        this.tag = tag;
        System.out.println("<" + tag + ">");
    }

    public void setBodyTag(String text){
        System.out.println(text);
    }

    @Override
    public void close() throws Exception {
        System.out.println("</" + tag + ">");
    }
}
