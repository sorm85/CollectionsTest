package Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExampleClass {
    public Map map1, map2, map3, map4;

    public MapExampleClass() {


    }

    public void setMap1 () {
        map1 = new HashMap<String,Integer>();
        map1.put("ddsr",50);
        map1.put("ddsr1",50);
        map1.put("ddsr2",50);
        map1.put("ddsr3",50);
        map1.put("ddsr4",50);
        map1.put("ddsr5",50);
        map1.put("ddsr6",50);
        map1.put("ddsr7",50);

//        = new ArrayList<>();
        Stream<String> keyStream = map1.keySet().stream();
        keyStream.forEach(System.out::println);

        Stream<Integer> valueStream = map1.values().stream();
//        valueStream.forEach(System.out::println);
        List <Integer> ddsr = valueStream.collect(Collectors.toList());
        ddsr.stream().forEach(System.out::println);

    }
    public void setMap2 (List <Integer> listMap) {
        List<Integer> factura = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,7,8,5,5,5,8,7,4,21,24));
//        List<Integer> factura2 = listExample.setListExample1(factura);
        List<Integer> factura2 = listMap;
        factura2.stream().forEach(System.out::println);
        Hashtable<String,Integer> hashExample = new Hashtable<>();
    }
}
