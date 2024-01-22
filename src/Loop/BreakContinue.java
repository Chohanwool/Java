package Loop;

public class BreakContinue {
    public static void main(String[] args) {
        // break와 continue는 반복문에서 사용되는 키워드이다
            // break : 반복문을 즉시 종료하고 나간다
            // continue : 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행한다

        // break문 예제 : 1부터 시작해 숫자를 계속 누적하여 더하다가 합계가 10보다 처음으로 큰 값을 구하는 코드
        int i = 1;
        int sum = 0;
        int n = 100;

        while(true) {
            sum += i;
            if (sum > n) { // 합이 10보다 커서 더이상 더 할 필요가 없기 때문에 break문을 이용해 반복문을 나간다
                System.out.println("합이 " + n + "보다 크면 반복문 종료 : i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }

        // continue문 예제 : 1부터 숫자를 하나씩 출력하는데, 숫자가 3일 떄는 출력을 건너 뛰어야 한다
        int j = 1;

        while (j <= 5) {
            if (j == 3) {
                j++;
                continue;
            }
            System.out.println("현재 숫자 : " + j);
            j++;
        }
    }
}
