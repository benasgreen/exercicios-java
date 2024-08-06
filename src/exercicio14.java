import java.util.Scanner;

public class exercicio14 {
    
    /*
     * A potência (P) consumida por determinado aparelho eletroeletrônico é definida pela tensão (V) multiplicada pela corrente (A). 
     * Elaborar um programa que, a partir da tensão e corrente 
    */

    public static void main(String[] args) {
        
         // Incializar/ instanciar a variavel de entrada 
         Scanner entradaDados = new Scanner(System.in);
         
         // Receber as variaveis que informadas
         
         System.out.println("Digite a tensao do equipamento: ");
         float tensao = entradaDados.nextFloat();
         
         System.out.println("Digite a corrente do equipamento: ");
         float corrente = entradaDados.nextFloat();
         
         // Criar a variavel potencia e calcular o valor ( P=V*I)
         
         float potencia;
         
         potencia = tensao*corrente;
         
         // Mostrar o valor encontrado
         
         System.out.println("Valor da potencia = " + potencia + " Watts");


    }
}
