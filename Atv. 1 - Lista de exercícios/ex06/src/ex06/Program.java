package ex06;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite a quantidade de litros abastecidos: "); 
        int litros = scanner.nextInt(); 

        double valorpago = litros * 4.39; 

        System.out.println("O valor pago em " + litros + " litros foi de R$" + valorpago); 

        scanner.close();
    }
}