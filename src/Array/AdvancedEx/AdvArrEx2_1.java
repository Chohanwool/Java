package Array.AdvancedEx;

import java.util.Scanner;

public class AdvArrEx2_1 {
    public static void main(String[] args) {
        // 4명의 학생의 국영수 점수를 입력받아 각 학생의 총점과 평균을 계산
        // 2차원 배열을 사용

        // 내 풀이`
        Scanner sc = new Scanner(System.in);
        int[][] studScores = new int[4][3];

        int totalScores[] = new int[4];
        double[] averageScores = new double[4];

        for (int i = 0; i < studScores.length; i++){
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 :");
            for(int j = 0; j < studScores[i].length; j++){
                if(j==0){
                    System.out.print("국어 점수 : ");
                } else if (j==1) {
                    System.out.print("영어 점수 : ");
                } else if (j==2) {
                    System.out.print("수학 점수 : ");
                }
                studScores[i][j] = sc.nextInt();
                totalScores[i] += studScores[i][j];
            }
            averageScores[i] = (double) totalScores[i] / studScores[i].length;
        }
        for (int i = 0; i < 4; i++){
            System.out.println((i+1) + "번 학생의 총점 : " + totalScores[i] + ", 평균 : " + averageScores[i]);
        }
    }
}
