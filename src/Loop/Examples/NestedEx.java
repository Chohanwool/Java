package Loop.Examples;

public class NestedEx {
    public static void main(String[] args) {
        // 구구단 1~9단까지 출력하는 프로그램을 작성해보자
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
