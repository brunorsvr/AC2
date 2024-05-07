package src;
import java.util.Scanner;

public class Aula7 {

    public static void main(String[] args) {
        //inicialização de variáveis
        double mediaFinal, ac1, ac2, ag, af = 0.0;
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

        //Operaçao logica e exibição da situação do aluno
        if (mediaFinal <= 2.0) {

            System.out.println("O aluno está reprovado. \nMédia do aluno: " + mediaFormatada);

         }
            else if (mediaFinal > 2.0 && mediaFinal < 5.0){
            System.out.println("O aluno precisa fazer a prova substitutiva. \nMédia do aluno: " + mediaFormatada);
         }
            else{
            System.out.println("O aluno está aprovado. \nMédia do aluno: " + mediaFormatada);
         }
        //Fecha o scanner
        scanner.close();
        }


    
    

    //Criação do método para calcular a média
    public static double calculoMedia(double ac1, double ac2, double ag, double af) {
        return  (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
        
    }
}
