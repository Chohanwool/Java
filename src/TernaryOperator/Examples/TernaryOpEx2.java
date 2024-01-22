package TernaryOperator.Examples;

public class TernaryOpEx2 {
    public static void main(String[] args) {
        int value = 0;

        String oddOrEven = (value%2 == 0) ? "짝수" : "홀수";
        System.out.println(value + "는 " + oddOrEven + " 입니다.");
    }
}
