package april3;
/// 인터럽트로 스레드 끄는법
public class class6 {

    public static void main(String[] args) {
        interrupted i = new interrupted();
        i.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();

        }
i.interrupt();

    }
}


class interrupted extends Thread {

    @Override
    public void run() {


        while(true){

            System.out.println("스레드 실행됨");


            if(Thread.interrupted()){
                break;
            }

        }

//////////////////////스레드를 종료하는 두가지 방법
//        try {
//
//
//            while (true) {
//                Thread.sleep(1);
////interrupt가 발생했는지를 확인해주는 메소드를 사용해서도 스레드를 종료할 수 있다.
//
//
//                System.out.println("스레드 실행됨");
//            }
//
//
//        } catch (InterruptedException e) {
//
//
//            System.out.println(e.getMessage());
//            System.out.println("쓰레드 종료");
//
//        }


    }


}



//입출력 파일 람다 스트림 데본스레드
//자바 끝나고 오라클
