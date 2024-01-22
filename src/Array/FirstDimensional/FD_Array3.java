package Array.FirstDimensional;

public class FD_Array3 {
    public static void main(String[] args) {
        // 배열 선언, 생성 및 초기화
            // new int[]는 생략해도 자바가 배열인지 어느정도 유추 할 수 있다
            // 하지만 생략 한다고 해서 new int[]코드가 아예 쓰이지 않는건 아니다. 프로그램을 실행하면 자바가 자동으로 new int[]를 추가해준다
            // int[] students = new int[]{90, 80, 70, 60, 50};

        /*
        단, 주의 할 점은
            int[] students;
            students = {90, 80, 70, 60, 50};
        위와 같이 코드를 작성하면 에러가 발생할 것이다.
        students가 int[]로 선언이 되어 있지만
        students = {90, 80, 70, 60, 50} --> 이 한 줄로는 해당 변수가 배열을 담기 위한 변수인지 알 수 없기 때문이다.
         */

        int[] students = {90, 80, 70, 60, 50, 40, 30, 20};

        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
