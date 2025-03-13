package ex1;

public class ContaBanco {
    public int numConta;
    public String nomeDono;

    public double verificarSaldo;
    private double checarChequeEspecial;
    double valorChequeEspecial;
    
    public boolean depositarDinheiro;
    public boolean sacarDinheiro;
    public boolean pagarBoleto;
    private boolean verificarContaUsandoCheque;
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        if (saldo <= 500){
            valorChequeEspecial = 50;
        }else if(saldo >500){
            valorChequeEspecial = 50/100 * saldo;
        }
    }
}
