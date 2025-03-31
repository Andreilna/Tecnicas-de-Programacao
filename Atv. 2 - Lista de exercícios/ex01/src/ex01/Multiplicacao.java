package ex01;

public class Multiplicacao {
    private int valor;
    private int resultado;

    public Multiplicacao() {
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplicadoPor4(){
        this.resultado = this.valor * 4;
    }
    
}