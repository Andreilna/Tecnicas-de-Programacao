package exercicio08;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Eleitores eleitores = new Eleitores();

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções \n "
                    + "1 - Inserir quantidade Votos: \n "
                    + "2 - Calcular Total Eleitores \n "
                    + "3 - Calcular Percentual Votos \n "
                    + "4 - Mostrar Percentual Votos \n "
                    + "0 - Sair do Programa"));

            if (op == 1) {
                eleitores.inserirQtdVotos();
            } else if (op == 2) {
                eleitores.calcularTotalEleitores();
            } else if (op == 3) {
                eleitores.calcularPercentualVotos();
            } else if (op == 4) {
                double percBrancos = eleitores.getPercBrancos();
                double percNulos = eleitores.getPercNulo();
                double percValidos = eleitores.getPercValidos();

                JOptionPane.showMessageDialog(null,
                        "Votos Brancos: " + percBrancos
                        + "% \nVotos Nulos: " + percNulos
                        + "% \nVotos validos: " + percValidos
                        + "%");
            } else if (op == 0) {
                JOptionPane.showMessageDialog(null, "Saindo do Programa...");
            } else {
                JOptionPane.showMessageDialog(null, "Opção invalida!");
            }
        } while (op != 0);
    }
}
