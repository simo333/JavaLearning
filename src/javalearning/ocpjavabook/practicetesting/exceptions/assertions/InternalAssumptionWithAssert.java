package javalearning.ocpjavabook.practicetesting.exceptions.assertions;

public class InternalAssumptionWithAssert {
    public void machineState(State state) {
        switch(state) {
            case ON:
                System.out.println("state is ON");
                break;
            case OFF:
                System.out.println("state is OFF");
                break;
            default: assert false;
        }
    }
}
