package ex11;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite a quantidade de moveis vendidos por voce: "); 
        int qtdmoveis = scanner.nextInt(); 

        int salario = 1000; 
        int calc = (qtdmoveis * 50)+ salario; 

        System.out.println("A quantidade vendida foi de " + qtdmoveis + " moveis que somada ao seu salario fica R$" + calc); 

        scanner.close(); 
    } 
}