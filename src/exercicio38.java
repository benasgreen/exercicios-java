import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio38 {
    

    /*
    Escreva um programa que conte quantos números pares e ímpares existem em um
    intervalo fornecido pelo usuário, ao final oferecer a possibilidade de novo cálculo.
    */



    public static void main(String[] args) {
        
     
        Scanner entradaDados = new Scanner(System.in);
        
        String continua = "S";
        
        while (continua.equalsIgnoreCase("S") ){
            try {
           
                String numinitxt = JOptionPane.showInputDialog("Digite o numero inicial:");
                String numfintxt = JOptionPane.showInputDialog("Digite o numero final");
            
                float numini = Float.parseFloat(numinitxt);
                float numfin = Float.parseFloat(numfintxt);
            
                float numpar = 0;
                float i = 0;
                float n = 0;
                int qtdepar = 0;
                int qtdeimpar = 0;
            
                while ( numini <= numfin ){
                    numpar = numini % 2;
                    if (numpar == 0){
                       qtdepar = qtdepar + 1;
                    }else{
                        qtdeimpar = qtdeimpar + 1;                        
                    }
                numini = numini+ 1;
                }
            
                JOptionPane.showMessageDialog(null, " QTDE DE NUMEROS PARES: = " + qtdepar + "\n QTDE DE NUMEROS IMPARES: " + qtdeimpar);
            
                continua = JOptionPane.showInputDialog("Deseja continuar: (S/N");
            
            } catch (java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(null, "Não enviar campos em branco (nulo)");
            }       



    }
}
}