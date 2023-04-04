package april3;

public class class1 {

    public static void main(String[] args) {


        PrintNumWithoutSync pns =
                new PrintNumWithoutSync();

        NonSyncThread1 nst1 = new NonSyncThread1();
        NonSyncThread2 nst2 = new NonSyncThread2();

        nst1.setPns(pns);
        nst2.setPns(pns);

//		nst1.getPns().setNum(10);
//		nst2.getPns().setNum(20);

        //동기화 되지 않은 객체의 변수는
        //첫 스레드가 선점해도
        //두 번째 스레드에서 값을 변경할 수 있어서
        //개발자가 의도한 결과 값과 다른 값이
        //나올 수 있는 문제가 발생
        //원하는 결과 : 1 ~ 10까지 출력
        //출력 결과 : 1 ~ 20까지 출력
        //선점한 스레드가 사용중일때는 다른 스레드에서
        //사용하지 못하게 잠금처리(동기화) 해줘야 한다.
        nst1.start();
        nst2.start();
    }
}
class PrintNumWithoutSync {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void printNum1(int num) {
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
        this.setNum(num);

        for (int i = this.num; i <= this.num * 2; i++) {
            System.out.println(i);
        }
    }
}

class NonSyncThread1 extends Thread {
    private PrintNumWithoutSync pns;

    public void setPns(PrintNumWithoutSync pns) {
        this.pns = pns;
    }

    public PrintNumWithoutSync getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum1(10);
    }
}



class NonSyncThread2 extends Thread {
    private PrintNumWithoutSync pns;

    public void setPns(PrintNumWithoutSync pns) {
        this.pns = pns;
    }

    public PrintNumWithoutSync getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum2(20);
    }
}


