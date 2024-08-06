import javax.swing.JOptionPane;

public class exercicio23 {
    

    /*Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.	*/


    public static void main(String[] args) {
        
         String aux = "";
        int num = 0;
        aux = JOptionPane.showInputDialog("Informe o numero para saber se é negativo ou positivo");
        num = Integer.parseInt(aux);
        if (num >= 0)
            JOptionPane.showMessageDialog(null,"O numero: " +num+ " É Possitivo");
        else
            
            JOptionPane.showMessageDialog(null,"O numero: "+ num+" É negativo");

        

    }
}
