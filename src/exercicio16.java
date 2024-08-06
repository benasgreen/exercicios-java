import java.util.Scanner;

public class exercicio16 {
    
    //Calcular a média de 10 números digitados pelo usuário.
    public static void main(String[] args) {
        

         // Instanciar a classe Scanner
        
        Scanner entradaDados = new Scanner(System.in);
        
        // Receber os 10 numeros digitados
        
        System.out.println("Digitar o primeiro numero: ");
        float numero01 = entradaDados.nextFloat();
        
        System.out.println("Digitar o segundo numero: ");
        float numero02 = entradaDados.nextFloat();
        
        System.out.println("Digitar o terceiro numero: ");
        float numero03 = entradaDados.nextFloat();
        
        System.out.println("Digitar o quarto numero: ");
        float numero04 = entradaDados.nextFloat();
        
        System.out.println("Digitar o quinto numero: ");
        float numero05 = entradaDados.nextFloat();
        
        System.out.println("Digitar o sexto numero: ");
        float numero06 = entradaDados.nextFloat();
        
        System.out.println("Digitar o setimo numero: ");
        float numero07 = entradaDados.nextFloat();
        
        System.out.println("Digitar o oitavo numero: ");
        float numero08 = entradaDados.nextFloat();
        
        System.out.println("Digitar o nono numero: ");
        float numero09 = entradaDados.nextFloat();
        
        System.out.println("Digitar o decimo numero: ");
        float numero10 = entradaDados.nextFloat();
        
        float media;
        
        // Calcular a media e mostra-la
        
        media = (numero01+numero02+numero03+numero04+numero05+numero06+numero07+numero08+numero09+numero10)/10;
        
        System.out.println("O valor da media eh: " + media);



    }
}
