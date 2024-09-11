import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    /*
        Crie uma interface gráfica para solicitação de cartão de crédito, utilize como base os
        códigos nos slides, inclua no resumo do pedido a data e o horário da solicitação utilizando a
        Classe DateTimeFormatter. Esta interface pode ser incluída no Sistema Bancário, utilizando
        como base o saldo do usuário para aprovar ou não a emissão do cartão.
     
     
     
     
    */





public class exercicio54 extends JFrame {

    // Componentes da interface gráfica
    private JLabel lblNome, lblSaldo, lblLimite, lblResultado;
    private JTextField txtNome, txtSaldo, txtLimite;
    private JButton btnSolicitar;
    private double saldoDisponivel = 5000.00; // Exemplo de saldo disponível para aprovação

    // Construtor da interface gráfica
    public exercicio54() {
        setTitle("Solicitação de Cartão de Crédito");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inicializando os componentes
        lblNome = new JLabel("Nome:");
        lblSaldo = new JLabel("Saldo Disponível:");
        lblLimite = new JLabel("Limite do Cartão:");
        lblResultado = new JLabel();

        txtNome = new JTextField();
        txtSaldo = new JTextField();
        txtLimite = new JTextField();

        btnSolicitar = new JButton("Solicitar Cartão");

        // Adicionando os componentes ao JFrame
        add(lblNome);
        add(txtNome);
        add(lblSaldo);
        add(txtSaldo);
        add(lblLimite);
        add(txtLimite);
        add(btnSolicitar);
        add(lblResultado);

        // Evento do botão Solicitar Cartão
        btnSolicitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processarSolicitacao();
            }
        });
    }

    private void processarSolicitacao() {
        String nome = txtNome.getText();
        String saldoStr = txtSaldo.getText();
        String limiteStr = txtLimite.getText();

        // Verifica se os campos estão preenchidos
        if (nome.isEmpty() || saldoStr.isEmpty() || limiteStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        try {
            double saldo = Double.parseDouble(saldoStr);
            double limite = Double.parseDouble(limiteStr);

            // Verifica se a solicitação pode ser aprovada
            if (saldo >= saldoDisponivel && limite <= saldoDisponivel) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime agora = LocalDateTime.now();
                String dataHoraSolicitacao = agora.format(formatter);
                lblResultado.setText(String.format("Solicitação aprovada para %s. Data e Hora: %s", nome, dataHoraSolicitacao));
            } else {
                lblResultado.setText("Solicitação negada. Verifique o saldo e limite.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Formato de número inválido. Verifique os valores.");
        }
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio54().setVisible(true);
            }
        });
    }
}
