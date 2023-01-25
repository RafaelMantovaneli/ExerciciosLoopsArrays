
import java.util.Scanner;
import java.util.Random;

public class Ex4Multidimensional {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j =0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : M) {
            for (int elementoColuna : linha ) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
