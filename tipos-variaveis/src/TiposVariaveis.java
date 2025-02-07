public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salario = 1000.5;
        //. é a ,
        int cep = 949432;
        //int não pode começar com 0. nesse caso seria melhor colocar em uma String
        float pi =3.14F;
        //float tem q terminar com F, se nao ele confunde com uma variavel double
        long cpf = 393339292L;
        //long tem que terminar com L.
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //não pode juntar numero curto com inteiro, mas pode juntar inteiro com curto

        final double VALOR_DE_PI = 3.14;
        //não pode ser alterado e é sempre escrita com CAPSLOCK
    }
}
