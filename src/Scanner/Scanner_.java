package Scanner;

public class Scanner_ {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("문자를 입력하세요 : ");
        String strValue = scanner.nextLine();
        System.out.println("strValue = " + strValue);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);
    }
}
