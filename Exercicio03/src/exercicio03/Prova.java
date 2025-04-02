package exercicio03;

import javax.swing.JOptionPane;

public class Prova {
    private String nome;
    private Double pontos;
    private String nivel;

    public Prova() {
    }

    public Prova(String nome, Double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPontos() {
        return pontos;
    }

    public void setPontos(Double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        if (getPontos() <= 100){
            nivel = "Nível 1.";
            JOptionPane.showMessageDialog(null, nivel);
        } else if (getPontos() > 100 && getPontos() < 200){
            nivel = "Nível 2.";
            JOptionPane.showMessageDialog(null, nivel);
        } else {
            nivel = "Nível 3.";
            JOptionPane.showMessageDialog(null, nivel);
        }
    }
    
    public void listarResultado(){
        String mensagem = "Nome: " + getNome() + "\nPontos: " + getPontos() + "\nNível: " + getNivel();
        
        JOptionPane.showMessageDialog(null, mensagem);
    }  
}