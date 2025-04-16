package exercicio08;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Eleitores {
    private int numeroTotalEleitores;
    private int numeroVotosBrancos;
    private int numeroVotosNulos;
    private int numeroVotosValidos;
    private double percBrancos;
    private double percNulo;
    private double percValidos;

    public Eleitores() {
    }

    public Eleitores(int numeroTotalEleitores, int numeroVotosBrancos, int numeroVotosNulos, int numeroVotosValidos, double percBrancos, double percNulo, double percValidos) {
        this.numeroTotalEleitores = numeroTotalEleitores;
        this.numeroVotosBrancos = numeroVotosBrancos;
        this.numeroVotosNulos = numeroVotosNulos;
        this.numeroVotosValidos = numeroVotosValidos;
        this.percBrancos = percBrancos;
        this.percNulo = percNulo;
        this.percValidos = percValidos;
    }

    public int getNumeroTotalEleitores() {
        return numeroTotalEleitores;
    }

    public void setNumeroTotalEleitores(int numeroTotalEleitores) {
        this.numeroTotalEleitores = numeroTotalEleitores;
    }

    public int getNumeroVotosBrancos() {
        return numeroVotosBrancos;
    }

    public void setNumeroVotosBrancos(int numeroVotosBrancos) {
        this.numeroVotosBrancos = numeroVotosBrancos;
    }

    public int getNumeroVotosNulos() {
        return numeroVotosNulos;
    }

    public void setNumeroVotosNulos(int numeroVotosNulos) {
        this.numeroVotosNulos = numeroVotosNulos;
    }

    public int getNumeroVotosValidos() {
        return numeroVotosValidos;
    }

    public void setNumeroVotosValidos(int numeroVotosValidos) {
        this.numeroVotosValidos = numeroVotosValidos;
    }

    public double getPercBrancos() {
        return percBrancos;
    }

    public void setPercBrancos(double percBrancos) {
        this.percBrancos = percBrancos;
    }

    public double getPercNulo() {
        return percNulo;
    }

    public void setPercNulo(double percNulo) {
        this.percNulo = percNulo;
    }

    public double getPercValidos() {
        return percValidos;
    }

    public void setPercValidos(double percValidos) {
        this.percValidos = percValidos;
    }
    
    public void inserirQtdVotos(){
        setNumeroVotosBrancos (Integer.parseInt(JOptionPane.showInputDialog("Digite o valor dos votos em branco: ")));
        setNumeroVotosNulos(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor dos votos nulos: ")));
        setNumeroVotosValidos(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor dos votos válidos: ")));
    }
    public void calcularTotalEleitores(){
        setNumeroTotalEleitores(getNumeroVotosBrancos() + getNumeroVotosNulos() + getNumeroVotosValidos());
    }
    public void calcularPercentualVotos(){
        setPercBrancos(((getNumeroVotosBrancos()*100)/getNumeroTotalEleitores())); 
        setPercNulo(((getNumeroVotosNulos()*100)/getNumeroTotalEleitores()));
        setPercValidos(((getNumeroVotosValidos()*100)/getNumeroTotalEleitores()));
    }
}