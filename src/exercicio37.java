import javax.swing.JOptionPane;

public class exercicio37 {
    

    /*-Escreva um programa que leia um número inteiro e verifique se ele é positivo ou negativo.
    Utilize um laço while ou do while para continuar lendo novos números até que o usuário
    informe zero como entrada.
    */


    public static void main(String[] args) {
        
        int continua = 0;
		
		while (continua == 0){
		          			
		    String numerotxt =JOptionPane.showInputDialog( "Digite um numero Positivo ou Negativo: ");
		    float numero = Float.parseFloat(numerotxt);
		    if ( numero == 0) {
		        JOptionPane.showMessageDialog(null, "PARABENS VC ACERTOU O NUMERO => "+ numero) ;
		        continua = 1;
		    } 
		    if (numero > 0) {
		         JOptionPane.showMessageDialog(null, " Numero POSITIVO de valor = " + numero);
		         JOptionPane.showMessageDialog(null, "\n Sorry!!! Let's try again");
		    }
		    if (numero <0) {
		        JOptionPane.showMessageDialog(null, " Numero NEGATIVO de valor = " + numero);
		       JOptionPane.showMessageDialog(null, "Sorry!!! Let's try again");
		    }    


    }

    }
}