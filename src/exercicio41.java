import java.text.DecimalFormat;
import javax.swing.JOptionPane;

// Classe que representa o produto
class Produto {
    private String nome;
    private double valorCusto;
    private static final double MARGEM_LUCRO = 0.12; // 12% de margem de lucro
    
    // Construtor
    public Produto(String nome, double valorCusto) {
        this.nome = nome;
        this.valorCusto = valorCusto;
    }
    
    // Método para calcular o preço sugerido (custo + 12% de margem)
    public double calcularPrecoVenda() {
        return valorCusto + (valorCusto * MARGEM_LUCRO);
    }
    
    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }
}

// Classe principal para interagir com o usuário
public class exercicio41 {

    /*
        Crie um programa que receba o nome de um produto e seu valor de custo, a seguir
        acrescente 12% como margem de lucro e apresente como saída o nome do produto e o preço
        sugerido para a venda do produto, se possível, faça a formatação da moeda utilizando a classe
        DecimalFormat.
     
    
    */




    public static void main(String[] args) {
        // Entrada do nome do produto e valor de custo
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        String valorCustoTxt = JOptionPane.showInputDialog("Digite o valor de custo do produto:");

        try {
            // Conversão do valor de custo para double
            double valorCusto = Double.parseDouble(valorCustoTxt);
            
            // Criar uma instância de Produto
            Produto produto = new Produto(nomeProduto, valorCusto);
            
            // Calcular o preço de venda sugerido
            double precoVenda = produto.calcularPrecoVenda();
            
            // Formatar o preço em moeda
            DecimalFormat df = new DecimalFormat("R$ #,##0.00");
            String precoFormatado = df.format(precoVenda);
            
            // Exibir o resultado
            JOptionPane.showMessageDialog(null, "Produto: " + produto.getNome() + "\nPreço sugerido: " + precoFormatado);
            
        } catch (NumberFormatException e) {
            // Tratamento para entrada inválida
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
        }
    }
}
