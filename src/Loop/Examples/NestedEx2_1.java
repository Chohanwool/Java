package Loop.Examples;

public class NestedEx2_1 {
    public static void main(String[] args) {
        /*
        int rows 를 선언 한 후
        이 수만큼 다음과 같은 피라미드를 출력하면 된다.

        예) int rows = 3
        *
        **
        ***
         */

        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
