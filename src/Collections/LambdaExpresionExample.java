package Collections;

import Collections.interfaces.SumExampleInterfaces;
import Collections.interfaces.TesterExampleInterface;

public class LambdaExpresionExample {



    public LambdaExpresionExample() {
        lambdaExpresionExample1();
        lambdaExpresionExample2();
    }
    protected void lambdaExpresionExample1 () {
        SumExampleInterfaces sumExampleInterfaces = (a, b) -> a + b;
        double suma = sumExampleInterfaces.testReturn(50,48);
        System.out.println(suma);
    }
    protected  void lambdaExpresionExample2 ( ) {
        String str = "5454545";
        TesterExampleInterface testerExampleInterface = (s) -> s.length() > 5;
        System.out.println(testerExampleInterface.compare(str));
    }
}

