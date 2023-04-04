package april4;
///////////////여기 좀 어려움 다시해불것
public class zclass2 {
    public static void main(String[] args) {

mulanddiv mad = new mulanddiv();
mad.action1((a)-> System.out.println(a*a));
mad.action2((a,b)->System.out.println(a/b));


    }


}

class mulanddiv{
    public void action1(mul mul){

        int a=10;
        mul.multiply(a);
        System.out.println();
    }

    public void action2(div div){

        int a = 10;
        int b = 5;
        div.divide(a,b);
    }

}
interface div{

    void divide(int a, int b);
}

interface  mul{

    void multiply(int a);
}