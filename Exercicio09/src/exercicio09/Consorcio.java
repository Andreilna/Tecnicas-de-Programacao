package exercicio09;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Consorcio {
    private int numeroTotalPrestacoes;
    private int qtdPrestacoesPagas;
    private double valorPrestacao;
    private double saldoDevedor;
    private double totalPago;

    public Consorcio() {
    }

    public Consorcio(int numeroTotalPrestacoes, int qtdPrestacoesPagas, double valorPrestacao, double saldoDevedor, double totalPago) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
        this.valorPrestacao = valorPrestacao;
        this.saldoDevedor = saldoDevedor;
        this.totalPago = totalPago;
    }

    public int getNumeroTotalPrestacoes() {
        return numeroTotalPrestacoes;
    }

    public void setNumeroTotalPrestacoes(int numeroTotalPrestacoes) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
    }

    public int getQtdPrestacoesPagas() {
        return qtdPrestacoesPagas;
    }

    public void setQtdPrestacoesPagas(int qtdPrestacoesPagas) {
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
    }

    public double getValorPrestacao() {
        return valorPrestacao;
    }

    public void setValorPrestacao(double valorPrestacao) {
        this.valorPrestacao = valorPrestacao;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public void inserirValoresConsorcio(){
        numeroTotalPrestacoes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número total de prestações:"));
        qtdPrestacoesPagas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de prestações pagas:"));
        valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de cada prestação:"));

        calcularTotalPago();
        calcularSaldoDevedor();
    }
    
    public double calcularTotalPago(){
        totalPago = qtdPrestacoesPagas * valorPrestacao;
        return totalPago;
    }
    
    public double calcularSaldoDevedor(){
        saldoDevedor = (numeroTotalPrestacoes - qtdPrestacoesPagas) * valorPrestacao;
        return saldoDevedor;
    }
    
    public void mostrarValores(){
        System.out.println("Total Pago: R$ " + totalPago);
        System.out.println("Saldo Devedor: R$ " + saldoDevedor);
    }
}