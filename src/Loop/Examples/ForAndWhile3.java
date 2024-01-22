package Loop.Examples;

public class ForAndWhile3 {
    public static void main(String[] args) {
        /*
        1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성하라. 이때, sum이라는 변수를 사용하여 누적 합을 표현하고, i라는 변수를
        사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 한다.

        while문, for문 2가지 버전의 정답을 만드시오.
         */

        // for문
        int max1 = 100;
        int sum1 = 0;
        for(int i = 1; i <= 100; i++){
            sum1 += i;
        }
        System.out.println("1부터 " + max1 + "까지의 합 : " + sum1);

        // while문
        int max2 = 10;
        int sum2 = 0;
        int i = 1;
        while(i <= max2){
            sum2 += i;
            i++;
        }
        System.out.println("1부터 " + max2 + "까지의 합 : " + sum2);
    }
}
