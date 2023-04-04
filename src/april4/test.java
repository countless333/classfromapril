package april4;
/////// 369 1467 258 싱크로나이즈방법
public class test {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    public synchronized void printn3(int num) {
        this.setNum(num);

        for (; num <= 10; num++) {
            if (num % 3 == 2) {

                System.out.println(num + " ");
            }

        }


    }


    public synchronized void printn2(int num) {
        this.setNum(num);

        for (; num <= 10; num++) {
            if (num % 3 == 1) {

                System.out.println(num + " ");
            }

        }


    }

    public synchronized void printn1(int num) {

        this.setNum(num);

        for (; num <= 10; num++) {
            if (num % 3 == 0) {

                System.out.println(num + " ");
            }

        }


    }

    public static void main(String[] args) {

        test t = new test();
        test1 t1 = new test1();
        test2 t2 = new test2();
        test3 t3 = new test3();
        t1.setT(t);
        t2.setT(t);
        t3.setT(t);

        t1.start();
        t2.start();
        t3.start();


    }
}

class test1 extends Thread {

    private test t;

    public void setT(test t) {

        this.t = t;
    }

    @Override
    public void run() {

        t.printn1(1);
    }


}

class test2 extends Thread {

    private test t;

    public void setT(test t) {

        this.t = t;
    }

    @Override
    public void run() {

        t.printn2(1);
    }


}

class test3 extends Thread {

    private test t;

    public void setT(test t) {

        this.t = t;
    }

    @Override
    public void run() {

        t.printn3(1);
    }


}