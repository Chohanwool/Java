package Scanner.Example;

import java.util.Scanner;

public class ScExample {
    public static void main(String[] args) {
//        두 수를 입력받아 더 큰수를 판별하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int greaterNum = (num1 > num2) ? num1 : num2;
        System.out.println("입력한 두 수 중 더 큰 수는 " + greaterNum);
    }
}
