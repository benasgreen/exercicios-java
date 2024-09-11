import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio36 {
    

    /*
     Analisar  o código gerado no programa  Visualg, entender a sua lógica e desenvolver um algoritmo utilizando a linguagem Java.

        var cidade : caractere
        escreval ("Digite um nome de cidade")
        leia (cidade)
        escolha cidade
        caso "Jundiai", "Santos", "Mauá", "Diadema" 
        escreval ("É uma cidade de São Paulo")
        caso "Monte Verde","Camanducaia","Pouso Alegre"	
        escreval ("É uma cidade de Minas Gerais")
        outrocaso
        escreval ("É uma cidade não listada no programa")
        fimescolha												

     
    */






    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);
               
        String continua = "S";
        
        while (continua.equalsIgnoreCase("S")){
            
            try{
            
            String cidade = JOptionPane.showInputDialog("Digite o nome da Cidade: ");
            
            switch ( cidade){
             case "Santos" , "Jundiai", "Maua", "Diadema" :{
                 JOptionPane.showMessageDialog(null, cidade + " Eh uma cidade de Sao Paulo");
                 break;   
             } 
             case "Monte Verde", "Camanducaia", "Pouso Alegre"  :{
                 JOptionPane.showMessageDialog(null, cidade + " Eh uma cidade de Minas Gerais");
                 break;   
             }
             default: {
              JOptionPane.showMessageDialog(null, cidade + " Eh uma cidade nao listada no programa");
              break;
             }
        }
        continua = JOptionPane.showInputDialog("\n Fim de Escolha" + "\n\n Deseja Continuar (S/N) : ");
        }catch (java.lang.NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Digitar somente numeros e nao utilizar virgula ");
                
            }catch (java.lang.NullPointerException e){
                                JOptionPane.showMessageDialog(null, "Não enviar campos em branco (nulo)");
            }
        }
        entradaDados.close();

    }
}
