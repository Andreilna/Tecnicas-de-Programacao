package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        float nota1, nota2, nota3, nota4, nota5, nota6; 

        System.out.print("Digite a primeira nota: "); 
        nota1 = scanner.nextInt(); 

        System.out.print("Digite a segunda nota: "); 
        nota2 = scanner.nextInt(); 

        System.out.print("Digite a terceira nota: "); 
        nota3 = scanner.nextInt(); 

        float media1 = (nota1 + nota2 + nota3)/2; 

        System.out.println("A media 1 eh: " + media1); 

        System.out.print("Digite a quarta nota: "); 
        nota4 = scanner.nextInt(); 

        System.out.print("Digite a quinta nota: "); 
        nota5 = scanner.nextInt(); 

        System.out.print("Digite a sexta nota: "); 
        nota6 = scanner.nextInt(); 

        float media2 = (nota4 + nota5 + nota6)/2; 

        System.out.println("A media 2 eh: " + media2); 
        float somamedia = media1 + media2; 

        System.out.print("A soma das medias das notas eh: " + somamedia); 

        scanner.close(); 
    }
}