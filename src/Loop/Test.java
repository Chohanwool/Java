package Loop;

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; sum<=10; i++){
            sum += i;
            System.out.println("sum = " + sum + ", i = " + i);
        }
    }
}
