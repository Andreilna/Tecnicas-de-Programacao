package ex03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite seu nome: "); 
        String nome = scanner.next(); 

        System.out.print("Digite sua idade: "); 
        int idade = scanner.nextInt(); 

        int diasvividos = idade * 365; 

        System.out.println("Voce se chama " + nome + " e tem " + diasvividos + " dias vividos!"); 

        scanner.close();  
    } 
}