package Switch;

public class NewSwitch {
    public static void main(String[] args) {
        /* switch문은 특정 값에 따라 특정 값이 필요할때 if문을 대체하여 사용할 수 있다.

           하지만 if문을 대체한다고 해서 코드가 눈에 띄게 간결해지는 것도 아니고
           break문이 강제 되어 개발자들이 오랫동안 붊만을 제기 해왔다.

           그리하여 JAVA 14버전부터는 이를 해결 하고자 새로운 switch문을 도입 하였다.
         */
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("나의 등급 : " + grade);
        System.out.println("발급 받은 쿠폰 : " + coupon);
    }
}
