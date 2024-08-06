import java.util.Scanner;

public class exercicio19 {
    
    /* Um usuário possui internet banda larga com velocidade fixa de 250 Mb (250 megabits) por segundo. Elabore um programa que receba o tamanho do arquivo em bytes e apresente a quantidade de segundos necessários para fazer o download. Considere que 8 bits equivalem a 1 byte.*/
    
    
    public static void main(String[] args) {
        
       
        Scanner entradaDados = new Scanner (System.in);
        
        System.out.println("Digite o tamanho do arquivo em quantidade de bytes: ");
        
        double quantidadebytes = entradaDados.nextDouble();
        double tempogasto;
        
        tempogasto = quantidadebytes / 31000000.25;
        
        System.out.println(" Tempo gasto para Download do arquivo de tamaho : " + quantidadebytes + " Bytes => " + tempogasto + " Segundos");
       
       entradaDados.close(); 

    }
}
