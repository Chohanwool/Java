package Array.Examples;

import java.util.Scanner;

public class ArrEx4_1 {
    public static void main(String[] args) {
        // 입력 받을 숫자의 개수를 입력 받아서 이들의 합계와 평균 출력
        Scanner input = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int count = input.nextInt();
        int[] numbers = new int[count];

        System.out.println("정수 " + count + "개를 입력해주세요 : ");

        int total = 0;
        double average;

        for(int i = 0; i < count; i++){
            numbers[i] = input.nextInt();
            total += numbers[i];
        }
        average = (double)total / count;

        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
