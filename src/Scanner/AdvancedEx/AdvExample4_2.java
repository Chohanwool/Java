package Scanner.AdvancedEx;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AdvExample4_2 {
    public static void main(String[] args) throws InterruptedException {
        // 상품 구매하는 프로그램 (switch문 사용)
        Scanner input = new Scanner(System.in);

        System.out.println("다음 세 가지 옵션 중 하나를 선택하세요.");

        int totalCost = 0;

        boolean status = true;

        while(status) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("상품명 입력 : ");
                    String productName = input.nextLine();

                    System.out.print("상품 가격 입력 : ");
                    int productPrice = input.nextInt();

                    System.out.print("구매 헐 상품 수량 입력 : ");
                    int productQuan = input.nextInt();
                    input.nextLine();

                    totalCost += productPrice * productQuan;

                    System.out.println("상품명 : " + productName + " | 가격 : " + productPrice + " | 수량 : " + productQuan +
                            " | 합계 : " + productPrice * productQuan + "\n");
                    break;
                case 2 :
                    System.out.println("총 결제 금액 : " + totalCost);
                    if(totalCost == 0){
                        System.out.println("결제할 상품이 존재하지 않습니다.\n");
                        break;
                    }
                    totalCost = 0;

                    System.out.println("결제중...");
                    Thread.sleep(3000);

                    System.out.println("결제가 완료 되었습니다.\n");
                    break;
                case 3 :
                    System.out.println("프로그램을 종료합니다. 다음에 또 이용해 주세요 ^^");
                    status = false;
                    break;
                default:
                    System.out.println("올바른 옵션을 선택해 주세요.\n");
            }

        }
    }
}
