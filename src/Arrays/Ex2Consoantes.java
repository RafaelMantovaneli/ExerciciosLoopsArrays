
import java.util.Scanner;

public class Ex2Consoantes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntdConsoantes = 0;

        int count = 0;
    
        do{
            System.out.println("Letra: ");
            String letra = sc.next();

            if ( !(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                qntdConsoantes++;
            }

            count++;
        }while(count < consoantes.length);

        for( String consoante : consoantes ){
            if (consoante != null)
            System.out.print(consoante + " ");
        }
        
        System.out.println("Quantidade de Consoantes: " + qntdConsoantes);
        
        


        sc.close();
    }
}
