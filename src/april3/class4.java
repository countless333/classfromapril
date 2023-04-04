package april3;
//싱크로나이즈, 웨잇 노티파이
public class class4 {

    public static void main(String[] args) {



        PrintNumWithWaitNotify pns =
                new PrintNumWithWaitNotify();

        SyncThread11 t1 = new SyncThread11();
        SyncThread21 t2 = new SyncThread21();

        t1.setPns(pns);
        t2.setPns(pns);

        //t1 스레드가 공유 객체인 pns의 num을 선점했기 때문에
        //동기화 블록과 메소드를 통해서 선점한 스레드의 작업이
        //종료되기 전까지는 num을 사용할 수 없도록 잠금처리했고
        //그래서 num을 사용할 수 있는 t1의 작업종료때까지 대기
        t1.start();
        t2.start();
    }
}
class PrintNumWithWaitNotify {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    //동기화 메소드
    public synchronized void printNum1(int num) {
        this.setNum(num);

        for(int i = 1; i <= this.num; i++) {
            System.out.println("스레드1 - " + (i * 2 - 1));
            notify(); //다른 스레드를 실행 대기 상태로 변경
            //wait()가 호출되어 일시 정지 상태로
            //변경되기 전에 호출해야 된다.

            try {
                wait(); //자신을 일시 정지 상태로 변경
            } catch(InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

    public synchronized void printNum2(int num) {
        this.setNum(num);

        for(int i = 1; i <= this.num ; i++) {
            System.out.println("스레드2 - " + (i * 2));

            notify(); //다른 스레드를 실행 대기 상태로 변경
            //wait()가 호출되어 일시 정지 상태로
            //변경되기 전에 호출해야 된다.

            try {
                wait(); //자신을 일시 정지 상태로 변경
            } catch(InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}

class SyncThread11 extends Thread {
    private PrintNumWithWaitNotify pns;

    public void setPns(PrintNumWithWaitNotify pns) {
        this.pns = pns;
    }

    public PrintNumWithWaitNotify getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum1(90);
    }
}

class SyncThread21 extends Thread {
    private PrintNumWithWaitNotify pns;

    public void setPns(PrintNumWithWaitNotify pns) {
        this.pns = pns;
    }

    public PrintNumWithWaitNotify getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum2(10);
    }
}