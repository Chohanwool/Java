package Scanner.AdvancedEx;

import java.util.Scanner;

public class AdvExample4_1 {
    public static void main(String[] args) {
        // 상품 구매하는 프로그램 (while문 사용)
        Scanner input = new Scanner(System.in);

        System.out.println("다음 세 가지 옵션 중 하나를 선택하세요.");

        int totalPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine(); // 이전에 입력된 개행문자 제거

            if (option == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = input.nextInt();

                totalPrice += price * quantity;

                // 합계에 totalPrice를 출력하면 안된다 만약 사용자가 여러 상품을 구매한다면 totalPrice가 누적될 것이기 때문이다.
                System.out.println("상품명 : " + product + " 가격 : " + price + " 수량 : " + quantity + " 합계 : " + price * quantity + "\n");
            } else if (option == 2) {
                System.out.println("총 비용 : " + totalPrice + "\n");
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해 주세요.");
            }
        }
    }
}
