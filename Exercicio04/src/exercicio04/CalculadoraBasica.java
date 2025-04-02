package exercicio04;

import javax.swing.JOptionPane;

public class CalculadoraBasica {
    private double n1;
    private double n2;
    private double r;

    public CalculadoraBasica() {
    }

    public CalculadoraBasica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
     public void somar(){
        r = n1 + n2;
    }

    public void subtrair(){
        r = n1 - n2;
    }

    public void multiplicar(){
        r = n1 * n2;
    }

    public void dividir(){
        if (n2 != 0) {
            r = n1 / n2;
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
        }
    }
}
