public class Condições{
    public static void main (String [] args){
        //condição ternária
        int nota = 7;
        //mesma logica do javascript
        //guarda em uma variavel o resultado dessa validação (true ou false)
        String resultado = nota>=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        //switch case
        String sigla = "A";
        //switch recebe a sigla
        switch (sigla){
            //caso for P
            case "P":{
                System.out.println("PEQUENO");
                break;
                //imprima e quebre (termine), caso nao coloque break, ele verificando os outros casos
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
                //resultado padrão (default)
            }
        }

        //exemplo bom em que não se usa o break:
        //plano dados moveis
        //se for B = 100m; M = 100m + Whats e Insta; T = 100m + Whats e Insta + Youtube
        String plano = "M";
        switch (plano){
            case "T":{
                System.out.println("5GB de Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
        //nesse caso, vai cair no caso M e irá seguir e continuar e executar o B também
    }
}