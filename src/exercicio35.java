import javax.swing.JOptionPane;

public class exercicio35 {


    /*
        Pelo cálculo do Índice de Massa Corporal (IMC) é possível saber se uma pessoa está acima ou abaixo dos parâmetros ideais de peso em relação a sua altura. Para calcular o IMC é necessário dividir o peso (KG) de uma pessoa pela sua altura (m) elevada ao quadrado. Elaborar um programa que exiba o valor do IMC de uma pessoa e mostre a sua situação em relação a tabela a seguir.

        Valor do IMC	Situação
        Abaixo de 18,5	Você está abaixo do peso ideal
        Entre 18,5 e 24,9	Parabéns, você está em seu peso normal
        Entre 25,0 e 29,9	Você está acima de seu peso (sobrepeso)
        Entre 30,0 e 34,9	Obesidade grau I
        Entre 35,0 e 39,9	Obesidade grau II
        40,0 e acima	Obesidade grau III
	
	
    */









    public static void main(String[] args) {
        
        String aux = "";
        double altura = 0, peso = 0, imc = 0;
        aux = JOptionPane.showInputDialog("Informe o seu peso");
        peso = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("informe a sua altura");
        altura = Double.parseDouble(aux);
        imc = peso/(altura*altura);
        if (imc <= 18.5)
            JOptionPane.showMessageDialog(null,"voce esta abaixo do peso ideal");
        else if (imc >= 18.6 && imc <= 24.9)
        JOptionPane.showMessageDialog(null,"Parabens, voce esta em seu peso normal!");
        else if (imc >= 25.0 && imc <= 29.9)
            JOptionPane.showMessageDialog(null,"Voce esta acima do seu peso(Sobrepeso)");
        else if (imc >= 30.0 && imc <= 34.9)
            JOptionPane.showMessageDialog(null,"Obesidade grau 1");
        else if (imc >= 35.0 && imc <= 39.9)
            JOptionPane.showMessageDialog(null,"Obesidade grau 2");
        else
            JOptionPane.showMessageDialog(null,"Obesidade grau 3");





    }
}
