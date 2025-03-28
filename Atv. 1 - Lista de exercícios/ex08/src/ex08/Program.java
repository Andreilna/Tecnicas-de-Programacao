package ex08;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite em centimetros um lado para um retangulo: "); 
        int lado1 = scanner.nextInt(); 

        System.out.print("Digite em centimetros outro lado para um retangulo: "); 
        int lado2 = scanner.nextInt(); 

        int area = lado1 * lado2; 
        int perimetro = (lado1 * 2) + (lado2 * 2); 

        System.out.println("A area deste retangulo eh de " + area + "cm tendo como perimetro " + perimetro + "cm!"); 

        scanner.close(); 
    }
}