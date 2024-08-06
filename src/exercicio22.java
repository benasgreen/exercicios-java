import javax.swing.JOptionPane;

public class exercicio22 {
    
    /*Faça um programa que leia o valor de uma compra, caso o valor seja superior a R$ 150,00, conceda um desconto de 15%, caso contrário, mostre a mensagem "Sem desconto"*/	

    public static void main(String[] args) {
        
         String aux = "";
        double valor = 0, desconto = 0.15, vt;
        aux = JOptionPane.showInputDialog("Valor da compra:");
        valor = Double.parseDouble(aux);
        if (valor >= 150.0){
            desconto = (valor * desconto);
            vt = valor - desconto;
            JOptionPane.showMessageDialog(null, "\"O valor da compra foi: "+valor+"R$| O desconto foi de: "+desconto+"R$| Valor Total: "+vt+"R$");
        
        }else{
            JOptionPane.showMessageDialog(null, "O valor da compra foi:"+valor+"R$| Não obteve desconto");
        }
            ;


    }
}
