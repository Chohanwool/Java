package Switch;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon = 0;

        // 의도적으로 break문을 없앨 수 도 있다.
        // grade(등급)이 2 또는 3일때 3000원 쿠폰을 주고 싶다면
            // grade가 2인데 break문이 없으므로 case3 으로 진입
                /* 주의 할 점은 case3 일때만 추가 혜택을 주는 코드가 case3에 있다면
                   이렇게 작성하면 안된다.
                   case2일때도 그 코드가 실행되기 때문이다.

                   따라서 웬만하면 break문으로 각 case를 분리하여 사용하는 것이 권장된다. */
        switch (grade){
            case 1 :
                coupon = 1000;
                break;
            case 2 :
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
