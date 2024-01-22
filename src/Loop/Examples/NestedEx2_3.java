package Loop.Examples;

public class NestedEx2_3 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = 2*i; j < 2*rows-1  ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
