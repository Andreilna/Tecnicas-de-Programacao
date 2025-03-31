package ex02;

public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(8, 0);
        
        quadrado.calcularQuadrado();
        
        System.out.print("O resultado do numero digitado ao quadrado eh: " + quadrado.getResultado());
    }
}
