package Loop;

public class DoWhile {
    public static void main(String[] args) {
        // do-while문은 while문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
        int i = 10;

        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 5); // ( i < 5 ) 조건식을 만족하지 않아도 위 코드는 반드시 한 번은 실행된다.

        System.out.println("i = " + i); // i == 11 인 이유는 do 블록 안의 코드가 1회 실행되었기 때문이다.
    }
}
