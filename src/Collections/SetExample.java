package Collections;

import java.util.*;

public class SetExample {

    public HashSet set1 ;

    public SetExample () {

    }

    public void setTest1 () {
        set1  = new HashSet<String>();
        List<Integer> listTest = new ArrayList<>();


        Random random = new Random(100);
        int index = random.nextInt();
        Random random2 = new Random();
        for (int i = 0; i <100 ; i++) {
            listTest.add(random2.nextInt(1500));
        }
        listTest.stream().forEach(System.out::println);
        for (int i = 0; i < listTest.size(); i++) {
            set1.add(listTest.get(i));

        }

        set1.stream().forEach(System.out::println);
        System.out.println("Tamaño: "+listTest.size());
        System.out.println("Tamaño SET: "+set1.size());

    }
}
