package april4;

public class zclass6 {

    public static void main(String[] args) {

action((a,b)->a.equals(b)


);


    }

    public static void action(compareStr cs){




      String str1 = "hello";
      String str2 = "hello";
      boolean result = cs.comparetwostr(str1,str2);
        System.out.println("결과는" + result);
    }
}

interface  compareStr{

    boolean comparetwostr(String a, String b);

}
