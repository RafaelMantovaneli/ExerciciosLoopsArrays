package Loops;

import java.util.Scanner;

public class Ex3MaiorMedia{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 1;

        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();
            count++;

            if (numero > maior) maior = numero;
           
            soma += numero;

        } while(count <= 5);

        double media = soma / count;

        System.out.print("O maior numero é: " + maior + " e a média dos 5 números é: " + media);

        sc.close();   
    }
}