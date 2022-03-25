package javalearning.ocpjavabook.practicetesting.collectionsfw.maps;

import java.util.Objects;

public class Emp {
    String name;

    Emp(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
