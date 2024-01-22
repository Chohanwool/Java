package Scanner.Example;

import java.util.Scanner;

public class ScExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num = sc.nextInt();

//        if(num % 2 == 0){
//            System.out.println(num + "은/는 짝수입니다.");
//        } else {
//            System.out.println(num + "은/는 홀수입니다.");
//        }

        String oddEven = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("입력하신 정수 '" + num + "'은/는 " + oddEven + "입니다.");
    }
}
