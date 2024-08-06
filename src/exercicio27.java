import java.text.DecimalFormat;
import java.util.Scanner;


public class exercicio27 {
    

    /*Algoritmo para saque em conta corrente, a conta possui 1.000, após o saque informar na tela o saldo atual, não permitir saques com valor mais alto que o saldo na conta.exemplos de mensagens
    o valor solicitado é maior que o disponível em sua conta
    saldo atual R$

    saque liberado
    saldo atual R$
    */

    public static void main(String[] args) {
        

       
         //Instanciar a classe Scanner para fazer a leitura de daos de entrada
		
		Scanner entradaDados = new Scanner(System.in);
		
		//Instaciar a classe Digital Format para a formatacao da qtde de casas decimais
		
		DecimalFormat formatnum = new DecimalFormat("0.00");
		
		// Criacao das variaives
		
		double ccsaldo = 1000.00;
		double ccsaldoatual = ccsaldo;
		
		// Recebe o valor do saque digitado
		
		System.out.println("Digite o valor do saque ");
		double ccsaque = entradaDados.nextDouble();
		
		// Verifica se o valor do saqu eh maior que o valor do saldo
		
		if (ccsaque > ccsaldoatual) {
		   System.out.println("O valor solicitado eh maior que o disponivel em sua conta");
		   System.out.println("saldo atual R$ " + formatnum.format(ccsaldoatual));
		}else { 
			ccsaldoatual = ccsaldoatual - ccsaque;
			System.out.println("Saque liberado.");
			System.out.println("Saldo atual: R$ "+ formatnum.format(ccsaldoatual));
		}
		
		entradaDados.close();
        
    }
}
