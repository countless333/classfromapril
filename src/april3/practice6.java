package april3;

public class practice6 {

    public static void main(String[] args) {

aa r = new aa();

Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
t1.start();
t2.start();





    }
}

class account2{
    int balance = 1000;
    public  void withdrawl(int money){
synchronized (this){
        if(balance>=money){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {


            }
balance-=money;


        }

    }}

}
class aa implements Runnable{
    account2 ac = new account2();

    @Override
    public void run(){

        while(ac.balance>0){


            int money = 50;
            ac.withdrawl(money);
            System.out.println("balance = " + ac.balance );
        }

    }


}
