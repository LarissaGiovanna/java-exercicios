public class Operadores {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);
        //número positivo

        num = - num;
        //número negativo
        System.out.println(num);

        num++;
        //num = num +1;
        System.out.println(num);

        System.out.println(++ num);
        //incremente e add no num

        boolean var = true;
        System.out.println(!var);
        //inverter valor

        //Ternário:
        int a, b;
        a=5;
        b=4;
        
        String resultado = a==b ? "verdadeiro" : "false";
        //guarda em uma string:  se "a" for igual a "b", é verdadeiro, se não é falso (if)
        System.out.println(resultado);

        boolean isTrueOrFalse = a!=b;
        //variavel do tipo booleano com a condição de se "a" é diferente de "b"
        System.out.println(isTrueOrFalse);

        //para comparar objetos: 
        //ex:
        String nome1 = "larissa";
        String nome2 = new String("larissa");
        // forma errada: boolean result = nome1 == nome2;
        //forma certa, com metodo equals:
        boolean result = nome1.equals(nome2);
        System.out.println(result);
    }
}
