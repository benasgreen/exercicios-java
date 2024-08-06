public class exercicio11 {

    /*Programa com 4 constantes, cada uma delas receberá uma determinada nota para um
    aluno, apresentar no terminal as notas do aluno e a sua média.*/

    public static void main(String[] args) {
      
        //declarando as variaveis
        final double n1 = 9.0;
        final double n2 = 9.7;
        final double n3 = 6.3;
        final double n4 = 5.1;

        //calculando a media das notas

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Notas do Aluno: ");
        System.out.println("Primeira nota do Aluno: " +n1);
        System.out.println("Segunda nota do Aluno: " +n2);
        System.out.println("Terceira nota do Aluno: " +n3);
        System.out.println("Quarta nota do Aluno: " +n4);
        System.out.println("Media das Notas do Aluno: " +media);
      

    }
}
