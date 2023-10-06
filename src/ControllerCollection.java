import Collections.ListExample;
import Collections.SetExample;

import java.util.Random;

public class ControllerCollection {
    
    public ListExample listExample;
    public SetExample setExample;
    public Thread thread1,thread2,thread3,thread4;
    public ControllerCollection () {
        listExample = new ListExample();
        setExample = new SetExample();
//        testThread1();
//        testThread2();
//        listExample.setLinkedList();
        setExample.setTest1();


    }
    
    public void testThread1 () {
        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                String name = "List1";
                Integer listNumberLengt = random.nextInt(50);

                for (int i = 0; i < listNumberLengt ; i++) {
                    listExample.arrayList.add(name+": "+ Integer.toString(random.nextInt(50)));
                }
//                listExample.arrayList.stream().forEach(elemento -> System.out.println("thread1: "+elemento));
//                System.out.println("setListArray finish: "+listNumberLengt);

            }
        });
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                String name = "List2";
                Integer listNumberLengt = random.nextInt(50);

                for (int i = 0; i < listNumberLengt ; i++) {
                    listExample.arrayList.add(name+": "+ Integer.toString(random.nextInt(50)));
                }
//                listExample.arrayList.stream().forEach(System.out::println);
//                listExample.arrayList.stream().forEach(elemento -> System.out.println("thread2: "+elemento));
//                System.out.println("setListArray finish: "+listNumberLengt);

            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("mexicana: "+listExample.arrayList);


    }
    public void testThread2 () {
        thread3 = new Thread(new Runnable() {
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
        thread4 = new Thread(new Runnable() {
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
        thread3.start();
        thread4.start();
        while(thread4.isAlive()){
            System.out.println("mexicana: "+listExample.vectorList);
        }
        System.out.println("FINAL");
//        listExample.vectorList.stream().forEach(System.out::println);

    }
    public void testThreadLinked3 () {
        thread3 = new Thread(new Runnable() {
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
        thread4 = new Thread(new Runnable() {
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
        thread3.start();
        thread4.start();
        while(thread4.isAlive()){
            System.out.println("mexicana: "+listExample.vectorList);
        }
        System.out.println("FINAL");
//        listExample.vectorList.stream().forEach(System.out::println);


    }


}
