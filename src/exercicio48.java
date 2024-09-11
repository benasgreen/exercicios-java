import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;



    /*
    Crie uma interface para calcular o reajuste salarial, o programa recebe o nome do
    funcionário, o salário atual e o percentual de reajuste, utilize a Classe DecimalFormat na saída
    de dados, concatenando no resultado o nome do funcionário e o novo salário.

    Exemplo de entrada de dados:
    Nome: Juliana Ortega
    Salário atual: 9999.99
    Reajuste: 13.13%
    Saída de dados:
    Sr(a) Juliana Ortega, seu novo salário será R$ 11.312,99

    A saída pode ser apresentada em uma etiqueta (jLabel) na interface ou em uma caixa de texto
    (JOptionPane).
    */




public class exercicio48 extends JFrame {
    // Componentes da interface gráfica
    private JLabel lblNome, lblSalarioAtual, lblPercentualReajuste, lblResultado;
    private JTextField txtNome, txtSalarioAtual, txtPercentualReajuste;
    private JButton btnCalcular;

    // Construtor da interface gráfica
    public exercicio48() {
        setTitle("Cálculo de Reajuste Salarial");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inicializando os componentes
        lblNome = new JLabel("Nome:");
        lblSalarioAtual = new JLabel("Salário atual:");
        lblPercentualReajuste = new JLabel("Reajuste (%):");
        lblResultado = new JLabel(""); // Resultado será exibido aqui

        txtNome = new JTextField();
        txtSalarioAtual = new JTextField();
        txtPercentualReajuste = new JTextField();

        btnCalcular = new JButton("Calcular Reajuste");

        // Adicionando os componentes ao JFrame
        add(lblNome);
        add(txtNome);
        add(lblSalarioAtual);
        add(txtSalarioAtual);
        add(lblPercentualReajuste);
        add(txtPercentualReajuste);
        add(new JLabel()); // Espaço vazio
        add(btnCalcular);
        add(lblResultado); // Exibindo o resultado

        // Evento do botão Calcular Reajuste
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo os dados dos campos de texto
                    String nome = txtNome.getText();
                    double salarioAtual = Double.parseDouble(txtSalarioAtual.getText());
                    double percentualReajuste = Double.parseDouble(txtPercentualReajuste.getText());

                    // Calculando o novo salário
                    double reajuste = salarioAtual * (percentualReajuste / 100);
                    double novoSalario = salarioAtual + reajuste;

                    // Formatando o resultado
                    DecimalFormat df = new DecimalFormat("R$ 0.00");
                    String resultado = String.format("Sr(a) %s, seu novo salário será %s", nome, df.format(novoSalario));

                    // Exibindo o resultado
                    lblResultado.setText(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio48().setVisible(true);
            }
        });
    }
}
