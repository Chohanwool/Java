package Scanner.AdvancedEx;

import java.util.Scanner;

public class AdvExample1_2 {
    public static void main(String[] args) {
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
        //  방법2 : 문자열 numList 생성 --> num1부터 문자열 변환 후 numList에 담기 --> num1++ (num1 < num2 만족 하는 경우, 반복)
        String numList = "";
        while(num1 < num2){
            numList += String.valueOf(num1) + ", ";
            num1++;
        }
        System.out.println("두 숫자 사이의 모든 정수 : " + numList + num2);
    }
}
