import javax.swing.JOptionPane;

public class exercicio30 {


    /*
    Fornecida e idade e nome de um jogador de futsal, informe a sua categoria de acordo a tabela abaixo:
    Infantil: até 10 anos
    Juvenil: até 18 anos
    Profissional: acima de 18
    Sênior: acima de 40 anos	
    */

    public static void main(String[] args) {
        

        String nome = "", aux = "";
        int idade = 0;
        // infatil = 0
        //juvenil = <= 18
        // profissional > 18
        //senior > 40
        aux = JOptionPane.showInputDialog("Informe o seu nome!");
        nome = aux;
        aux = JOptionPane.showInputDialog("Informe sua idade");
        idade = Integer.parseInt(aux);
        if (idade >= 0 && idade <= 10){
            JOptionPane.showMessageDialog(null,"Nome: "+nome+" | Categoria: Infantil");
            }else if (idade >= 11 && idade <= 18){
                JOptionPane.showMessageDialog(null,"Nome: "+nome+" | Categoria: Juvenil");
            }else if (idade >= 19 && idade <= 40){
                        JOptionPane.showMessageDialog(null,"Nome: "+nome+" | Categoria: profissional");
            }else
                            JOptionPane.showMessageDialog(null,"Nome: "+nome+" | Categoria: Sênior");
                    
        }

    }




