package If.Examples;

public class IfEx3 {
    public static void main(String[] args) {
        // 환율 계산기 (달러 -> 원)
        double dollar = 18.95;

        if(dollar > 0){
            double won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("잘못된 금액입니다.");
        }
    }
}
/*
        double dollar = 18.95;
        double won = 0;
        if (dollar >= 0){
            won = dollar * 1300;
        }


        if(dollar > 0){
            System.out.println("환전 금액은 " + won +"원입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("잘못된 금액입니다.");
        }
 */
