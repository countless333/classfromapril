package april3;
//// 스레드 동기화 예제
public class practice3 {

    public static void main(String[] args) {
runnablethread1 r = new runnablethread1();
new Thread(r).start();
new Thread(r).start();

    }
}
class account{
    private int balance = 1000;

    public   int getBalance(){
        return balance;
    }

    public   void withdraw(int money){

        if(balance>=money){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-=money;

        }
    }


}

class runnablethread1 implements  Runnable {
    account acc = new account();

    @Override
    public  void run(){

        while(acc.getBalance()>0){

            int money = 50;
            acc.withdraw(money);
            System.out.println("balance = " + acc.getBalance());
        }


    }



}