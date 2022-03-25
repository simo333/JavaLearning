package javalearning.samouczekprogramisty.basics.enums;

public enum TestEnum1 {
    S {
        public int value = 3;

        @Override
        public int getValue() {
            return value;
        }
    }, M {
        @Override
        public int getValue() {
            return 0;
        }
    }, L {
        @Override
        public int getValue() {
            return 0;
        }
    }, XL {
        @Override
        public int getValue() {
            return 0;
        }
    };


    public abstract int getValue();



}
