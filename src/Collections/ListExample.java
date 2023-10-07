package Collections;

import java.util.*;

public class ListExample {

    public  List<String> arrayList = new ArrayList<>();
    public Vector <String> vectorList = new Vector<>();
    public LinkedList <String> linkedList = new LinkedList<>();
    public ListExample () {
//        setListArray();
//        setVectorList();

    }

    public void setListArray() {
        Random random = new Random();
        Integer listNumberLengt = random.nextInt(50);

        for (int i = 0; i < listNumberLengt ; i++) {
            arrayList.add( Integer.toString(random.nextInt()));
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

    public void setLinkedList () {
        linkedList.add("A");           // Agrega al final
        linkedList.addFirst("Inicio"); // Agrega al principio
        linkedList.addLast("Final");   // Agrega al final
        linkedList.add(1, "B");        // Agrega en la posición 1
        linkedList.stream().forEach(System.out::println);
    }

    public List<Integer> setListExample1 (List <Integer> list) {
        List <Integer> returnList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if(!returnList.contains(list.get(i))){
                System.out.println("no está: "+list.get(i));
                returnList.add(list.get(i));
            } else {
                System.out.println("si están");
            }
        }

        return returnList;
    }
}
