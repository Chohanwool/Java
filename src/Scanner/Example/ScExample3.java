package Scanner.Example;

import java.util.Scanner;

public class ScExample3 {
    public static void main(String[] args) {
        // 사용자 입력을 받아 그 합계를 계산하는 프로그램 작성
        //     > 사용자가 0을 입력하면 프로그램 종료
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("정수를 입력 하세요(0 = 프로그램 종료) : ");

        while(true){
            int value = sc.nextInt();

            if(value == 0){
                break;
            }
            sum += value;
        }
        System.out.println("입력하신 모든 정수의 합 : " + sum);
    }
}
