package april3;
///쓰레드를 끄는 방법

public class class5 {


    public static void main(String[] args) {

        whilethread w = new whilethread();
        w.start();

        try {

            //메인 스레드 1초동안 일시정지
            //whilethread  가 1초 반복 실행

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
w.setStop(true);

    }
}
class whilethread extends Thread{
    private boolean stop = false;

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run(){
        while(!stop){
            System.out.println("스레드 실행됨");

        }
        System.out.println("스레드 종료됨");





    }






}