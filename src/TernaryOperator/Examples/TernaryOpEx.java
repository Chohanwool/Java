package TernaryOperator.Examples;

public class TernaryOpEx {

    public static void main(String[] args) {

        int a = 10, b = 20;
        int largerNum = (a > b) ? a : b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("\na와 b 중 더 큰 수는?\n" + largerNum);

    }

}
