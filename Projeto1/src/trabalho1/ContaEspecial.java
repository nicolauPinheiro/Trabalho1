package Trabalho1;

public class ContaEspecial extends Contas{
    private int limite;
    private double multa;

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    
    public int getLimite() {
        return limite;
    }

    
    public void descontar(double valor){
        saldo = (saldo - valor) * ((multa/100)+1); 
    }
    
    public void tipoConta(){
        System.out.println("CONTA-ESPECIAL");
    }
}
