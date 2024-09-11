import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

    /*
    Crie uma interface que faça a conversão de moedas, o usuário entra com um valor em
    Real e o programa disponibiliza um botão para converter o valor em Euro e outro botão para
    apresentar em Dólar. Utilize botões de rádio. 
    */



public class exercicio49 extends JFrame {
    // Componentes da interface gráfica
    private JLabel lblValorReal, lblResultado;
    private JTextField txtValorReal;
    private JRadioButton rbtnEuro, rbtnDolar;
    private JButton btnConverter;
    private ButtonGroup grupoMoeda;

    // Taxas de conversão
    private final double TAXA_EURO = 0.18; // Exemplo de taxa de conversão de Real para Euro
    private final double TAXA_DOLAR = 0.20; // Exemplo de taxa de conversão de Real para Dólar

    // Construtor da interface gráfica
    public exercicio49() {
        setTitle("Conversão de Moedas");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inicializando os componentes
        lblValorReal = new JLabel("Valor em Real:");
        lblResultado = new JLabel(""); // Resultado será exibido aqui

        txtValorReal = new JTextField();

        rbtnEuro = new JRadioButton("Converter para Euro");
        rbtnDolar = new JRadioButton("Converter para Dólar");

        grupoMoeda = new ButtonGroup();
        grupoMoeda.add(rbtnEuro);
        grupoMoeda.add(rbtnDolar);

        btnConverter = new JButton("Converter");

        // Adicionando os componentes ao JFrame
        add(lblValorReal);
        add(txtValorReal);
        add(rbtnEuro);
        add(rbtnDolar);
        add(new JLabel()); // Espaço vazio
        add(btnConverter);
        add(lblResultado); // Exibindo o resultado

        // Evento do botão Converter
        btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo o valor em Real
                    double valorReal = Double.parseDouble(txtValorReal.getText());

                    // Calculando o valor convertido
                    double resultado = 0;
                    String moeda = "";

                    if (rbtnEuro.isSelected()) {
                        resultado = valorReal * TAXA_EURO;
                        moeda = "Euro";
                    } else if (rbtnDolar.isSelected()) {
                        resultado = valorReal * TAXA_DOLAR;
                        moeda = "Dólar";
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione a moeda para conversão.");
                        return;
                    }

                    // Formatando o resultado
                    DecimalFormat df = new DecimalFormat("0.00");
                    String resultadoFormatado = String.format("R$ %s convertido para %s: %s %s",
                            df.format(valorReal), moeda, moeda.equals("Euro") ? "€" : "$", df.format(resultado));

                    // Exibindo o resultado
                    lblResultado.setText(resultadoFormatado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio49().setVisible(true);
            }
        });
    }
}
