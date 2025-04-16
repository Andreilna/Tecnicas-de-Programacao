package exercicio09;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Consorcio consorcio = new Consorcio();

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                Escolha uma das opções:
                1 - Inserir valores do consórcio
                2 - Calcular Total Pago
                3 - Calcular Saldo Devedor
                4 - Mostrar Valores
                0 - Sair do Programa"""));

            switch (op) {
                case 1 ->
                    consorcio.inserirValoresConsorcio();
                case 2 -> {
                    double totalPago = consorcio.calcularTotalPago();
                    JOptionPane.showMessageDialog(null, "Total Pago: R$ " + totalPago);
                }
                case 3 -> {
                    double saldo = consorcio.calcularSaldoDevedor();
                    JOptionPane.showMessageDialog(null, "Saldo Devedor: R$ " + saldo);
                }
                case 4 -> {
                    consorcio.calcularTotalPago();
                    consorcio.calcularSaldoDevedor();
                    JOptionPane.showMessageDialog(null,
                            "Total Pago: R$ " + consorcio.getTotalPago()
                            + "\nSaldo Devedor: R$ " + consorcio.getSaldoDevedor());
                }
                case 0 ->
                    JOptionPane.showMessageDialog(null, "Saindo do Programa...");
                default ->
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 0);
    }
}
