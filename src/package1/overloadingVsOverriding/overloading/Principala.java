package package1.overloadingVsOverriding.overloading;

import package1.overloadingVsOverriding.overloading.Calculator;

public class Principala {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.aduna();
        calculator.aduna(12);
        calculator.aduna(1,2);
        calculator.aduna(1,2,3);
    }
}
