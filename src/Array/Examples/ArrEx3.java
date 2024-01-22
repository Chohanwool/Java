package Array.Examples;

import java.util.Scanner;

public class ArrEx3 {
    public static void main(String[] args) {
        // 5개의 정수를 입력 받고 역순으로 출력
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("정수 5개를 입력해주세요 : ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        for(int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }
    }
}
