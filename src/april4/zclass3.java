package april4;

public class zclass3 {
    public static void main(String[] args) {

        action((a,b)->{
            String returnstr = b.concat(a);
            return returnstr;

        });
action2((a,b,c)->{

    String newstr = a+b;
    return newstr.indexOf(c);
});
//or action2((a,b,c) -> a.concat(b).indexOf(c));


//        action2((a,b,c)->{
//            String str = a+b;
//            for(int i=0;i<str.length();i++){
//
//                if(c==str.charAt(i)){
//
//                    index=1;
//                }
//            }
//
//        })
    }

public static void action(customstring cs){

        String   resultStr = cs.concat("bit","naver");
    System.out.println(resultStr);
}

public static void action2(customstring2 cs){
        int index = cs.indexOf("google","microsoft",'f');
    System.out.println(index);

}



}


interface customstring{
String concat(String a, String b);


}

interface  customstring2{

    int indexOf(String a, String b, char c);
}