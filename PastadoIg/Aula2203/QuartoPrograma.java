import java.util.Scanner;

public class QuartoPrograma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int primeirolado, segundolado, basedotriangulo, perimetro, semiperimetro;
        double area;

        System.out.println("Digite primeiramente um dos lados de seu triângulo escaleno: ");
        primeirolado = leitor.nextInt();

        System.out.println("Digite o segundo lado de seu triãngulo: ");
        segundolado = leitor.nextInt();

        System.out.println("Digite a base de seu triângulo: ");
        basedotriangulo = leitor.nextInt();

        perimetro = (primeirolado + segundolado + basedotriangulo);
        semiperimetro = (primeirolado + segundolado + basedotriangulo) / 2;
        area = Math.sqrt(semiperimetro*(semiperimetro-primeirolado)*(semiperimetro-segundolado)*(semiperimetro-basedotriangulo));

        System.out.println("O perimetro de seu triângulo é: " + perimetro);
        System.out.println("A área de seu triângulo é: " + area);


    }
}
