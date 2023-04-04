package april4;
///////////다시해볼것
public class zclass1 {
    public static void main(String[] args) {



action(()->{
    System.out.println(3+5);
    System.out.println(5+6);
});

action(()-> System.out.println(10+20));

    }

    public static void action(add add){
        add.add();

    }


}
@FunctionalInterface
interface add{
    public void add();

}
