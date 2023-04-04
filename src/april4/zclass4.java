package april4;

public class zclass4 {

    public static void main(String[] args) {

action(moneyconvertor::convert);

        action(moneyconvertor::instanceconvert);


    }

    public static void action(convertor con){

        int result = con.conv(10000,'$');
        System.out.println("변환된 돈 :  $" + result);

    }
}


class  moneyconvertor{
    public static int convert(int money, char c){

        int convertmoney = 0;
        switch(c){
            case'$':
            convertmoney = money/1300;
            break;


            case'\\':
                convertmoney = money *1300;
                break;

            default:
                convertmoney =-1;
                break;
        }
        return convertmoney;
    }


    public static int instanceconvert(int money, char c){



            int convertmoney = 0;
            switch(c){
                case'$':
                    convertmoney = money/1300;
                    break;


                case'\\':
                    convertmoney = money *1300;
                    break;

                default:
                    convertmoney =-1;
                    break;
            }
            return convertmoney;









}}


interface  convertor{
    int conv(int a, char c);


}