package Scanner.AdvancedEx;

import java.util.Scanner;

public class AdvExample1_1 {
    public static void main(String[] args) {
        // 두 수를 입력 받고 두 수 사이의 모든 정수를 오름차순으로 출력
            // 이때 첫번째 수가 두번째 수보다 클 경우 두 수의 값을 서로 교환
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = input.nextInt();

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // 방법1 : for문으로 하나씩 출력
        System.out.print("두 숫자 사이의 모든 정수 : ");
        for(int i = num1; i <= num2; i++){
//            if(i == num2){
//                System.out.print(i);
//            } else {
//                System.out.print(i + ", ");
//            }
            System.out.print(i);
            if( i != num2){
                System.out.print(", ");
            }
        }

    }
}
