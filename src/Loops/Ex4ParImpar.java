package Loops;

import java.util.Scanner;

public class Ex4ParImpar{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int quantNumeros;

        System.out.println("Quantidade de Numeros: ");
        quantNumeros = sc.nextInt();

        int count = 0;
        int qntdPares = 0;
        int qntdImpares = 0;

        do{
            System.out.println("Numero: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) qntdPares++;
            else qntdImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Pares: " + qntdPares);
        System.out.println("Impares: " + qntdImpares);


        sc.close();   
    }
}