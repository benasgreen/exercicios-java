import javax.swing.JOptionPane;

public class exercicio26 {
    
    /*Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/


    public static void main(String[] args) {
        

        String aux = "";
        long[] num= new long[3];
        
        aux = JOptionPane.showInputDialog("Informe o primeiro numero:");
        num[0] = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o segundo numero");
        num[1] = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o terceiro numero");
        num[2] = Integer.parseInt(aux);
        if (num[0]< num[1]){
            if (num[1] < num[2]){
                JOptionPane.showMessageDialog(null,num[0]+"-"+num[1]+"-"+num[2]);
            }
            else if (num[0] < num[2]){
                JOptionPane.showMessageDialog(null,num[0]+"-"+num[2]+"-"+num[1]);
            } else{
                JOptionPane.showMessageDialog(null,num[2]+"-"+num[0]+"-"+num[1]);
            }
            
       
        }
        else if (num[1] < num[2]){
            if (num[0] < num[2]){
               JOptionPane.showMessageDialog(null,num[1]+"-"+num[0]+"-"+num[2]);
            } else{
                JOptionPane.showMessageDialog(null,num[1]+"-"+num[2]+"-"+num[0]);
            }
        }else {
            JOptionPane.showMessageDialog(null,num[2]+"-"+num[1]+"-"+num[0]);
            }


    }
}
