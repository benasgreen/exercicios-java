import java.util.Scanner;

public class exercicio20 {
    /*Elabore um programa que receba dois valores numéricos e apresente em tela o resultado das quatro operações matemáticas básicas entre eles, ou seja, soma, subtração, multiplicação e divisão.*/



    public static void main(String[] args) {
        
          
        // Instancia a class Scanner
        
        Scanner entradaDados = new Scanner(System.in);
        
        //Recebe os numeros digitados
        
        System.out.println("Digite um numero qualquer:");
        float numero01 = entradaDados.nextFloat();
        
        System.out.println("Digite um outro numero qualquer:");
        float numero02 = entradaDados.nextFloat();
        
        // Efetua os calculos
        
        float soma = numero01 + numero02;
        float subtracao = numero01 - numero02;
        float multiplicacao = numero01 * numero02;
        float divisao = numero01 /numero02;
        
        System.out.println("Resultado das operacoes aritmeticas: => Soma: " + soma);
        System.out.println("Resultado das operacoes aritmeticas: => Subtracao: " + subtracao);
        System.out.println("Resultado das operacoes aritmeticas: => Multiplicacao: " + multiplicacao);
        System.out.println("Resultado das operacoes aritmeticas: => Divisao: " + divisao);

        entradaDados.close();

    }
}
