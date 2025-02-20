import java.util.*;
public class Exceções {
    public static void main(String[] args) {
        // tratamento de erros
        //o try é tudo aquilo que você quer que seja executado
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            System.out.println("O número digitado foi: " + numero);
            sc.close();
        } catch (InputMismatchException e) {
             //o catch é o que você quer que seja executado caso ocorra um erro
             System.out.println("Você digitou um valor inválido!");
         }
    }
}
