import javax.swing.JOptionPane;

public class exercicio28 {
    
    /*
    Algoritmo que receba 4 notas de um aluno (só serão aceitas notas entre 0 e 10), calcule a média, caso a média seja maior ou igual a 7, o programa deverá apresentar a frase “Aluno aprovado”, caso a média seja inferior a 7, a frase deverá ser “Aluno reprovado”. 
    */

    public static void main(String[] args) {
        
        String nome = "",aux = "";
        double nota1 = 0,nota2 = 0,nota3 = 0, nota4 = 0, media = 0;
        aux = JOptionPane.showInputDialog("Informe a primeira nota");
        nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Informe a segunda nota");
        nota2 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Informe a terceira nota");
        nota3 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Informe a quarta nota");
        nota4 = Double.parseDouble(aux);
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 7)
            JOptionPane.showMessageDialog(null,"A sua media é de: "+media+ "|Voce foi aprovado!");
        else
            JOptionPane.showMessageDialog(null,"A sua media é de: "+media+"|Voce foi reprovado!");
        
        



    }
}
