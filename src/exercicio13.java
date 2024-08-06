import java.util.Scanner;

public class exercicio13 {

    //Crie um programa que receba o nome e o ano de nascimento de uma pessoa, apresente no terminal o nome e a idade.



    public static void main(String[] args) {
        
            // Inicializar a classe Scanner
        Scanner entradaDados = new Scanner (System.in);
        
        // Entrada de dados
        System.out.println("Digite seu nome: ");
        String nome = entradaDados.nextLine();
        
        System.out.println("Digite o ano de nascimento: ");
        int ano = entradaDados.nextInt();
        
        entradaDados.close();
        
        // Criar a variavel idade
        
        int idade;
        
        // Calculo da idade do individo
        
        idade = 2024 - ano;
        
        // Apresentar a idade do individuo;
        
        System.out.println("Sua idade eh: " + idade);



    }
}
