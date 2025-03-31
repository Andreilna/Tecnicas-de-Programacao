package ex04;

import java.util.Scanner;

public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;

    public Loja() {
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    public void inserirDadosLoja(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a razao social da loja: ");
        this.razaoSocial = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        this.cpfCliente = scanner.nextLine();
        
        System.out.print("Digite o valor da compra: ");
        this.valorCompra = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de itens comprados: ");
        this.qtdItensComp = scanner.nextDouble();
        
        calcularComprasLoja();
        
        mostrarDadosLoja();
        
        scanner.close();
    }

    public void calcularComprasLoja() {
        this.valorTotalCompra = this.valorCompra * this.qtdItensComp;
    }

    public void mostrarDadosLoja() {
        System.out.println("\nDados da Compra:");
        System.out.println("Razao Social da Loja: " + this.razaoSocial);
        System.out.println("CPF do Cliente: " + this.cpfCliente);
        System.out.println("Valor da Compra por Item: R$ " + this.valorCompra);
        System.out.println("Quantidade de Itens: " + this.qtdItensComp);
        System.out.println("Valor Total da Compra: R$ " + this.valorTotalCompra);
    }  
}