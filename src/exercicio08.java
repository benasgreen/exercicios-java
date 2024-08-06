public class exercicio08 {

    /*Criar um programa com 4 constantes, cada constante possui um número do tipo inteiro,
    utilizar todos os operadores aritméticos para realizar cálculos com estes números, apresentar
    os resultados no terminal.*/


    public static void main(String[] args) {
        
        final int num1 = 10;
        final int num2 = 5;
        final int num3 = 7;
        final int num4 = 122;


        int soma = num1 + num2  ;
        int subtracao = num1 - num2 ;
        int multiplicacao = num1 * num2 ;
        double divisao = num1 / num2 ;
        


        System.out.println("O Resultado de " +num1+ " + " +num2+ " = " + soma  );
        System.out.println("O Resultado de " +num2+ " - " +num3+ " = " + subtracao  );
        System.out.println("O Resultado de " +num3+ " X " +num2+ " = " + multiplicacao  );
        System.out.println("O Resultado de " +num3+ " / " +num4+ " = " + divisao  );
        




    }
}
