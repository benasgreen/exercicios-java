import javax.swing.JOptionPane;

    /*
        Usuário deve fornecer dois números inteiros, e poderá escolher o tipo de operação a ser
        realizada. (soma, subtração, multiplicação, divisão).
     
    */





// Interface que define uma operação
interface Operacao {
    float executar(float num1, float num2); // Método para ser implementado por cada operação
    String getSinal(); // Retorna o sinal da operação
}

// Classe Soma
class Soma implements Operacao {
    @Override
    public float executar(float num1, float num2) {
        return num1 + num2;
    }
    
    @Override
    public String getSinal() {
        return "+";
    }
}

// Classe Subtração
class Subtracao implements Operacao {
    @Override
    public float executar(float num1, float num2) {
        return num1 - num2;
    }
    
    @Override
    public String getSinal() {
        return "-";
    }
}

// Classe Multiplicação
class Multiplicacao implements Operacao {
    @Override
    public float executar(float num1, float num2) {
        return num1 * num2;
    }
    
    @Override
    public String getSinal() {
        return "*";
    }
}

// Classe Divisão
class Divisao implements Operacao {
    @Override
    public float executar(float num1, float num2) {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "NAO DIVIDIRAS POR ZERO");
            return 0;
        }
        return num1 / num2;
    }
    
    @Override
    public String getSinal() {
        return "/";
    }
}

// Classe para exibir o resultado
class Resultado {
    public void exibirResultado(float num1, float num2, String sinal, float total) {
        JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " " + sinal + " " + num2 + " = " + total);
    }
}

// Classe Calculadora que gerencia as entradas e o fluxo de operações
class Calculadora {
    private Operacao operacao;  // Operação atual a ser realizada
    private float num1;
    private float num2;
    
    // Método para receber entrada de dados
    public void entradaDados() {
        String oper = JOptionPane.showInputDialog("Operacao desejada\n" + "\n 1 - Soma" + "\n 2 - Subtracao"
                + "\n 3 - Multiplicacao" + "\n 4 - Divisao");
        
        String num1txt = JOptionPane.showInputDialog("Digite o primeiro numero inteiro: ");
        String num2txt = JOptionPane.showInputDialog("Digite o segundo numero inteiro: ");
        
        num1 = Float.parseFloat(num1txt);
        num2 = Float.parseFloat(num2txt);
        
        defineOperacao(oper);
    }
    
    // Método que define qual operação será realizada
    public void defineOperacao(String oper) {
        switch (oper) {
            case "1":
                operacao = new Soma();
                break;
            case "2":
                operacao = new Subtracao();
                break;
            case "3":
                operacao = new Multiplicacao();
                break;
            case "4":
                operacao = new Divisao();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                return;
        }
        realizarOperacao();
    }
    
    // Método que realiza a operação e exibe o resultado
    public void realizarOperacao() {
        float total = operacao.executar(num1, num2);
        String sinal = operacao.getSinal();
        Resultado resultado = new Resultado();
        resultado.exibirResultado(num1, num2, sinal, total);
    }
}

// Classe principal para executar o programa
public class exercicio39 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.entradaDados();
    }
}
