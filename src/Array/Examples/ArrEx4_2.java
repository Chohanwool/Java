package Array.Examples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrEx4_2 {
    public static void main(String[] args) {
        // 선생님 풀이
            /*
            내 풀이와의 차이점 : 등록할 수 있는 최대 개수인 10을 maxProducts 변수로 만들어서 사용
                              10개이상의 상품을 등록하려고 할때 에러 메세지
                              아무 상품도 등록되지 않았을때 상품 목록 선택 제한
                              상품 목록 메뉴에서 for문을 productCount만큼 반복시킴으로써 배열의 빈 인덱스를 불러오지 않게 함
             */
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품의 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품의 이름을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                productCount = 0;
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
