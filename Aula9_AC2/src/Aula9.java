//Aluno: Bruno Rodrigues da Silveira
//RA: 249543
package src;
import java.util.Scanner;

public class Aula9 {
    //inicializacao das variaveis fora do main, para que possam ser utilizadas pela funcao que reseta as variaveis
    static int quantidadeNotas = 0, quantidadeAlunos = 0;
    static double mediaFinal = 0.0, valorNota = 0.0, pesoTotal = 0.0, pesoNota = 0.0;
    static String mediaFormatada = "";

    public static void main(String[] args) {
  
        
        
        
        //Criação do scanner para a execução de todos os exercícios
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos que gostaria de fazer o calculo da media: ");
        quantidadeAlunos = scanner.nextInt();
        System.out.println("Digite a quantidade de notas para fazer o calculo da media dos alunos: ");
        quantidadeNotas = scanner.nextInt();
        scanner.nextLine();

        String[] nomeAlunos = new String[quantidadeAlunos] ;
        //loop for para quantos alunos calcular as notas
        for(int j = 0; j < quantidadeAlunos; j++){
            System.out.println("Digite o nome do aluno "+ (j+1) + ": " );
            nomeAlunos[j] = scanner.nextLine();
            //loop for para calcular as medias de acordo com a quantidade de notas
            for(int i= 0; i < quantidadeNotas; i++){
            
                System.out.println("Digite o valor da nota " + (i+1) + " para o aluno " + nomeAlunos[j] + ": ");
                valorNota = scanner.nextDouble();
                System.out.println("Digite o peso da nota " + (i+1)  + "(Exemplo: 50 para 50%):");
                pesoNota = scanner.nextDouble();
                scanner.nextLine();
                
    
                pesoTotal += pesoNota;
                mediaFinal += (valorNota * (pesoNota /100));
                 
                
                //verificacao para saber se o peso ultrapassa 100%
                if(pesoTotal > 100){
                    System.out.println("O peso das notas desse aluno ultrapassa 100%, comece de novo");
                    i = -1;
                    resetarVariaveis();
                    continue;
                }
                
                
            }
            //formatacao da mediaFinal para 2 casas decimais
            mediaFormatada = String.format("%.2f", mediaFinal);

            //exibe nome do aluno e sua situacao
            System.out.println("A média das notas do aluno " + nomeAlunos[j] + " é: " + mediaFormatada);
            if (mediaFinal <= 2.0) {

                System.out.println("O aluno está reprovado.");
    
            }else if (mediaFinal > 2.0 && mediaFinal < 5.0){
                System.out.println("O aluno precisa fazer a prova substitutiva.");
            }else{
                System.out.println("O aluno está aprovado.");
            }
            //reseta o valor das variaveis para calcular o proximo aluno
            resetarVariaveis();

            





        }
        

        
        
        
        //Fecha o scanner
        scanner.close();
        
        }
        //funcao para resetar as variaveis
        public static void resetarVariaveis() {
            mediaFinal = 0;
            pesoTotal = 0;
            mediaFormatada = "";
        }
        
    

}
