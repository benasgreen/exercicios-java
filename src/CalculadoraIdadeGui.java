import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


    /*
        Crie uma interface gráfica para calcular a idade de uma pessoa, utilizando como base o
        código disponível nos slides. O usuário digita o seu nome e a data de nascimento, na saída o
        programa apresenta o nome concatenando com a idade do usuário. 
      
      
    */




public class CalculadoraIdadeGui extends JFrame {

    // Componentes da interface gráfica
    private JLabel lblNome, lblDataNascimento, lblResultado;
    private JTextField txtNome, txtDataNascimento;
    private JButton btnCalcular;

    // Construtor da interface gráfica
    public CalculadoraIdadeGui() {
        setTitle("Calculadora de Idade");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Inicializando os componentes
        lblNome = new JLabel("Nome:");
        lblDataNascimento = new JLabel("Data de Nascimento (dd/MM/yyyy):");
        lblResultado = new JLabel();

        txtNome = new JTextField();
        txtDataNascimento = new JTextField();

        btnCalcular = new JButton("Calcular Idade");

        // Adicionando os componentes ao JFrame
        add(lblNome);
        add(txtNome);
        add(lblDataNascimento);
        add(txtDataNascimento);
        add(btnCalcular);
        add(lblResultado);

        // Evento do botão Calcular Idade
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIdade();
            }
        });
    }

    private void calcularIdade() {
        String nome = txtNome.getText();
        String dataNascimentoStr = txtDataNascimento.getText();

        // Verifica se os campos estão preenchidos
        if (nome.isEmpty() || dataNascimentoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        try {
            // Formato da data
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
            LocalDate hoje = LocalDate.now();
            Period periodo = Period.between(dataNascimento, hoje);
            int idade = periodo.getYears();

            // Atualiza o rótulo com o resultado
            lblResultado.setText(String.format("Sr(a) %s, sua idade é %d anos.", nome, idade));
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use o formato dd/MM/yyyy.");
        }
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraIdadeGui().setVisible(true);
            }
        });
    }
}
