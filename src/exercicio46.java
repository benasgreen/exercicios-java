import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    /*
        Programa que recebe os lados de um retângulo, após a inserção dos    dados, calcular a área
        e o perímetro.
     * 
    */


public class exercicio46 extends JFrame {
    // Componentes da interface gráfica
    private JLabel lblLado1, lblLado2, lblArea, lblPerimetro;
    private JTextField txtLado1, txtLado2;
    private JButton btnCalcular;

    // Construtor da interface gráfica
    public exercicio46() {
        setTitle("Cálculo de Área e Perímetro de Retângulo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        // Inicializando os componentes
        lblLado1 = new JLabel("Lado 1 (em metros):");
        lblLado2 = new JLabel("Lado 2 (em metros):");
        lblArea = new JLabel("Área: ");
        lblPerimetro = new JLabel("Perímetro: ");
        
        txtLado1 = new JTextField();
        txtLado2 = new JTextField();
        
        btnCalcular = new JButton("Calcular");

        // Adicionando os componentes ao JFrame
        add(lblLado1);
        add(txtLado1);
        add(lblLado2);
        add(txtLado2);
        add(new JLabel()); // Espaço vazio
        add(btnCalcular);
        add(lblArea);
        add(lblPerimetro);

        // Evento do botão Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado1 = Double.parseDouble(txtLado1.getText());
                    double lado2 = Double.parseDouble(txtLado2.getText());

                    // Calcula a área e o perímetro
                    double area = lado1 * lado2;
                    double perimetro = 2 * (lado1 + lado2);

                    // Atualiza os resultados na interface
                    lblArea.setText("Área: " + area + " m²");
                    lblPerimetro.setText("Perímetro: " + perimetro + " m");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio46().setVisible(true);
            }
        });
    }
}
