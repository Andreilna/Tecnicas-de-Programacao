package projetoexemplo02;

import javax.swing.JOptionPane;

public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;

    public CustoPiso() {
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores(){
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do comodo: ")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do comodo: ")));
        setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por area: ")));
    }
    
    public void calcularPrecoArea(){
        setCustoTotalComodo(getLarguraComodo() * getComprimentoComodo() * getPrecoPorArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(
                null, "Comprimento do Comodo: " + getComprimentoComodo() + 
                      "\nLargura do comodo: " + getLarguraComodo() +
                      "\nPreço por área: R$" + getPrecoPorArea() +
                      "\nCusto total comodo: "+ getCustoTotalComodo());
    }
}