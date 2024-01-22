package Loop.Examples;

public class ForAndWhile2 {
    public static void main(String[] args) {
        /*
        첫 10개의 짝수를 출력하는 프로그램을 작성하라. 이때, num이라는 변수를 사용하여 수를 표현해야 한다.
        while문, for문 2가지 버전의 정답을 만들어라.
         */

        // for문 버전
            // 참고로 for문의 괄호()안에는 여러개의 초기식과 증감식을 생성할 수 있다.
                /* 하지만 웬만하면 괄호안에는 반복횟수와 관련된 변수만을 넣고 그 외의 변수들은 반복문 밖에서 생성한 후 반복문 내에서
                호출하여 사용하는 것이 더 깔끔하다. */
        for(int num1 = 2, count = 1; count <= 10; num1 += 2, count++){
            System.out.println(count + "번째 짝수 : " + num1);
        }

        System.out.println();

        // while문 버전
        int num2 = 2;
        int count = 1;

        while(count <= 10){
            System.out.println(count + "번째 짝수 : " + num2);
            count++;
            num2 += 2;
        }
    }
}
