package exercicio02;

import javax.swing.JOptionPane;

public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notamenor;
    private double notamaior;
 
    public OlimpiadaMatematica() {
    }
 
    public OlimpiadaMatematica(String nome, String endereco, double media, double notamenor, double notamaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notamenor = notamenor;
        this.notamaior = notamaior;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getEndereco() {
        return endereco;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public double getMedia() {
        return media;
    }
 
    public void setMedia(double media) {
        this.media = media;
    }
 
    public double getNotamenor() {
        return notamenor;
    }
 
    public void setNotamenor(double notamenor) {
        this.notamenor = notamenor;
    }
 
    public double getNotamaior() {
        return notamaior;
    }
 
    public void setNotamaior(double notamaior) {
        this.notamaior = notamaior;
    }
    public void calcularMedia(){
        media = (getNotamenor() + getNotamaior())/2;
    }
    public void verificarMedia(){
        System.out.println("A media eh: " + getMedia());
        if(getMedia() > 9){
            JOptionPane.showMessageDialog(null, "Aluno inscrito!");
        } else{
            JOptionPane.showMessageDialog(null, "Media insuficiente");
        }
    }
}