package ex12;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
     
        System.out.print("Digite o valor da prestacao: "); 
        int valorp = scanner.nextInt(); 

        System.out.print("Digite a taxa pedida pelo banco: "); 
        int taxa = scanner.nextInt(); 

        System.out.print("Digite o tanto de meses em atraso: "); 
        int tempo = scanner.nextInt(); 

        int calcatraso = valorp + (valorp * (taxa/100)* tempo);  

        System.out.println("O valor com reajuste fica " + calcatraso); 

        scanner.close(); 
    } 
}