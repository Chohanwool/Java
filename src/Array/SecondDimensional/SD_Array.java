package Array.SecondDimensional;

public class SD_Array {
    public static void main(String[] args) {
        // 2차원 배열은 행(row)과 열(column)로 구성된다.

        // 2개의 행과 3개의 열로 구성된 배열 생성 --> int[][] arr = new int[행][열]

            /*           [][1]     [][2]     [][3]
                [0][]      1         2         3
                [1][]      4         5         6
             */

            /*           [][1]     [][2]     [][3]
                [0][]   [0][1]    [0][2]    [0][3]
                [1][]   [1][1]    [1][2]    [1][3]
             */

        int [][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // 0행
        System.out.print(arr[0][0] + " "); // 0열 출력
        System.out.print(arr[0][1] + " "); // 1열 출력
        System.out.print(arr[0][2]); // 2열 출력
        System.out.println();

        // 1행
        System.out.print(arr[1][0] + " "); // 0열 출력
        System.out.print(arr[1][1] + " "); // 1열 출력
        System.out.println(arr[1][2]); // 2열 출력

    }
}
