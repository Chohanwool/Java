package If.Examples;

public class IfEx {
    public static void main(String[] args) {
        // 점수에 따른 학점 출력하기
        int score = 88;

        if (100 >= score && score >= 90){
            System.out.println("당신의 학점 : A");
        } else if (score >= 80) {
            System.out.println("당신의 학점 : B");
        } else if (score >= 70) {
            System.out.println("당신의 학점 : C");
        } else if (score >= 60) {
            System.out.println("당신의 학점 : D");
        } else {
            System.out.println("당신의 학점 : F");
        }
    }
}
