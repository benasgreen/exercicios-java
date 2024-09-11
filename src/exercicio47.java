import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    /*
        Programa que recebe dois números inteiros e realiza a soma entre eles, apresenta o
        resultado em um campo de texto.
    */


public class exercicio47 extends JFrame {
    // Componentes da interface gráfica
    private JLabel lblNumero1, lblNumero2, lblResultado;
    private JTextField txtNumero1, txtNumero2, txtResultado;
    private JButton btnSomar;

    // Construtor da interface gráfica
    public exercicio47() {
        setTitle("Soma de Dois Números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Inicializando os componentes
        lblNumero1 = new JLabel("Número 1:");
        lblNumero2 = new JLabel("Número 2:");
        lblResultado = new JLabel("Resultado:");

        txtNumero1 = new JTextField();
        txtNumero2 = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false); // Campo de resultado não editável

        btnSomar = new JButton("Somar");

        // Adicionando os componentes ao JFrame
        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        add(txtNumero2);
        add(new JLabel()); // Espaço vazio
        add(btnSomar);
        add(lblResultado);
        add(txtResultado);

        // Evento do botão Somar
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo os números dos campos de texto
                    int numero1 = Integer.parseInt(txtNumero1.getText());
                    int numero2 = Integer.parseInt(txtNumero2.getText());

                    // Calculando a soma
                    int soma = numero1 + numero2;

                    // Exibindo o resultado no campo de texto
                    txtResultado.setText(String.valueOf(soma));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores inteiros válidos.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio47().setVisible(true);
            }
        });
    }
}
