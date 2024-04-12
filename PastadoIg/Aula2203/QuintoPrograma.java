package Aula2203;
import java.util.Scanner;

public class QuintoPrograma {
    public static void main (String args[]) {
      Scanner leitor = new Scanner(System.in);
      double inicio, fim, duração, minutos, horas, segundos;

      System.out.println("Digite que horas começou sua reunião:");
      inicio = leitor.nextDouble();

      System.out.println("Digite que horas terminou sua reunião:");
      fim = leitor.nextDouble();
       
      horas = inicio / 

      duração =   (fim - inicio) * 60;

      System.out.println("Sua reunião durou:"+ duração);


    }
}
