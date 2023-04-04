package april3;

public class practice9 {

    public static void main(String[] args) {


        System.out.println("현재 책의 수 "+librarys.student.getBook());
        returnth r = new returnth();
        borrowth b = new borrowth();
        b.start();
        r.start();


    }
}

class students{
    private int book = 100;

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public synchronized  void borrowbook(){
this.book = this.book+1;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("책빌린다" + this.getBook());

    }

    public synchronized void returnbook(){
        this.book = this.book-1;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("책돌려준다" + this.getBook());

    }

}

class librarys {
    public static students student = new students();
}
class borrowth extends  Thread{
    @Override
    public void run(){
        librarys.student.borrowbook();


    }


}

class returnth extends  Thread{
    @Override
    public void run(){
        librarys.student.returnbook();


    }


}