import java.util.Scanner;

    //Exercício 2: Crie um programa que solicite o nome do usuário e exiba uma mensagem de boas-vindas personalizada.

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();


        System.out.println("Bem-vindo(a), " + nome + "!");

        scanner.close();


    }
}
