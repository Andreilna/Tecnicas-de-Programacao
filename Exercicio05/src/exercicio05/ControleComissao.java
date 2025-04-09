package exercicio05;

import java.util.Scanner;

public class ControleComissao {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public ControleComissao() {
    }

    public ControleComissao(String nome, double salarioBase, double valorVendido, double novoSalario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    public void calculoComissao(){
        double comissao = valorVendido * 0.05; 
        this.novoSalario = salarioBase + comissao;
    }
    
    public void entrarNome(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        this.nome = scanner.nextLine();
    }
    
    public void entrarSalarioBase(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário base: ");
        this.salarioBase = scanner.nextDouble();
    }
    
    public void entrarValorVendido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor vendido: ");
        this.valorVendido = scanner.nextDouble();
    }  
}