package javalearning.ocpjavabook.practicetesting.overriding.objectclass;

import java.util.Objects;

public class MyNumber {
    long number;

    public MyNumber(long number) {
        this.number = number;
    }
    public MyNumber() {
        this(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNumber myNumber = (MyNumber) o;
        return number == myNumber.number;
    }

    @Override
    public int hashCode() {
        int sum = 0;
        long num = number;
        do {
            sum += num % 10;
            num /= 10;
        }
        while(num != 0);
        return sum;
    }
}
