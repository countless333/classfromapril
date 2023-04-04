package april4;

import java.util.ArrayList;
import java.util.List;
/////// 369 1467 258 싱크로나이즈방법 내방법

public class practice11 {
    public static void main(String[] args) {
//
//369
//        1378
//                2
        ArrayList<Integer> a =new ArrayList<>();
        ArrayList<Integer> b =new ArrayList<>();

        ArrayList<Integer> c =new ArrayList<>();



        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
a.add(i);

//                int k = i;
//                Thread t = new Thread(() -> {
//                    System.out.println(k);
//                });
//                t.start();
//                try {
//                    t.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }


            } else if (i % 3 == 1) {
                b.add(i);
//                int g = i;
//                Thread t = new Thread(() -> {
//                    System.out.println(g);
//                });
//                t.start();
//                try {
//                    t.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }

            } else if (i % 3 == 2) {
                c.add(i);

//                int z = i;
//                Thread t = new Thread(() -> {
//                    System.out.println(z);
//                });
//                t.start();
//
//                try {
//                    t.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

  Thread aa = new Thread(()->{

      synchronized (a){
      for(int z :a){
          System.out.println(z);
      }}

  });
        Thread bb = new Thread(()->{
            synchronized (b){
            for(int z :b){
                System.out.println(z);
            }}

        });

        Thread cc = new Thread(()->{

            synchronized (c){
            for(int z :c){
                System.out.println(z);
            }}

        });

      aa.start();
      bb.start();
      cc.start();




    }




}

class everything{


    void print(List<Integer>a){

        for(int b:a){

            System.out.println(b);
        }



    }



}



