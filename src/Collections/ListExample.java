package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ListExample {

    public  List<Integer> arrayList = new ArrayList<>();
    public Vector <String> vectorList = new Vector<>();
    public ListExample () {
//        setListArray();
//        setVectorList();

    }

    public void setListArray() {
        Random random = new Random();
        Integer listNumberLengt = random.nextInt(50);

        for (int i = 0; i < listNumberLengt ; i++) {
            arrayList.add(random.nextInt());
        }
         arrayList.stream().forEach(System.out::println);
        System.out.println("setListArray finish: "+listNumberLengt);
    }
    public void setVectorList () {
        Random random = new Random();
        Integer listNumberLengt = random.nextInt(50);

        for (int i = 0; i < listNumberLengt ; i++) {
//            String str =;
            vectorList.add( Integer.toString(random.nextInt()));
        }
        vectorList.stream().forEach(System.out::println);
        System.out.println("setVectorList finish: "+listNumberLengt);
    }
}
