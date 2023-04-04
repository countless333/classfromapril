package april3;

public class practice2 {

    public static void main(String[] args) {

   print p = new print();

   sync1 s1 = new sync1();
   sync2 s2 = new sync2();
   s1.setPrint(p);
        s2.setPrint(p);
        s2.start();
s1.start();

    }


}

class print {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void print1(int num) {
        this.setNum(num);
        for (int i = 1; i < num; i++) {

            System.out.println(i);
        }

    }

    public void print2(int num) {


        this.setNum(num);
        for (int i = num; i < num * 2; i++) {
            System.out.println(i);
        }
    }


}

class sync1 extends Thread {
    private print print;

    public april3.print getPrint() {
        return print;
    }

    public void setPrint(april3.print print) {
        this.print = print;
    }


    @Override
    public void run() {
        print.print1(10);

    }
}

class sync2 extends Thread {
    private print print;

    public april3.print getPrint() {
        return print;
    }

    public void setPrint(april3.print print) {
        this.print = print;
    }


    @Override
    public void run() {
        print.print2(20);

    }
}