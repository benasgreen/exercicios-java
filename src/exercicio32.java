import javax.swing.JOptionPane;

public class exercicio32 {
    
    /*
     Algoritmo que receba usuário e senha e apresente uma das mensagens abaixo, considere como usuário “admin” e senha “java”.
       CORRETO:    ACESSO LIBERADO
        INCORRETO: ACESSO NEGADO	
     
    */

    public static void main(String[] args) {
        

        String nome = "", senha = "";
        nome = JOptionPane.showInputDialog("Informe o usuario");
        senha = JOptionPane.showInputDialog("Informe a senha");
        if (nome.equals("admin")&& senha.equals("java")){
            JOptionPane.showMessageDialog(null,"Seu acesso foi liberado");
        
        }else
            JOptionPane.showMessageDialog(null,"Seu acesso foi negado");
        


    }
}
