package Scanner.AdvancedEx;

import java.util.Scanner;

public class AdvExample2 {
    public static void main(String[] args) {
        // 사용자의 이름과 나이를 입력 받고 바로 출력해주는 프로그램
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            int age = input.nextInt();
            /* 아래 input.nextLine();을 작성하는 이유
            * nextInt() 메서드는 입력된 수만을 값으로 가져간다
            * 하지만 우리가 입력 할 때는 숫자만 입력하는 것이 아니라 enter키도 같이 누르게 된다
            * 이때 nextInt() 메서드는 숫자만 가져가므로 \n(enter키의 값)이 남게된다
            * 이후 while문으로 인해 위부터 다시 반복하게 되면
            * String name = input.nextLine()의 값으로 남아있던 \n이 값으로 들어가게 되는 것이다
            * 따라서 아래에 input.nextLine()을 한번 입력해주므로써 남아있는 \n을 없애는 것이다 */
            input.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }
    }
}
