import java.util.Scanner;

//Exercício 4: Crie um programa que converta temperaturas de Celsius para Fahrenheit.

public class exercicio4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        // inserindo a temperatura em Celsius

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();


        // convertendo a temperatura paara fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;


        //exebindo a temperatura convertida

        System.out.println(celsius + " graus Celsius é igua a " + fahrenheit + " graus Fahrenheit." );

            //fechando o scanner
        scanner.close();

    }
}
