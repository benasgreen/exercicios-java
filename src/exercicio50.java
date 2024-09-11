import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    /*
     Criar uma interface gráfica, em que o usuário insira como dados de entrada, a potência e a
     tensão de utilização de um chuveiro, na saída o programa deve apresentar a sugestão de uso
     do disjuntor e a bitola do fio a ser utilizado na rede elétrica.

        Seção nominal (mm²) Corrente Máxima (A)
     1,5 mm² 15 A
     2,5 mm² 21 A
     4 mm² 28 A
     6 mm² 36 A
     10mm ² 50 A
     25 mm ² 89 A
     70 mm ² 171
     * 
    */




public class exercicio50 extends JFrame {

    // Componentes da interface gráfica
    private JLabel lblPotencia, lblTensao, lblResultado;
    private JTextField txtPotencia, txtTensao;
    private JButton btnCalcular;

    // Construtor da interface gráfica
    public exercicio50() {
        setTitle("Cálculo de Disjuntor e Bitola do Fio");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Inicializando os componentes
        lblPotencia = new JLabel("Potência (W):");
        lblTensao = new JLabel("Tensão (V):");
        lblResultado = new JLabel(""); // Resultado será exibido aqui

        txtPotencia = new JTextField();
        txtTensao = new JTextField();

        btnCalcular = new JButton("Calcular");

        // Adicionando os componentes ao JFrame
        add(lblPotencia);
        add(txtPotencia);
        add(lblTensao);
        add(txtTensao);
        add(btnCalcular);
        add(lblResultado);

        // Evento do botão Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo a potência e a tensão
                    double potencia = Double.parseDouble(txtPotencia.getText());
                    double tensao = Double.parseDouble(txtTensao.getText());

                    // Calculando a corrente
                    double corrente = potencia / tensao;

                    // Determinando a bitola do fio e o disjuntor
                    String bitola = "";
                    String disjuntor = "";

                    if (corrente <= 15) {
                        bitola = "1,5 mm²";
                        disjuntor = "15 A";
                    } else if (corrente <= 21) {
                        bitola = "2,5 mm²";
                        disjuntor = "21 A";
                    } else if (corrente <= 28) {
                        bitola = "4 mm²";
                        disjuntor = "28 A";
                    } else if (corrente <= 36) {
                        bitola = "6 mm²";
                        disjuntor = "36 A";
                    } else if (corrente <= 50) {
                        bitola = "10 mm²";
                        disjuntor = "50 A";
                    } else if (corrente <= 89) {
                        bitola = "25 mm²";
                        disjuntor = "89 A";
                    } else {
                        bitola = "70 mm²";
                        disjuntor = "171 A";
                    }

                    // Exibindo o resultado
                    String resultado = String.format("Corrente: %.2f A\nBitola do Fio: %s\nDisjuntor: %s", corrente, bitola, disjuntor);
                    lblResultado.setText(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para potência e tensão.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio50().setVisible(true);
            }
        });
    }
}
