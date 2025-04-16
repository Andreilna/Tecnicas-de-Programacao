package exercicio07;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        CalculoQuadrado calculoQuadrado = new CalculoQuadrado();
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação desejada: \n"
                    + "1 - Calcular a área do quadrado. \n"
                    + "2 - Calcular perimetro do quadrado. \n"
                    + "3 - Mostrar valores.\n"
                    + "0 - Sair"));
            
            switch (op) {
                case 1:{
                    double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
                    calculoQuadrado.calcularArea(ladoA);
                    break;
                }
                case 2:{
                    double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
                    calculoQuadrado.calcularPerimetro(ladoA);
                    break;
                }
                case 3:
                    calculoQuadrado.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
            }
        } while (op != 0);
    }
}
