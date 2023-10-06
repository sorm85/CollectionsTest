import Collections.ListExample;

import java.util.Random;

public class ControllerCollection {
    
    public ListExample listExample;
    public ControllerCollection () {
        listExample = new ListExample();
//        testThread1();
        testThread2();
    }
    
    public void testThread1 () {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                Integer listNumberLengt = random.nextInt(50);

                for (int i = 0; i < listNumberLengt ; i++) {
                    listExample.arrayList.add(random.nextInt(50));
                }
                listExample.arrayList.stream().forEach(elemento -> System.out.println("thread1: "+elemento));
                System.out.println("setListArray finish: "+listNumberLengt);

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                Integer listNumberLengt = random.nextInt(50);

                for (int i = 0; i < listNumberLengt ; i++) {
                    listExample.arrayList.add(random.nextInt(50));
                }
//                listExample.arrayList.stream().forEach(System.out::println);
                listExample.arrayList.stream().forEach(elemento -> System.out.println("thread2: "+elemento));
                System.out.println("setListArray finish: "+listNumberLengt);

            }
        });
        thread1.start();
        thread2.start();
    }
    public void testThread2 () {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                String name = "vectorList1";
                Integer listNumberLengt = random.nextInt(50);
                System.out.println("START LENGTH "+name+" "+listNumberLengt);


                for (int i = 0; i < listNumberLengt ; i++) {
                    listExample.vectorList.add(name+": "+ Integer.toString(random.nextInt(50)));
                }
//                listExample.arrayList.stream().forEach(System.out::println);
//                listExample.vectorList.stream().forEach(elemento -> System.out.println("vectorList thread2: "+elemento));
                System.out.println(name+": "+listNumberLengt);

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                String name = "vectorList2";
                Integer listNumberLengt = random.nextInt(50);
                System.out.println("START LENGTH "+name+" "+listNumberLengt);
                for (int i = 0; i < listNumberLengt ; i++) {
                    listExample.vectorList.add(name+": "+ Integer.toString(random.nextInt(50)));
                }
                listExample.vectorList.stream().forEach(System.out::println);
//                listExample.vectorList.stream().forEach(elemento -> System.out.println("vectorList thread2: "+elemento));
                System.out.println(name+": "+listNumberLengt);

            }
        });
        thread1.start();
        thread2.start();

        System.out.println("FINAL");
        listExample.vectorList.stream().forEach(System.out::println);

    }
}
