package ex03;

import java.util.Scanner;

public class IdadePessoa {
    private int ano;
    private int idade;

    public IdadePessoa() {
    }

    public IdadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calcularIdade(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
        int anoNasc = scanner.nextInt();
        
        int anoAtual = java.time.Year.now().getValue();
        
        this.idade = anoAtual - anoNasc;
        
        System.out.println("Vc tem " + this.idade + " anos.");
        
        scanner.close();
    }
}