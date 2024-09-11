import javax.swing.JOptionPane;

// Classe que realiza a conversão de metros para pés
class Conversor {
    // Constante de conversão
    private static final double METROS_PARA_PES = 3.28084;
    
    // Método que faz a conversão
    public double converterMetrosParaPes(double metros) {
        return metros * METROS_PARA_PES;
    }
}

// Classe principal para interagir com o usuário
public class exercicio40 {

    /*
        Crie um programa que permita ao usuário converter entre unidades de medida, (metros
        para pés), fórmula para conversão 1 metro = 3,28084 pés.
    */




    public static void main(String[] args) {
        // Criar uma instância do conversor
        Conversor conversor = new Conversor();
        
        // Entrada do usuário
        String metrosTxt = JOptionPane.showInputDialog("Digite o valor em metros para converter para pés:");
        
        try {
            // Converter a entrada para um número
            double metros = Double.parseDouble(metrosTxt);
            
            // Realizar a conversão
            double pes = conversor.converterMetrosParaPes(metros);
            
            // Exibir o resultado
            JOptionPane.showMessageDialog(null, metros + " metros é igual a " + pes + " pés.");
        } catch (NumberFormatException e) {
            // Tratamento para entrada inválida
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
        }
    }
}
