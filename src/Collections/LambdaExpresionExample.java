package Collections;

import Collections.interfaces.SumExampleInterfaces;

public class LambdaExpresionExample {

    SumExampleInterfaces sumExampleInterfaces = (a, b) -> a + b;

    public LambdaExpresionExample() {
        double suma = sumExampleInterfaces.testReturn(50,48);
        System.out.println(suma);
    }
}

