import java.util.Scanner;

public class SetimoPrograma {
   
       
        String aluno;
        double nota1, nota2, media;
        
        public void LeituraDados() {
           
            Scanner leitor= new Scanner (System.in);
            System.out.println("Digite o nome do aluno: ");
            aluno = leitor.nextLine();

            System.out.println("Digite a nota: ");
            nota1 = leitor.nextDouble();

            System.out.println("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();
        };

        public void CalculoMedia (){
            media = (nota1 + nota2) / 2;
        }

        public void Imprime (){
        System.out.println("A media do aluno  " + aluno + " é");
        System.out.println(media);
        }
    
    };

