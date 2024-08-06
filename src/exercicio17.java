
import javax.swing.JOptionPane;

public class exercicio17 {

     // Conversao de moedas de real para Dolar e Euro


    public static void main(String[] args) {
        
String aux = "";
      double real = 0, dolar = 4.93, euro = 5.37;
      
      aux = JOptionPane.showInputDialog("Digite a moeda em real para convertemos");
      real = Double.parseDouble(aux);
      dolar = (1/dolar)* real;
      euro = (1 / euro) * real;
      
      JOptionPane.showMessageDialog(null,real+"R$ Convertido para dolar fica: "+dolar+"| USD");
      JOptionPane.showMessageDialog(null,real+"R$ Convertido para euro fica: "+euro+"| EUR");


    }
}
