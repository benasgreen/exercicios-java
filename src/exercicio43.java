import javax.swing.JOptionPane;

public class exercicio43 {

    /*
        Utilizando a Classe Math, crie um programa para calcular a hipotenusa de um triângulo
        retângulo utilizando o teorema de Pitágoras, os catetos A e B devem ser informados pelo
        usuário.
    */





    public static void main(String[] args) {
        // Solicita ao usuário os valores dos catetos A e B
        String catetoATxt = JOptionPane.showInputDialog("Digite o valor do cateto A:");
        String catetoBTxt = JOptionPane.showInputDialog("Digite o valor do cateto B:");
        
        // Converte os valores para float
        float catetoA = Float.parseFloat(catetoATxt);
        float catetoB = Float.parseFloat(catetoBTxt);
        
        // Calcula a hipotenusa usando o Teorema de Pitágoras: hipotenusa^2 = catetoA^2 + catetoB^2
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo é: " + hipotenusa);
    }
}
