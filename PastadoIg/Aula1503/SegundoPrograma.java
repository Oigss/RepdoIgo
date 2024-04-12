package Aula1503;
import java.util.Scanner;

public class SegundoPrograma {
    public static void main(String args []) {
      Scanner leitor = new Scanner(System.in);
      int numero, unidade, dezena, centena;
      

      System.out.println("Digite um número de 1 a 999:");
      numero = leitor.nextInt();

      unidade = numero / 1;
      dezena = (numero / 10);
      centena = numero / 100;

      System.out.println("Seu número é:" +numero);
      System.out.println("A centena do seu número é:" +centena);
      System.out.println("A dezena de seu número é:" +dezena);
      System.out.println("A unidade do seu número é:" +unidade);




    }

}
