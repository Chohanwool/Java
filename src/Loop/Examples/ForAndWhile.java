package Loop.Examples;

public class ForAndWhile {
    public static void main(String[] args) {
        /*
        첫 10개의 자연수를 출력하는 프로그램을 작성하라. 이때, count라는 변수를 사용해야 한다.
        while문과 for문, 2가지 버전의 정답을 도출하라.
         */

        // while문 버전
        int count = 1;

        while(count <= 10){
            /*
            아래의 코드를 한 줄의 코드로 간략화 하면 --> System.out.println(count++);
            System.out.println(count);
            count++;
             */
            System.out.println(count++);
        }

        System.out.println();

        // for문 버전
        for(count = 1;count<=10;count++){
            System.out.println(count);
        }
    }
}
