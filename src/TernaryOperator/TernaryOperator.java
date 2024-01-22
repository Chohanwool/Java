package TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
        아래와 같이 단순히 참과 거것에 따라서 특정 값을 구하는 경우

            if( age >= 18 ){ status = "성인" }
            else{ status = "미성년자" }

        삼항 연산자 또는 조건 연산자라 불리는
        [ (조건) ? 참_표현식 : 거짓_표현식 ]
        연산자를 사용할 수 있다.
         */

        int age = 18;
        // age가 18이상의 수인지? 맞다면 "성인" : 틀리면 "미성년자"
        String status = (age >= 18) ? "성인" : "미성년자" ;
        System.out.println("age = " + age);
        System.out.println("status = " + status);
    }
}
