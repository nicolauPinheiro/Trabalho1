package Trabalho1;

import java.text.DecimalFormat;


public class ContaPoupanca extends Contas {
    private double taxa;
    
    public void reajustar(double taxa){
        this.saldo *= ((taxa/100) + 1);
    }
    public void reajustar(){        
        this.saldo *= 1.1;        
    }
    public void tipoConta(){
        System.out.println("CONTA-POUPANÇA");
    }
}
