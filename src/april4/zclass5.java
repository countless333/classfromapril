package april4;

public class zclass5 {
    public static void main(String[] args) {


action(String::toUpperCase);
    }


    public static void action(uppercaseinter uci) {

        String result = uci.alluppercase("bit");

        System.out.println(result);


    }


}

interface uppercaseinter {
    public String alluppercase(String a);
}





