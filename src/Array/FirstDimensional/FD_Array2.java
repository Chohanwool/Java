package Array.FirstDimensional;

public class FD_Array2 {
    public static void main(String[] args) {
        /*
        리펙토링 : 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고 유지보수를 용이하게 하는 과정
              용도
              - 중복 제거
              - 복잡성 줄임
              - 이해하기 쉬운 코드로 만듦
              효과
              - 버그를 줄임
              - 프로그램의 성능을 향상 시킬 수도 있음
              - 코드의 설계를 개선하는 데에도 도움이 됨
         */

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 배열.length : 배열의 길이를 반환
        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
