package april4;

public class practice {



    public static void main(String[] args) {




        testk t = new testk();

        thr1 t1 = new thr1();
        thr2 t2 = new thr2();
        thr3 t3 = new thr3();

        t1.setTesk(t);
        t2.setTesk(t);
        t3.setTesk(t);
t1.start();

        t2.start();

        t3.start();

    }
}


class testk{
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;


    public synchronized  void print1(int num){
        this.setNum(num);
        for(int i = num; i<=10;i++){

            if(i%3==0){
                System.out.println(i);}        }


    }

    public synchronized  void print2(int num){
        this.setNum(num);
        for(int i = num; i<=10;i++){
            if(i%3==1){
                System.out.println(i);}
        }


    }

    public synchronized  void print3(int num){
        this.setNum(num);
        for(int i = num; i<=10;i++){
if(i%3==2){
            System.out.println(i);}
        }


    }



}

class thr1 extends Thread{
    public testk getTesk() {
        return tesk;
    }

    public void setTesk(testk tesk) {
        this.tesk = tesk;
    }

    private testk tesk;

    @Override
    public void run(){

        tesk.print1(1);

    }

   }class thr3 extends Thread {
    public testk getTesk() {
        return tesk;
    }

    public void setTesk(testk tesk) {
        this.tesk = tesk;
    }

    private testk tesk;

    @Override
    public void run() {

        tesk.print3(1);

    }


}
class thr2 extends Thread {
    public testk getTesk() {
        return tesk;
    }

    public void setTesk(testk tesk) {
        this.tesk = tesk;
    }

    private testk tesk;

    @Override
    public void run() {

        tesk.print2(1);

    }


}