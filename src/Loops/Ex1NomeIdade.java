package Loops;

import java.util.Scanner;

public class Ex1NomeIdade {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;  

        while(true){
        System.out.print("Nome: ");
        nome = sc.next();
        if (nome.equals("0")) break;

        System.out.print("Idade: ");
        idade = sc.nextInt();
        }    

        System.out.println("Fim do Laço");


    sc.close();
    }
}
