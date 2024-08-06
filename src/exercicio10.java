public class exercicio10 {
    
    /*Programa que recebe em constantes os seguintes dados: nome, dia, mês e ano de
    nascimento, apresentar no terminal uma frase concatenando os dados das constantes.*/

    public static void main(String[] args) {
        
        // Definindo as constantes para os dados pessoais
        final String NOME = "Rafael Sbrana";
        final int DIA = 22;
        final int MES = 03;
        final int ANO = 1991;

        // Criando a frase com os dados concatenados
        String mensagem = "Nome: " + NOME + ", Data de Nascimento: " + DIA + "/" + MES + "/" + ANO;

        // Exibindo a frase no terminal
        System.out.println(mensagem);



    }
}
