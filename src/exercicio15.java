import java.util.Scanner;

public class exercicio15 {
    
    // Receber os valores de tensao e potencia de um determinado equipamento e calcular a corrente
         



    public static void main(String[] args) {
        
        // Incializar/ instanciar a variavel de entrada

         Scanner entradaDados = new Scanner(System.in);
         
         // Receber as variaveis informadas
         
         System.out.println("Digite a tensao do equipamento: ");
         float tensao = entradaDados.nextFloat();
         
         System.out.println("Digite a potencia do equipamento: ");
         float potencia = entradaDados.nextFloat();
         
         // Criar a variavel corrente e calcular o valor ( P=V*I logo; I=P/V )
         
         float corrente;
         
         corrente = potencia / tensao;
         
         // Mostrar o valor encontrado
         
         System.out.println("Valor da potencia = " + corrente + " Amperes");


    }
}
