package Array.Examples;

public class ArrEx1 {
    public static void main(String[] args) {
        int[] scores = {90, 80, 70, 60, 50};

        int total = 0;

        // 배열의 모든 요소를 사용하므로 향상된 for문을 사용하면 좋다
//        for(int i = 0; i < scores.length; i++){
//            total += scores[i];
//        }

        for (int score : scores) {
            total += score;
        }
        double average = (double)total / scores.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);
    }
}
