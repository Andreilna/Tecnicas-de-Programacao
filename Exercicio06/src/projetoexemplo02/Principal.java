package projetoexemplo02;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        CustoPiso piso = new CustoPiso();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação desejada: \n"
                    + "1 - Inserir valores do comodo. \n"
                    + "2 - Calcular preço por área. \n"
                    + "3 - Mostrar valores. \n"
                    + "0 - Sair"));

            if (op == 1) {
                piso.inserirValores();
            } else if (op == 2) {
                piso.calcularPrecoArea();
            } else if (op == 3) {
                piso.mostrarValores();
            } else if (op == 0) {
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 0);
    }
}
