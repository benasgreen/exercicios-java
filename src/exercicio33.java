import javax.swing.JOptionPane;

public class exercicio33 {
    
    /*
    Faça um programa para a leitura de duas notas parciais de um aluno. 
    A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
    A mensagem “Aprovado com Distinção”, se a média for igual a dez;
    A mensagem “Recuperação” se a média for entre 5 e 6.99;
    A mensagem “Reprovado” se a média for abaixo de 5.	
    */


    public static void main(String[] args) {
        
        String aux = "";
        double nota1 = 0, nota2 = 0, media = 0;
        aux = JOptionPane.showInputDialog("Informe a primeira nota!");
        nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Informe a Segunda nota!");
        nota2 = Double.parseDouble(aux);
        media = (nota1 + nota2) / 2;
        if (media >= 7 && media <=10){
            JOptionPane.showMessageDialog(null,"Voce foi aprovado");
            }else if (media >= 5 && media <= 6.99){
            JOptionPane.showMessageDialog(null,"Voce esta em recuperação");
            }else
                 JOptionPane.showMessageDialog(null,"Voce foi rerovado");

    }
}
