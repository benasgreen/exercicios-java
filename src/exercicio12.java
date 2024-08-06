import java.util.Scanner;

public class exercicio12 {

    /*Programa que receba em constantes o código de um produto, o nome do produto, valor
    de custo, em seguida calcule em uma variável o valor de venda para este produto
    acrescentando 15% ao valor de custo, apresentar os resultados no terminal. */



    public static void main(String[] args) {
                Scanner entradaDados = new Scanner (System.in);
        
        System.out.println("Digite o Codigo do produto: ");
        int codigo = entradaDados.nextInt();
        
        // Recebe do teclado o Codigo + nome e valor de custo do produto
        
        System.out.println("Digite o Nome do produto: ");
        String nomeProduto = entradaDados.nextLine();
                
        System.out.println("Digite o Valor do produto: ");
        float valorCusto = entradaDados.nextFloat();
        
        entradaDados.close();
         //Calcular valor * 15%
        
        float valorVenda;
        
        valorVenda = valorCusto * 1.15f;
        
        // Mostrar Codigo nome e Valor
        
        System.out.println("Codigo: "+codigo);
        System.out.println("Produto: "+nomeProduto);
        System.out.println("Valor de venda: "+valorVenda);
        


    }
}
