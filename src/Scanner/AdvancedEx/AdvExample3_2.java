package Scanner.AdvancedEx;

import java.util.Scanner;

public class AdvExample3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int value = 0;

        System.out.print("정수를 입력하세요 (-1을 입력하면 종료): ");

        // 아래의 while문을 축약할 수 있다
//        while (true) {
//            int value = input.nextInt();
//
//            if (value == -1) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//
//            sum += value;
//            count++;
//        }

        // 'value의 입력 값이 -1이 아닐때' 로 해석된다
        while ((value = input.nextInt()) != -1) {
            sum += value;
            count++;
        }
        double average = (double) sum / count;

        System.out.println("입력한 모든 정수의 합계 : " + sum);
        System.out.println("입력한 모든 정수의 평균 값 : " + average);
    }
}
