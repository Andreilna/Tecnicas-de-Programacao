package exercicio04;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        CalculadoraBasica calc;
        int op;
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "Calculadora Básica\n" +
                "1 - Soma\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão\n" +
                "0 - Sair\n" +
                "Escolha uma opção:"));
            
            if (op == 0) {
                JOptionPane.showMessageDialog(null, "Finalizando programa!");
                break;
            }
            
            if (op < 0 || op > 4){
                JOptionPane.showMessageDialog(null, "Erro: Digite uma opção válida!");
                continue;
            } 
              
            try {
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                calc = new CalculadoraBasica(num1, num2);
                
                switch (op) {
                    case 1:
                        calc.somar();
                        break;
                    case 2:
                        calc.subtrair();
                        break;
                    case 3:
                        calc.multiplicar();
                        break;
                    case 4:
                        calc.dividir();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Finalizando programa!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção invalida!");
                        continue;
                }
                
                JOptionPane.showMessageDialog(null, "Resultado: " + calc.getR());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida!");
            }
        } while (op != 0);
    }
}