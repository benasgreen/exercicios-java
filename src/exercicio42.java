import javax.swing.JOptionPane;


    /*
      Acrescente ao programa criado no exercício 39 as operações de        potência e raiz quadrada
      utilizando os métodos da Classe Math.

    
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

// Classe Potência
class Potencia implements Operacao {
    @Override
    public float executar(float num1, float num2) {
        return (float) Math.pow(num1, num2);
    }
    
    @Override
    public String getSinal() {
        return "^";
    }
}

// Classe Raiz Quadrada (usa apenas num1, ignora num2)
class RaizQuadrada implements Operacao {
    @Override
    public float executar(float num1, float num2) {
        return (float) Math.sqrt(num1);
    }
    
    @Override
    public String getSinal() {
        return "√";
    }
}

// Classe para exibir o resultado
class Resultado {
    public void exibirResultado(float num1, float num2, String sinal, float total) {
        if (sinal.equals("√")) {
            JOptionPane.showMessageDialog(null, "Resultado: " + sinal + num1 + " = " + total);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " " + sinal + " " + num2 + " = " + total);
        }
    }
}

// Classe Calculadora que gerencia as entradas e o fluxo de operações
class Calculadora {
    private Operacao operacao;  // Operação atual a ser realizada
    private float num1;
    private float num2;
    
    // Método para receber entrada de dados
    public void entradaDados() {
        String oper = JOptionPane.showInputDialog("Operacao desejada\n" 
                + "\n 1 - Soma" 
                + "\n 2 - Subtracao"
                + "\n 3 - Multiplicacao" 
                + "\n 4 - Divisao"
                + "\n 5 - Potencia"
                + "\n 6 - Raiz Quadrada");
        
        String num1txt = JOptionPane.showInputDialog("Digite o primeiro numero:");
        num1 = Float.parseFloat(num1txt);
        
        if (!oper.equals("6")) { // Raiz quadrada não precisa de segundo número
            String num2txt = JOptionPane.showInputDialog("Digite o segundo numero:");
            num2 = Float.parseFloat(num2txt);
        }
        
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
            case "5":
                operacao = new Potencia();
                break;
            case "6":
                operacao = new RaizQuadrada();
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
public class exercicio42 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.entradaDados();
    }
}
