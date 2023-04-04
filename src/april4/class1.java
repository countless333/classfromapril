package april4;

public class class1 extends Thread {
    public void save() {

        System.out.println("자동저장");
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }

            save();


        }


    }

    public static void main(String[] args) {

class1 c = new class1();
c.setDaemon(true);
c.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//메인스레드가 끝나는 순간 데몬스레드도 종료되게 됨.

        System.out.println("메인 스레드 종료됨");
        System.out.println("데몬 스레드인 autosave도 자동으로 종료됨");



/////////////////질문......... 왜 슬립 끄면 데몬도 안켜져??



    }

}
