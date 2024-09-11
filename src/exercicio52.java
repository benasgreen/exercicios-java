import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    /*
        Interface para calcular a quantidade de espetinhos que serão servidos em um churrasco
        em comemoração ao aniversário do senhor Stefam, o programa recebe a quantidade de
        adultos e crianças convidadas, e deverá retornar um valor aproximado da quantidade de
        espetinhos que serão necessários par a realização deste evento.
      
      
    */




public class exercicio52 extends JFrame {

    // Componentes da interface gráfica
    private JLabel lblAdultos, lblCriancas, lblResultado;
    private JTextField txtAdultos, txtCriancas;
    private JButton btnCalcular;

    // Valores fixos de consumo
    private static final int ESPETINHOS_ADULTO = 5; // Espetinhos por adulto
    private static final int ESPETINHOS_CRIANCA = 3; // Espetinhos por criança

    // Construtor da interface gráfica
    public exercicio52() {
        setTitle("Cálculo de Espetinhos para Churrasco");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inicializando os componentes
        lblAdultos = new JLabel("Quantidade de Adultos:");
        lblCriancas = new JLabel("Quantidade de Crianças:");
        lblResultado = new JLabel(""); // Resultado será exibido aqui

        txtAdultos = new JTextField();
        txtCriancas = new JTextField();

        btnCalcular = new JButton("Calcular");

        // Adicionando os componentes ao JFrame
        add(lblAdultos);
        add(txtAdultos);
        add(lblCriancas);
        add(txtCriancas);
        add(btnCalcular);
        add(lblResultado);

        // Evento do botão Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo os dados do usuário
                    int adultos = Integer.parseInt(txtAdultos.getText());
                    int criancas = Integer.parseInt(txtCriancas.getText());

                    // Calculando a quantidade de espetinhos
                    int totalEspetinhos = (adultos * ESPETINHOS_ADULTO) + (criancas * ESPETINHOS_CRIANCA);

                    // Exibindo o resultado
                    String resultado = String.format("Serão necessários aproximadamente %d espetinhos.", totalEspetinhos);
                    lblResultado.setText(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para a quantidade de pessoas.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio52().setVisible(true);
            }
        });
    }
}
