package exercicio05;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        ControleComissao vendedor = new ControleComissao();
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "Controle de Comissão\n" +
                "1 - Entrar Nome\n" +
                "2 - Entrar Salário Base\n" +
                "3 - Entrar Valor Vendido\n" +
                "4 - Calcular Comissão\n" +
                "5 - Consultar Dados\n" +
                "0 - Sair\n" +
                "Escolha uma opção:"));

            if (op == 0) {
                JOptionPane.showMessageDialog(null, "Finalizando programa!");
                break;
            }

            switch (op) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                    vendedor.setNome(nome);
                    break;
                case 2:
                    try {
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base:"));
                        vendedor.setSalarioBase(salario);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Erro: Entrada inválida para salário.");
                    }
                    break;
                case 3:
                    try {
                        double vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido:"));
                        vendedor.setValorVendido(vendas);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Erro: Entrada inválida para vendas.");
                    }
                    break;
                case 4:
                    vendedor.calculoComissao();
                    JOptionPane.showMessageDialog(null, "Comissão calculada com sucesso!\nNovo salário: R$ " + vendedor.getNovoSalario());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,
                        "Nome: " + vendedor.getNome() +
                        "\nSalário Base: R$ " + vendedor.getSalarioBase() +
                        "\nValor Vendido: R$ " + vendedor.getValorVendido() +
                        "\nNovo Salário com Comissão: R$ " + vendedor.getNovoSalario());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 0);
    }
}