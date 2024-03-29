package Loop;

public class For {
    public static void main(String[] args) {
        // for문도 while문과 같은 반복문인데, for문은 주로 반복 횟수가 정해져 있을 때 사용한다
            /*
            for문의 구조 : for (1. 초기식; 2. 조건식; 4. 증감식;) {
                3. 코드
            }
             */

        /*
        1. 초기식 : 주로 반복과 관련된 변수를 선언하고 초기화한다. 초기식은 딱 한 번 사용된다.
        2. 조건식 : 조건식을 검증하여 참이면 코드를 실행하고 거짓이면 for문을 나간다.
        3. 코드 : 블록 안의 코드를 실행한다.
        4. 증감식 : 블록 안 코드의 실행이 종료 되면 실행되는데, 주로 초기식에 넣은 반복 횟수와 관련된 변수의 값을 증가 할 때 사용한다.
        5. 다시 2번부터 시작한다.

        참고로 for문에서 초기식, 증감식, 조건식은 선택사항이다. 각각을 생략해도 작동하는데 문제는 없지만 각 영역을 구분하는 세미콜론(;)은
        유지해야 한다.
            for(;;){
               코드
            }
         위 코드는 조건이 없기 떄문에 아래의 while문과 같다
            while(true){
                코드
            }
         */

        // 1부터 10까지 출력하는 for문
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
