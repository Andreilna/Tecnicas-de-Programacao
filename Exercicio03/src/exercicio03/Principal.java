package exercicio03;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        double pontos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de pontos: "));
        String ni = null;
        
        Prova nivel = new Prova(nome, pontos, ni);
        
        nivel.nivelProva();
        
        nivel.listarResultado();
    }
}