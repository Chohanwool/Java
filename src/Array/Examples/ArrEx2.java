package Array.Examples;

import java.util.Scanner;

public class ArrEx2 {
    public static void main(String[] args) {
        // 5개의 정수를 입력 받아서 배열에 저장하고, 입력 순서대로 출력
            // 출력시 포멧은 1,2,3,4,5 와 같이 쉼표로 구분하고 마지막에는 쉼표를 넣지 않도록 해야 한다.
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 5개를 입력해주세요 : ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 방법1
        for (int value : arr) {
            if(value != arr[arr.length-1]){
                System.out.print(value + ", ");
            } else {
                System.out.print(value);
            }
        }

        System.out.println();

        // 방법2
        for (int num : arr) {
            System.out.print(num);
            if(num != arr[arr.length-1]){
                System.out.print(", ");
            }
        }

    }
}
