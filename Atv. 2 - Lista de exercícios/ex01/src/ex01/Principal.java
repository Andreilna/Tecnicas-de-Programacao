package ex01;

public class Principal {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao(5, 0);
        
        multiplicacao.multiplicadoPor4();
        
        System.out.println("O resultado da multiplicacao eh: " + multiplicacao.getResultado());
    }
}
