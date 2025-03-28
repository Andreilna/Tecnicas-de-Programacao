package ex04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double salariomin = 1518;  

        System.out.print("Digite seu salario atual: "); 
        double salario = scanner.nextDouble(); 

        double calc = salario / salariomin; 

        System.out.println("Voce recebe aproximadamente " + String.format("%.1f salarios minimos!", calc)); 

        scanner.close(); 
    }
}