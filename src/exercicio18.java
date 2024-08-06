import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio18{
    
   /* Crie um programa em que o usuário entra com um valor de salário em reais, na saída será informado a ele os seguintes valores:									
    Valor do adiantamento de salário = 40%
    Valor do desconto em folha de = 8%
    Valor com os descontos em seu pagamento ao final do mês.  */

    public static void main(String[] args) {
        
        
		// Instanciar a Classe Scanner na Variavel entradaDados
		
		Scanner entradaDados = new Scanner(System.in);
		
		// Instanciar a Classe FormatDecimal para formatar os numeros com 2 casas decimais
		
		DecimalFormat formatnum = new DecimalFormat("0.00");
	
		// Criar a variaveis para o desenvolvimento do programa
		
		double salarioliquido;
		double adiantamento = 40; //  Valor do percentual a ser descontado do salario
		
		// Receber o valor do salario
		
		System.out.println("Digitar o valor do salario bruto: ");
		
		double salariobruto = entradaDados.nextDouble();
				
		// Calcula o valor do salário liquido - os descontos
		
		salarioliquido = salariobruto - (salariobruto * adiantamento / 100);
		
		// Formata o valor da variavel salarioliquido em 2 casas decimais
		
	System.out.println("Valor do Salario Liquido com desconto do adiantamento : " + adiantamento + " %" + " = R$ " + formatnum.format (salarioliquido));
		
	            entradaDados.close();	

    }
}
