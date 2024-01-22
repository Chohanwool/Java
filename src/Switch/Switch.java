package Switch;

public class Switch {
    public static void main(String[] args) {
        int grade = 4;
        int coupon = 0;

        // break문을 만나면 switch문에서 빠져 나오게 된다.
        switch (grade){
            case 1 :
                coupon = 1000;
                break;
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
                break;
            default :
                coupon = 500;
                break;
        }
        System.out.println("발급 받은 쿠폰 : " + coupon);
    }
}
