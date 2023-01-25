
import java.util.Scanner;
import java.util.Random;

public class Ex3NumerosAleatorios {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numerosAleatorios = new int [20];
       
        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        
        System.out.println();

        System.out.print("Sucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
        
        System.out.println();

        System.out.print("Antecessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
        


        sc.close();
    }
}
