package Loops;
import java.util.Scanner;

public class Ex6Fatorial{


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Programa Cálculo de Número Fatorial ---");
        System.out.println("Digite o numero:");
        int numero = sc.nextInt();
        int fatorial = numero;


        for (int i=(numero-1); i >= 1 ; i--){
            fatorial = fatorial * i;
        }

        System.out.println(numero + "! = " + fatorial);

        sc.close();   
    }
}
