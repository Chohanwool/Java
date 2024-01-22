package Array.AdvancedEx;

import java.util.Scanner;

public class AdvArrEx4 {
    public static void main(String[] args) {
        // 상품 관리 프로그램을 만들어 보자.
            // 상품 등록 : 상품 이름과 가격을 입력 받아 저장한다.
            // 상품 목록 : 지금까지 등록한 모든 상품의 목록을 출력한다.

        // 다음과 같이 동작해야 한다 :
            // 첫 화면에서 사용자에게 세 가지 선택을 제시한다. "1. 상품 등록", "2. 상품 목록", "3.종료"
            // 1번을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.
            // 2번을 선택하면, 배열에 저장된 모든 상품을 출력한다.
            // 3번을 선택하면 프로그램을 종료한다.

        // 제약 조건
            // 상품은 최대 10개까지 등록할 수 있다.

        // 내 풀이
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        int flag = 1;
        while(flag == 1){
            System.out.println("1. 상품 등록 2.상품 목록 3.종료");
            System.out.print("메뉴를 선택하세요 : ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("상품 이름을 입력하세요 : ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                }
                case 2 -> {
                    for (int i = 0; i < productNames.length; i++) {
                        if(productNames[i] != null) System.out.println(productNames[i] + ": " + productPrices[i]);
                    }
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    productCount = 0;
                    flag = 0;
                }
                default -> System.out.println("잘못된 접근입니다.");
            }
        }
    }
}
