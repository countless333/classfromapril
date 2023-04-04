package april3;

public class practice {
    public static void main(String[] args) {

        interrupt i = new interrupt();
        i.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        i.interrupt();


    }
}

class interrupt extends Thread{
    @Override
    public void run(){


        while(true){

            try {
                Thread.sleep(200);
                System.out.println("시작되고잇음");
            } catch (InterruptedException e) {
                e.getMessage();
                break;
            }

        }

    }



}