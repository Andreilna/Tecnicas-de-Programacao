package ex10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite um numero: "); 
        int num = scanner.nextInt(); 

        int calc = num * num; 

        System.out.println("O numero digitado ao quadrado eh: " + calc); 

        scanner.close(); 
    }
}