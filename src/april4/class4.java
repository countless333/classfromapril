package april4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class class4 {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);


        printthread t1 = new printthread();
        printthread t2 = new printthread();

        t1.setTname("스레드 1번");
        t2.setTname("스레드 2번");

        for(int i = 0;i<10;i++){
            es.execute(t1);
            es.execute(t2);

            if(i>8){

                es.shutdownNow();
                //break;
            }

        }
    }
}


class printthread extends Thread{
    public void setTname(String tname) {
        this.tname = tname;
    }

    public String tname;

    @Override
    public void run(){

        System.out.println(tname + "작업 진행");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(tname + "shutdown now 호출");
        }

    }

}
