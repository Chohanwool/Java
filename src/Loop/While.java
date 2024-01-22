package Loop;

public class While {
    public static void main(String[] args) {
        /*
            같은 코드를 여러번 반복 해야 할때, 반복 되는 코드의 일부분을 수정 해야 할때,
            while반복문, do-while반복문, for반복문을 사용할 수 있다.
         */

        /* 아래위 코드는 변수 count를 1씩 증가시키는 코드이다. 별다른 문제가 없어 보이지만 만약 1을 총 100번 더하는 코드를 만들어야 한다면
        복사 붙여넣기를 총 100번해야 하고 만일 오류가 발생하거나 코드의 일부분을 수정해야 하는 일이 생긴다면 이를 수정하는건 쉽지 않은 일이
        될 것이다.

        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count += 1;
        System.out.println("현재 숫자는 : " + count);
        count++;
        System.out.println("현재 숫자는 : " + count);
        count++;
        System.out.println("현재 숫자는 : " + count);
        count++;
        System.out.println("현재 숫자는 : " + count);
        (...)
        (...)
         */

        // while 반복문
        int count = 0;
        while(count<10){
            System.out.println("현재 숫자는 : " + count);
            count++;
        }
    }
}
