public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        //cria o objeto smartTv

        System.out.println("Está ligada?" + smartTv.ligada);
        System.out.println("Canal:"+ smartTv.canal);
        System.out.println("Volume: "+ smartTv.volume);
        //pergunta essas coisas

        smartTv.ligar();
        System.out.println("Está ligada?" + smartTv.ligada);
        //chama a função ligar e informa seu estado
        
        smartTv.desligar();
        System.out.println("Está ligada?" + smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume: "+ smartTv.volume);
        //aumenta o volume 3 vezes, diminui 1 vez e imprime o valor
        
        smartTv.mudarCanal(10);
        System.out.println("Canal: " + smartTv.canal);
        //informa o novo canal e imprime ele
    }
}
