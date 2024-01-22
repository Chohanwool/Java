package Array.AdvancedEx;

import java.util.Scanner;

public class AdvArrEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int count = input.nextInt();

        int[] numbers = new int[count];

        System.out.println("정수 " + count + "개를 입력해주세요 : ");

        int maxNum, minNum;

        for(int i = 0; i < count; i++){
            numbers[i] = input.nextInt();
        }

        maxNum = minNum = numbers[0];

        //대소 확인 방법1
        for (int number : numbers) {
            if(number < minNum){
                minNum = number;
            }
            if(number > maxNum){
                maxNum = number;
            }
        }
        System.out.println("방법 1");
        System.out.println("가장 작은 수 : " + minNum);
        System.out.println("가장 큰 수 : " + maxNum);

        System.out.println();

        //대소 확인 방법2
        for (int number : numbers) {
            minNum = Math.min(number, minNum);
            maxNum = Math.max(number, maxNum);
        }

        System.out.println("방법 2");
        System.out.println("가장 작은 수 : " + minNum);
        System.out.println("가장 큰 수 : " + maxNum);

        System.out.println("새로운걸 알아벌임!!");
    }
}
