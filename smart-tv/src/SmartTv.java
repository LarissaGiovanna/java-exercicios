public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    //cria o que uma tv deve ter

    public void ligar() {
        ligada = true;
    }
    //cria a função ligar

    public void desligar() {
        ligada = true;
    }
    //cria a função desligar

    public void aumentarVolume() {
        volume++;
    }
    //cria a função aumentar volume

    public void diminuirVolume() {
        volume--;
    }
    //cria a função diminuir volume

    public void aumentarCanal() {
        canal++;
    }
    //cria a função aumentar o canal

    public void diminuirCanal() {
        canal--;
    }
    //cria a função diminuir canal

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    //cria a função mudar de canal recebendo o valor do novo canal informado pelo usuario
}
