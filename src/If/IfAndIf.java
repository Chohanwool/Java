package If;

public class IfAndIf {
    /*public static int totalPrice = 25000;
    public static int customerAge = 10;
    public static int discount(){
        int discountedPrice = totalPrice - 1000;
        return discountedPrice;
    }*/
    public static void main(String[] args) {
        /*if (totalPrice >= 10000) {
            totalPrice = discount();
        }

        if (customerAge <= 10){
            totalPrice = discount();
        }

        System.out.println("지불 하실 금액 : " + totalPrice);*/
        int totalPrice = 20000;
        int customerAge = 8;
        int discount = 0;

        System.out.println("선택 상품 총액 : " + totalPrice);

        if (totalPrice >= 10000){
            discount += 1000;
            System.out.println("10000원 이상 구매시 : 1000원 할인");
        }

        if (customerAge <= 10){
            discount += 1000;
            System.out.println("10세 이하 고객 구매시 : 1000원 할인");
        }
        int totalDiscount = discount;
        int finalAmount = totalPrice - totalDiscount;
        System.out.println("-----------------------------");
        System.out.println("총 할인된 금액 : " + totalDiscount);
        System.out.println("최종 지불 금액 : " + finalAmount);
    }
}
