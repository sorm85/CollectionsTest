package Collections;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfacesFunctionalExamples {

    public InterfacesFunctionalExamples () {
        predicateExample();
        supplierExample();
        consumerExample();
        functionExample();
    }

    protected void functionExample () {
        Function<String,Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                if (s.startsWith("s")){
                    return 50;
                } else {
                    return 58;
                }
            }
        };
        int resukt = function.apply("sadness");
        System.out.println(resukt);
    }
    protected void consumerExample () {
        Consumer <String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("se imprimió con el CONSUMER");
            }
        };
        consumer.accept("DDSR");
    }
    protected void supplierExample () {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "hola que tal";
            }

        };
        System.out.println(supplier.get());

    }
    protected void predicateExample () {
        Predicate <String> predicate =  new Predicate<String>(){
            @Override
            public boolean test(String str) {
                return str.startsWith("ddsr");
//                return false;
            }
        };
        System.out.println(predicate.test("ddsr2"));
    }

}
