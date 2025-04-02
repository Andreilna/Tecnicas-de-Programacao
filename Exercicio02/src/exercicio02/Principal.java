package exercicio02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        OlimpiadaMatematica olimpiadaMatematica = new OlimpiadaMatematica();
        
        System.out.print("Digite a menor nota: ");
        olimpiadaMatematica.setNotamenor(entrada.nextDouble());
        
         System.out.print("Digite a maior nota: ");
        olimpiadaMatematica.setNotamaior(entrada.nextDouble());
        
        olimpiadaMatematica.calcularMedia();
        olimpiadaMatematica.verificarMedia();
    }
}