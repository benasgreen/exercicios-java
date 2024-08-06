import javax.swing.JOptionPane;

public class exercicio25 {
    
    /* Escreva um programa para ler a idade de uma pessoa, escrever uma mensagem no terminal, 
    informando se esta pessoa pode ou não votar na próxima eleição. Caso não esteja apta para votar, 
    informe quantos anos faltam para que o usuário possa exercer o direito de votar. 
    No Brasil todas as pessoas entre 18 e 70 anos devem votar (voto obrigatório), 
    entre 16, 17 anos e acima de 70 (voto facultativo).*/

    public static void main(String[] args) {
        

        String aux = "";
        int ano = 0;
        aux = JOptionPane.showInputDialog("Informe o ano do seu nascimento");
        ano = Integer.parseInt(aux); 
        ano = 2024 - ano;
        
        if (ano >=18 && ano <= 70)
            JOptionPane.showMessageDialog(null,"Sua idade é: "+ano+"  I voce deve votar");
        else {
            JOptionPane.showMessageDialog(null,"Sua idade é: "+ano+"  I voce nao deve votar");
        }
            


    }
}
