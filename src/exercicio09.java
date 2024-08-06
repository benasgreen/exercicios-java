public class exercicio09 {  

    /*Programa com 2 constantes armazenando os lados de um retângulo, calcular e apresentar
    no terminal os resultados.*/



    public static void main(String[] args) {

           // Definindo duas constantes para os lados do retângulo
           final int LADO1 = 10; // Comprimento do retângulo
           final int LADO2 = 5;  // Largura do retângulo
   
           // Calculando a área do retângulo (área = comprimento * largura)
           int area = LADO1 * LADO2;
   
           // Calculando o perímetro do retângulo (perímetro = 2 * (comprimento + largura))
           int perimetro = 2 * (LADO1 + LADO2);
   
           // Exibindo os resultados no terminal
           System.out.println("A área do retângulo é: " + area + " unidades quadradas.");
           System.out.println("O perímetro do retângulo é: " + perimetro + " unidades.");



    }
}
