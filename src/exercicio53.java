import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    /*
         Crie uma interface gráfica que simule um caixa de supermercado, o programa deverá receber valores até que seja finalizada a compra, em seguida apresente o valor a ser pago de
         acordo a forma de pagamento:
         DINHEIRO: desconto de 10%
            PIX: valor integral
         Cartão de débito/crédito: acréscimo de 15% 
      
     
    */



public class exercicio53 extends JFrame {

    // Componentes da interface gráfica
    private JLabel lblValorItem, lblFormaPagamento, lblTotal;
    private JTextField txtValorItem;
    private JButton btnAdicionar, btnFinalizar;
    private JComboBox<String> cmbFormaPagamento;

    private double totalCompra = 0.0;

    // Construtor da interface gráfica
    public exercicio53() {
        setTitle("Simulador de Caixa de Supermercado");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inicializando os componentes
        lblValorItem = new JLabel("Valor do Item:");
        lblFormaPagamento = new JLabel("Forma de Pagamento:");
        lblTotal = new JLabel("Total a pagar: R$ 0.00");

        txtValorItem = new JTextField();

        btnAdicionar = new JButton("Adicionar Item");
        btnFinalizar = new JButton("Finalizar Compra");

        // Formas de pagamento
        String[] formasPagamento = { "DINHEIRO", "PIX", "CARTÃO DE DÉBITO/CRÉDITO" };
        cmbFormaPagamento = new JComboBox<>(formasPagamento);

        // Adicionando os componentes ao JFrame
        add(lblValorItem);
        add(txtValorItem);
        add(lblFormaPagamento);
        add(cmbFormaPagamento);
        add(btnAdicionar);
        add(btnFinalizar);
        add(lblTotal);

        // Evento do botão Adicionar Item
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo o valor do item
                    double valorItem = Double.parseDouble(txtValorItem.getText());
                    totalCompra += valorItem;
                    txtValorItem.setText(""); // Limpa o campo de entrada

                    // Atualiza o total a pagar
                    lblTotal.setText(String.format("Total a pagar: R$ %.2f", totalCompra));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para o item.");
                }
            }
        });

        // Evento do botão Finalizar Compra
        btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorFinal = totalCompra;
                String formaPagamento = (String) cmbFormaPagamento.getSelectedItem();

                // Aplica o ajuste baseado na forma de pagamento
                switch (formaPagamento) {
                    case "DINHEIRO":
                        valorFinal *= 0.90; // Desconto de 10%
                        break;
                    case "PIX":
                        // Valor integral, sem ajuste
                        break;
                    case "CARTÃO DE DÉBITO/CRÉDITO":
                        valorFinal *= 1.15; // Acréscimo de 15%
                        break;
                }

                // Exibe o valor final a pagar
                JOptionPane.showMessageDialog(null, String.format("Forma de pagamento: %s\nTotal a pagar: R$ %.2f", formaPagamento, valorFinal));
                totalCompra = 0.0; // Reseta o total para a próxima compra
                lblTotal.setText("Total a pagar: R$ 0.00");
            }
        });
    }

    public static void main(String[] args) {
        // Executando o programa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new exercicio53().setVisible(true);
            }
        });
    }
}
