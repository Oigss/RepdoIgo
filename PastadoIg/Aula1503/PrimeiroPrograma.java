package Aula1503;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrimeiroPrograma {
    public static void main (String args []) {
      Scanner leitor = new Scanner(System.in);
      String nome;
      int idade;

      System.out.println("|Digite seu nome:");
      nome= leitor.nextLine();

      System.out.println("Digite sua Idade:");
      idade = leitor.nextInt();
      
      System.out.println("Seu Nome é:"+nome);
      System.out.println("Sua idade é:"+idade);
      

      
    }

    
}