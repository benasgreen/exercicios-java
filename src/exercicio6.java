import java.util.Scanner;
//Exercício 6: Crie um programa que determine se um número é par ou ímpar.
public class exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        // Fecha o scanner
        scanner.close();


    }
}
