package Scanner.AdvancedEx;

import java.util.Scanner;

public class AdvExample3_1 {
    public static void main(String[] args) {
        // 입력받은 모든 수의 합계와 평균을 출력하는 프로그램
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.print("정수를 입력하세요 (-1을 입력하면 종료): ");
        while (true) {
            int value = input.nextInt();

            if (value == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += value;
            count++;
        }
        double average = (double) sum / count;

        System.out.println("입력한 모든 정수의 합계 : " + sum);
        System.out.println("입력한 모든 정수의 평균 값 : " + average);
    }
}
