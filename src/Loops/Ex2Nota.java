package Loops;
import java.util.Scanner;

public class Ex2Nota {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Nota: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Valor Inválido, Digite uma nova nota:");
            nota = sc.nextInt();
        }

        sc.close();
    }
}
