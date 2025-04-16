package exercicio07;

import javax.swing.JOptionPane;

public class CalculoQuadrado {
    private double areaQuadrado;
    private double perimetroQuadrado;

    public CalculoQuadrado() {
    }

    public CalculoQuadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    public double calcularArea(double ladoA){
        double area = Math.pow(ladoA, 2);
        setAreaQuadrado(area);
        
        return area;
    }
    
    public double calcularPerimetro(double ladoA){
        double perimetro = ladoA * 4;
        setPerimetroQuadrado(perimetro);
        
        return perimetro;
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + getAreaQuadrado() + " e o perimetro é: " + getPerimetroQuadrado());
    }
}