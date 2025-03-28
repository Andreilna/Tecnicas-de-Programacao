package ex05;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite seu salario atual: "); 
        double salario = scanner.nextDouble(); 

        System.out.print("Digite um percentual de reajuste: "); 
        int percentual = scanner.nextInt(); 

        double novosalario = salario + (salario * percentual)/100; 

        System.out.println("Seu novo salario com reajuste de " + percentual + "% eh: " + novosalario); 

        scanner.close(); 
    }  
}