import java.util.Scanner;

    //Exercício 5: Implemente um programa que calcule a soma, subtração, multiplicação e divisão de dois números.

public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

      
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multipicacao = num1 * num2;
        double divisao = 0;

            if(num2 != 0) {
                divisao = num1 / num2;
                
            }   else {
                    System.out.println("Erro:divisão por zero não é permitida.");
            }

            System.out.println("O resultado da soma é: " + soma);
            System.out.println("O resultado da subtracao é: " + subtracao);
            System.out.println("O resultado da multiplicacao é: " + multipicacao);
            System.out.println("O resultado da divisao é: " + divisao);
           

            scanner.close();

    }
}
