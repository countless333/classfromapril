package april4;

public class class5 {
    public static void main(String[] args) {
//함수형 인터페이스는 추상메소드 하나만 가질 수 있기 때문에
        //매개변수를 람다식을 이용해 메소드 코드블록처럼 전송하게 되면
        //함수형 인터페이스에서 추상메소드의 구현부 인식하게되고
        //함수형 인터페이스의 추상메소드 action메소드에서 호출하게 되면
        //구현된 추상메소드를 사용할 수 있다.

action((a,b)->{
    int result = a+b;
    System.out.println(result);

});



    }

public static void action(calculator calc){
        int a = 10;
        int b = 4;
        calc.calculate(a,b);
}
}

@FunctionalInterface// 함수형 인터페이스를 보장
    //추상메소드를 하나만 가질수 있는 인터페이스
//컴파일 과정에서 추상메소드가 하나인지를 검사


interface  calculator{
    void calculate(int a, int b);

}