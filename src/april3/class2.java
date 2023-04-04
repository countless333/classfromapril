package april3;

public class class2 {

    public static void main(String[] args) {


        PrintNumWithSync pns =
                new PrintNumWithSync();

        SyncThread1 t1 = new SyncThread1();
        SyncThread2 t2 = new SyncThread2();

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

class PrintNumWithSync {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    //동기화 메소드


    public synchronized void printNum1(int num) {
        this.setNum(num);

        for (int i = 1; i <= this.num; i++) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

    public void printNum2(int num) {
        //동기화 블록 : 선점한 스레드의 작업이 끝날때까지 실행안되도록
        //동기화 블록 선언
        synchronized (this) {
            this.setNum(num);
        }

        for (int i = this.num; i <= this.num * 2; i++) {
            System.out.println(i);
        }
    }


}

class SyncThread1 extends Thread {
    private PrintNumWithSync pns;

    public void setPns(PrintNumWithSync pns) {
        this.pns = pns;
    }

    public PrintNumWithSync getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum1(10);
    }
}

class SyncThread2 extends Thread {
    private PrintNumWithSync pns;

    public void setPns(PrintNumWithSync pns) {
        this.pns = pns;
    }

    public PrintNumWithSync getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum2(20);
    }
}
