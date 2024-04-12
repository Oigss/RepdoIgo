package Aula1503;
import java.util.Scanner;

public class TerceiroPrograma {
     public static void main(String[] args) {
          Scanner leitor = new Scanner (System.in);
          int triangulo, perimetro;
          double area;

          System.out.println("Digite a medida de um dos lados de um triângulo equilátero:");
          triangulo= leitor.nextInt();
          perimetro= triangulo + triangulo + triangulo;
          area= (triangulo * triangulo) * Math.sqrt(3) / 4;
     
          System.out.println("O perimetro de seu triangulo é:" +perimetro );
          System.out.println("A área de seu triângulo é:" +area);
     
     
     }



     }


