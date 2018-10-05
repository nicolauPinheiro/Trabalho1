package Trabalho1;

public class Contas {
    
    private String nome;
    private int numero;
    double saldo;

    public void tipoConta(){
        System.out.println("CONTA-COMUM");
    }
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){              
        this.saldo = getSaldo() - valor;                    
    }
    public void transferir(double v){
        this.saldo = getSaldo() - v;
    }
}
    /**public void transferir(Contas conta1, Contas conta2, double valor){
        
    }
    public void tipoConta(){
        System.out.println("CONTA COMUM");
    }**/

