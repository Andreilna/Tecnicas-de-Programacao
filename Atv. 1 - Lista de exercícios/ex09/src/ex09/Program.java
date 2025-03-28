package ex09;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite um numero: "); 
        int num1 = scanner.nextInt(); 

        System.out.print("Digite outro numero: "); 
        int num2 = scanner.nextInt(); 

        int calc1 = num1 * 2; 
        int calc2 = num2 * 3; 

        System.out.println("O dobro do primeiro numero eh " + calc1 + " e o do segundo eh " + calc2); 

        scanner.close(); 
    }
}