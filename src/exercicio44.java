import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// Classe responsável pela conversão de moedas
class ConversaoMoeda {
    private DecimalFormat df = new DecimalFormat("0.00");
    private double qtde;
    private double resultado;
    private String moedaOrigem;
    private String moedaDestino;

    // Método que solicita entrada de dados e define a operação de conversão
    public void entradaDados() {
        String opcao = JOptionPane.showInputDialog(null, "Escolha o tipo de conversão de moedas:" +
                "\n 1- Real => Dólar" +
                "\n 2- Real => Euro" +
                "\n 3- Dólar => Real" +
                "\n 4- Dólar => Euro" +
                "\n 5- Euro => Real" +
                "\n 6- Euro => Dólar");

        conversao(opcao);
    }

    // Método que define qual conversão será realizada
    private void conversao(String opcao) {
        switch (opcao) {
            case "1": realParaDolar(); break;
            case "2": realParaEuro(); break;
            case "3": dolarParaReal(); break;
            case "4": dolarParaEuro(); break;
            case "5": euroParaReal(); break;
            case "6": euroParaDolar(); break;
            default: JOptionPane.showMessageDialog(null, "Opção inválida!"); break;
        }
    }

    // Métodos para cada tipo de conversão
    private void realParaDolar() {
        moedaOrigem = "Reais";
        moedaDestino = "Dólar";
        qtde = obterValor("Informe o valor em Reais:");
        resultado = qtde / 5.38;  // Conversão atual
        apresentarResultado();
    }

    private void realParaEuro() {
        moedaOrigem = "Reais";
        moedaDestino = "Euro";
        qtde = obterValor("Informe o valor em Reais:");
        resultado = qtde / 5.75;  // Conversão atual
        apresentarResultado();
    }

    private void dolarParaReal() {
        moedaOrigem = "Dólar";
        moedaDestino = "Reais";
        qtde = obterValor("Informe o valor em Dólares:");
        resultado = qtde * 5.38;  // Conversão atual
        apresentarResultado();
    }

    private void dolarParaEuro() {
        moedaOrigem = "Dólar";
        moedaDestino = "Euro";
        qtde = obterValor("Informe o valor em Dólares:");
        resultado = qtde / 1.06858;  // Conversão atual
        apresentarResultado();
    }

    private void euroParaReal() {
        moedaOrigem = "Euro";
        moedaDestino = "Reais";
        qtde = obterValor("Informe o valor em Euros:");
        resultado = qtde * 5.75;  // Conversão atual
        apresentarResultado();
    }

    private void euroParaDolar() {
        moedaOrigem = "Euro";
        moedaDestino = "Dólar";
        qtde = obterValor("Informe o valor em Euros:");
        resultado = qtde * 1.06858;  // Conversão atual
        apresentarResultado();
    }

    // Método para obter o valor da conversão
    private double obterValor(String mensagem) {
        String valorTxt = JOptionPane.showInputDialog(null, mensagem);
        return Double.parseDouble(valorTxt);
    }

    // Método para exibir o resultado da conversão
    private void apresentarResultado() {
        JOptionPane.showMessageDialog(null, "Valor em " + moedaOrigem + ": " + df.format(qtde) +
                "\nConvertido em " + moedaDestino + ": " + df.format(resultado));
        
        // Pergunta ao usuário se deseja continuar
        String continua = JOptionPane.showInputDialog(null, "Deseja continuar? (S/N)");
        if (continua.equalsIgnoreCase("S")) {
            entradaDados();
        }
    }
}

// Classe principal para executar o programa
public class exercicio44 {
    public static void main(String[] args) {
        ConversaoMoeda conversor = new ConversaoMoeda();
        conversor.entradaDados();
    }
}
