package javalearning.ocpjavabook.practicetesting.designpattern.abstractfactory;

public class ClientAbstractFactoryMethod {
    public static void main(String[] args) {
        AppFactory factory1 = new WordAppFactory();
        App app1 = factory1.getAppInstance();
        Font font1 = factory1.getFontInstance();
        System.out.println(app1 + ":" + font1);

        AppFactory factory2 = new TextEditAppFactory();
        App app2 = factory2.getAppInstance();
        Font font2 = factory2.getFontInstance();
        System.out.println(app2 + ":" + font2);
    }
}

