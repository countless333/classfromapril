package april3;

public class practice10 {

    public static void main(String[] args) {
        stringdisplay sd = new stringdisplay();
        mythread[] mts = new mythread[5];
        for(int i=0;i<mts.length;i++){

            mts[i] = new mythread(sd,Integer.toString(i));
            mts[i].start();
        }


    }
}


class stringdisplay{
    void display(String a){
        for(int i=0;i<5;i++){
            System.out.print(a);

        }
        System.out.println("");
    }
}

class mythread extends Thread{
    stringdisplay sd;
    String  s = "";
    public mythread(stringdisplay sd, String s){
        this.sd = sd;
        this.s = s;

    }

    @Override
    public void run(){
        sd.display(s);

    }

}
