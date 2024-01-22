package Loop.Examples;

public class WhileEx {
    public static void main(String[] args) {
        // startNum 부터 endNum까지의 수의 합을 구하는 코드
        int startNum = 15;
        int i = startNum;
        int endNum = 40;
        int result = 0;

        while (startNum <= endNum) {
            result += startNum;
            startNum++;
        }
        System.out.println(i + "부터 " + endNum + "까지의 합 : " + result);
    }
}