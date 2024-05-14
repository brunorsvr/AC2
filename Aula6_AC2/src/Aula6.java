//Aluno: Bruno Rodrigues da Silveira
//RA: 249543
package src;
import java.util.Scanner;

public class Aula6 {

    public static void main(String[] args) {
        //inicialização de variáveis
        double mediaFinal = 0.0, ac1 = 0.0, ac2 = 0.0, ag = 0.0, af = 0.0, notaMinima = 0.0;
        String mediaFormatada = "";
        


        //Criação do scanner para a execução de todos os exercícios
        Scanner scanner = new Scanner(System.in);

        //Recebe as notas da AC1, AC2, AG E AF
        System.out.print("Digite a nota da AC1: ");
        ac1 = scanner.nextDouble();

        System.out.print("Digite a nota da AC2: ");
        ac2 = scanner.nextDouble();

        System.out.print("Digite a nota da AG: ");
        ag = scanner.nextDouble();

        System.out.print("Digite a nota da AF: ");
        af = scanner.nextDouble();
        
        //Execução do método para calcular a média final do aluno
        mediaFinal = calculoMedia(ac1, ac2, ag, af);

        mediaFormatada = String.format("%.2f", mediaFinal);

        //Pede e recebe a nota mínima
        System.out.println("Digite a nota mínima necessária: ");
        notaMinima = scanner.nextDouble();

        

        //Fecha o scanner
        scanner.close();
        //exibe media final e situacao
        if (mediaFinal  < notaMinima) {
            System.out.println("Aluno reprovado. \nA média está abaixo da nota mínima("+notaMinima+"): " + mediaFormatada);
        }else{System.out.println("Aluno aprovado. \nMédia do aluno: " + mediaFormatada); 

        }


    }
    

    //Criação do método para calcular a média
    public static double calculoMedia(double ac1, double ac2, double ag, double af) {
        return  (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
        
    }
}
