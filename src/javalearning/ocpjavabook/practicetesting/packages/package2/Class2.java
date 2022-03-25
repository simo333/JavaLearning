package javalearning.ocpjavabook.practicetesting.packages.package2;

import javalearning.ocpjavabook.practicetesting.packages.package1.Class1;

class Class2 extends Class1 {
    Class2() {
        Class1 cls1 = new Class1(); //line 1
        name = "Derived"; //line 2
        System.out.println(name); //line 3
    }
}
