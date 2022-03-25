package javalearning.ocpjavabook.practicetesting.overriding.objectclass;

import java.util.Objects;

public class A {
    int size;

    public A(int size) {
        this.size = size;
    }
    public A() {
        this(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return size == a.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
