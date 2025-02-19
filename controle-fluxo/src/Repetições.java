import java.util.concurrent.ThreadLocalRandom;
//importa uma biblioteca que calcula numeros aleatorios
public class Repetições{
    public static void main (String [] args){
        //usando o for em arrays:
        String alunos [] = {"Felipe", "Jonas", "julia", "marcos"};
        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no índice i = " + i + " é " + alunos[i]);
            //conta os alunos e lista eles e seus indices
        }

        //forma abreviada
        for(String aluno : alunos){
            //ele conta os alunos e guarda o valor/nome deles na variavel aluno
            System.out.println("Nome do aluno é: " + aluno);
            //imprime o nome dos alunos
        }

        //break e continue
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                break;
                //quebra a repetição
            if(numero == 4)
                continue;
                //desconsidera/não imprime o 4 na contagem e continua a repetição

            System.out.println(numero);
        }
    }
}