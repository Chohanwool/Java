package Scanner.Example;
import java.util.Scanner;

public class ScExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 내 풀이
        String strValue = ""; //--> 반복문 밖에서 실수로(?) 이상한 값을 넣으면 문제가 생길 수 있음.
        while (!strValue.equals("exit")) { // --> 참조형 객체는.equals() 로 값 비교

            System.out.print("문자열을 입력하세요(exit : 프로그램 종료) : ");
            strValue = scanner.nextLine();

            if (strValue.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break; // 반복문 종료
            } else {
                System.out.println("입력하신 문자열 : " + strValue);
            }
        }

        // 정답 : strValue를 반복문 내에 생성하여 외부의 접근을 막음.
        // if 조건문을 통해 반복문을 종료 시킬 수 있으므로 while(true)를 사용.
        while(true){
            System.out.print("문자열을 입력하세요 : ");
            String strValue2 = scanner.nextLine();

            if(strValue2.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력하신 문자열 : " + strValue2);
        }
    }
}
