package ex07;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite um produto a ser comprado: "); 
        String produto = scanner.next(); 

        System.out.print("Digite quantos vai querer: "); 
        int qtd = scanner.nextInt(); 

        System.out.print("Digite o valor unitario desse produto: "); 
        double valoruni = scanner.nextDouble(); 

        double totalapagar = qtd * valoruni; 

        System.out.println("Comprando " + qtd + " " + produto + " por " + valoruni + " voce pagara " + totalapagar); 

        scanner.close(); 
    }
}