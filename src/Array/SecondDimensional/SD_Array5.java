package Array.SecondDimensional;

public class SD_Array5 {

    public static void main(String[] args) {
        int[][] arr = new int[3][2];

        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
                System.out.print(arr[row][column] + " ");
            }
            // 한 행이 끝나면 줄 바꿈
            System.out.println();
        }
    }
}
