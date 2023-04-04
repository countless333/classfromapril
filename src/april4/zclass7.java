package april4;





///// 입력받아서 문장 검사


import java.util.Scanner;
////문자열 두개를 입력받아서 검사하는 람다함수
public class zclass7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 문자열을 입력하세요: ");
        String str1 = scanner.nextLine();

        System.out.println("두 번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();

        action((a, b) -> a.equals(b), str1, str2);
    }

    public static void action(compareStrr cs, String str1, String str2) {
        boolean result = cs.comparetwostr(str1, str2);
        System.out.println("결과는 " + result);
    }
}

interface compareStrr {
    boolean comparetwostr(String a, String b);
}