package ex01; 

import java.util.Scanner; 

public class Program { 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in); 

        double n1, n2; 

        System.out.print("Digite o primeiro numero: "); 
        n1 = scanner.nextDouble(); 

        System.out.print("Digite o segundo numero: "); 
        n2 = scanner.nextDouble(); 

        double soma = n1 + n2; 
        double subtracao = n1 - n2; 
        double multiplicacao = n1 * n2; 
        double divisao = (n1 / n2); 

        System.out.println("Soma: " + soma); 
        System.out.println("Subtraaoo: " + subtracao); 
        System.out.println("Multiplicaaoo: " + multiplicacao); 
        System.out.println("Divisao: " + divisao); 

        scanner.close(); 
    } 
} 