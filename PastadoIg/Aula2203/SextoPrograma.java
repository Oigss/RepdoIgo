package Aula2203;

import java.util.Scanner;

public class SextoPrograma {
    public static void main (String args[]){
    
        Scanner leitor = new Scanner(System.in);
        String nome;
        int A1, A2, A3, notafinal;

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();

        System.out.println("Digite A1:");
        A1 = leitor.nextInt();

        System.out.println("Digite A2:");
        A2 = leitor.nextInt();

        System.out.println("Digite A3");
        A3 = leitor.nextInt();

        System.out.println(nome);

       notafinal = (int) (0.3 * A1 + 0.3 * A2 + 0.4 * A3);

       if (notafinal >= 70);
       System.out.println("AP");

       if (notafinal < 70 && notafinal > 30) {
        System.out.println("AI");}

       if (notafinal <= 30) {
        System.out.println("REP");
            
        }
        
       }

    
    

    


    




    }
}
