package projetoexemplo;

import javax.swing.JOptionPane;

public class Caixa {
    private double saldo;

    public Caixa() {
    }

    public Caixa(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void entrar(){
        double valor =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de entrada: "));
        
        this.setSaldo(this.saldo + valor);
    }
    
    public void retirar(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de retirada: "));
        
        this.setSaldo(this.saldo - valor);
    }
    
}
