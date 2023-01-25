
import java.util.Scanner;

public class Ex1OrdemInversa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int count = 0;

        while (count <= (vetor.length-1)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        
        System.out.println();
        count = vetor.length - 1;
        while (count >= 0) {
            System.out.print(vetor[count] + " ");
            count--;
        }
        


        sc.close();
    }
}
