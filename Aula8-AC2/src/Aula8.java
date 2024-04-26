package src;
import java.util.Scanner;

public class Aula8 {

    public static void main(String[] args) {
        //inicialização de variáveis
        int quantidadeNotas = 0;
        double mediaNotas = 0.0, valorNota = 0.0, pesoTotal = 0.0, pesoNota = 0.0;
        
        


        //Criação do scanner para a execução de todos os exercícios
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas");
        quantidadeNotas = scanner.nextInt();

        for(int i= 0; i < quantidadeNotas; i++){
            
            System.out.println("Digite o valor da nota " + (i+1) + ":");
            valorNota = scanner.nextDouble();
            System.out.println("Digite o peso da nota " + (i+1)  + "(Exemplo: 50 para 50%):");
            pesoNota = scanner.nextDouble();

            pesoTotal += pesoNota;
            mediaNotas += (valorNota * (pesoNota /100)); 
            

            if(pesoTotal > 100){
                System.out.println("O peso das notas ultrapassa 100%, comece de novo");
                i = -1;
                mediaNotas = 0;
                pesoTotal = 0;
                continue;
            }
            
        }
        System.out.println("A média das notas é:" + mediaNotas);
        if (mediaFinal <= 2.0) {

            System.out.println("O aluno está reprovado.");

        }else if (mediaFinal > 2.0 && mediaFinal < 5.0){
            System.out.println("O aluno precisa fazer a prova substitutiva.");
        }else{
            System.out.println("O aluno está aprovado.");
        }
        
        //Fecha o scanner
        scanner.close();
        }
    

}
