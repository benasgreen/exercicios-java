import javax.swing.JOptionPane;

public class exercicio24 {
    
    /*As maçãs custam R$ 0,30 cada, e R$ 0,25 se forem compradas pelo menos doze ou mais unidades. 
    Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.*/

    public static void main(String[] args) {
        
        double maca = 0, valor = 0;
        String aux = ";";
        aux = JOptionPane.showInputDialog("Informe a quantidade de maças:");
        maca = Double.parseDouble(aux);
        if (maca >= 12){
            valor = 0.25 * maca;
            JOptionPane.showMessageDialog(null,"A unidade da maça sai no valor de: 0.25R| O valor total foi de"+valor+"R$");
        }else{
            valor = 0.30 * maca;
            JOptionPane.showMessageDialog(null,"A unidade da maça sai no valor de: 0.30R| O valor total foi de"+valor+"R$");
        }



    }
}
