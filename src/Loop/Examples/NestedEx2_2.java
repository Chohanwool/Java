package Loop.Examples;

public class NestedEx2_2 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows; i++){
            for(int j = rows-1; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
