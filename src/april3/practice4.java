package april3;

import java.util.concurrent.TimeUnit;

public class practice4 {

    private static boolean Main;



    public static void main(String[] args) throws  InterruptedException {

        System.out.println(Main);
        Thread back = new Thread(()->{
    int i=0;
    while(!Main){
        System.out.println("아후");
        i++;
    }


});
back.start();
        TimeUnit.SECONDS.sleep(1);
        Main = true;

    }
}
