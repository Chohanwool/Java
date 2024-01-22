package Loop.Examples;

public class ForEx {
    public static void main(String[] args) {
        // i부터 endNum까지 더하는 for문
        int endNum = 10;
        int sum = 0;
        System.out.println("sum = " + sum + "\n");

        for(int i = 1; i <= endNum; i++){
            sum += i;
            System.out.println("i = " + i + ", sum + i = " + sum);
        }
    }
}
