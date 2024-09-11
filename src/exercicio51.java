import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

    /*
     Interface para calcular o consumo de combustível em uma viagem, o programa recebe o
     nome do motorista, a distância, consumo e valor da gasolina, apresenta como resultado o
     nome do motorista com o valor gasto na viagem.
      
    */


public class exercicio51 extends JFrame {

    // Componentes da interface gráfica
    private JLabel lblNomeMotorista, lblDistancia, lblConsumo, lblValorGasolina, lblResultado;
    private JTextField txtNomeMotorista, txtDistancia, txtConsumo, txtValorGasolina;
    private JButton btnCalcular;

    // Formatação para o valor gasto
    private DecimalFormat df = new DecimalFormat("R$ 0.00");

    // Construtor da interface gráfica
    public exercicio51() {
        setTitle("Cálculo de Consumo de Combustível");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Inicializando os componentes
        lblNomeMotorista = new JLabel("Nome do Motorista:");
        lblDistancia = new JLabel("Distância (km):");
        lblConsumo = new JLabel("Consumo (km/l):");
        lblValorGasolina = new JLabel("Valor da Gasolina (R$/l):");
        lblResultado = new JLabel(""); // Resultado será exibido aqui

        txtNomeMotorista = new JTextField();
        txtDistancia = new JTextField();
        txtConsumo = new JTextField();
        txtValorGasolina = new JTextField();

        btnCalcular = new JButton("Calcular");

        // Adicionando os componentes ao JFrame
        add(lblNomeMotorista);
        add(txtNomeMotorista);
        add(lblDistancia);
        add(txtDistancia);
        add(lblConsumo);
        add(txtConsumo);
        add(lblValorGasolina);
        add(txtValorGasolina);
        add(btnCalcular);
        add(lblResultado);

        // Evento do botão Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo os dados do usuário
                    String nomeMotorista = txtNomeMotorista.getText();
                    double distancia = Double.parseDouble(txtDistancia.getText());
                    double consumo = Double.parseDouble(txtConsumo.getText());
                    double valorGasolina = Double.parseDouble(txtValorGasolina.getText());

                    // Calculando o valor gasto
                    double litrosUsados = distancia / consumo;
                    double valorGasto = litrosUsados * valorGasolina;

                    // Exibindo o resultado
                    String resultado = String.format("Sr(a) %s, o valor gasto na viagem é %s", nomeMotorista, df.format(valorGasto));
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
                new exercicio51().setVisible(true);
            }
        });
    }
}
