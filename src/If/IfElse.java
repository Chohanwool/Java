package If;

public class IfElse {
    public static void main(String[] args) {
        int age = 25;

        /* 7세 이하 : 유아
           8~13세 : 초등학생
           14~16세 : 중학생
           17~19세 : 고등학생
           20세 이상 : 성인
         */
        /* 특정 나이 사이의 경우 조건식을
             age >= 8 && age <= 13
           와 같이 작성해야 하지만

           아래의 경우 첫번쨰 if문에서 이미 (age <= 7) 가 false임이 증명 되었으므로
           그 아래부터는 해당 조건에 대하여 작성하지 않아도 된다.
         */
        if(age <= 7){
            System.out.println("유아");
        } else if(age <= 13){
            System.out.println("초등학생");
        } else if(age <= 16){
            System.out.println("중학생");
        } else if(age <= 19){
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
