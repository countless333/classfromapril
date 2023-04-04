package april3;

import java.util.concurrent.TimeUnit;

public class practice5 {

    public static boolean stop= false;

    public static synchronized boolean isStop(){

        return stop;
    }


    public static synchronized  void change(boolean value){

        stop = value;

    }

    public static void main(String[] args) {


    Thread t = new Thread(()->{
        int i=0;
       while(!isStop()){
           i++;
       }


    });

        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


change(true);

    }



}
