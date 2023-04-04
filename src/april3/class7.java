package april3;

public class class7 {

    public static void main(String[] args) {

        System.out.println("현재 대출한 책의 갯수 " + library.student.getBookcount());

        borrowthread b = new borrowthread();
        returnthread r = new returnthread();

//        b.setPriority(10);
        r.start();

        b.start();
//        try {
//            b.join();
//            r.join();
//        } catch (InterruptedException e) {
//
//
//        }

    }
}

class student{
    public int getBookcount() {
        return bookcount;
    }

    public void setBookcount(int bookcount) {
        this.bookcount = bookcount;
    }

    int bookcount = 5;


    public synchronized void borrowbook() throws InterruptedException{
        int m = bookcount;
        Thread.sleep(1000);
        bookcount = m+1;
        System.out.println("대출완료");

    }

    public  synchronized  void returnbook() throws InterruptedException{
        int m = bookcount;
        Thread.sleep(1000);
        bookcount = m-1;
        System.out.println("반납완료");

    }

}
class library{
    public static student student = new student();


}

class borrowthread extends  Thread{
    @Override
    public   void run(){
        try {
            library.student.borrowbook();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(
                "학생이 빌린 총 책의 갯수 : " + library.student.getBookcount());


    }



}

class returnthread extends Thread{


    public    void   run(){
        try {
            library.student.returnbook();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(
                "학생이 빌린 총 책의 갯수 : " + library.student.getBookcount());


    }


}