import java.text.DecimalFormat;

public class exercicio07 {

   /* Calcular o valor em amperes para os disjuntores que irão proteger a rede elétrica.
    Chuveiro 01 - 8500watts x 220v
    Chuveiro 02 - 5000watts x 220v
    Chuveiro 03 - 7500watts x 220v
*/


    public static void main(String[] args) {

        double tensao = 220; //em volts
        double chuveiro1 = 8500;   //em watts
        double chuveiro2 = 5000;   //em watts
        double chuveiro3 = 7500;   //em watts

        double correnteChuveiro1 = chuveiro1 / tensao;
        double correnteChuveiro2 = chuveiro2 / tensao;
        double correnteChuveiro3 = chuveiro3 / tensao;


        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Para um chuveiro de 8500 watts, voce precisa de um disjuntor de " + df.format(correnteChuveiro1) + " amperes!");
        System.out.println("Para um chuveiro de 5000 watts, voce precisa de um disjuntor de " + df.format(correnteChuveiro2) + " amperes!");
        System.out.println("Para um chuveiro de 7500 watts, voce precisa de um disjuntor de " + df.format(correnteChuveiro3) + " amperes!");
        
    }
}
