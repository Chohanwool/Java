package Array.SecondDimensional;

public class SD_Array4 {

    public static void main(String[] args) {

        // 2행 3열
        int [][] arr = {
                {1,2,3}, // 0행 : [0][0] = 1 , [0][1] = 2, [0][2] = 3
                {4,5,6}  // 1행 : [1][0] = 4 , [1][1] = 5, [1][2] = 6
        };

        // arr.length : 2차원 배열의 행의 길이
        // arr[row].length : 2차원 배열의 열의 길이
            // {{1,2}, {3}, {4,5,6}} : arr.length = 3 / arr[0].length = 2, arr[1].length = 1, arr[2].length = 3
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.println(arr[row][column] + " ");
            }
        }
    }
}
