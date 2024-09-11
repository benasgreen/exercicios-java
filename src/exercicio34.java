import javax.swing.JOptionPane;

public class exercicio34 {
    


    /*
     As organizações Jundiaí resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.  
     Faça um programa que recebe o nome, função e o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
     Salários até R$ 1.280,00: aumento de 20%;
        Salários entre R$ 1.280,01 e R$1.700,00: aumento de 15%;
        Salários entre R$ 1.700,01 e R$ 2.500,00: aumento de 10%;
        Salários de R$ 2.500,01 em diante: aumento de 5%
        Após o aumento ser realizado; informe na tela;
    
        O salário antes do reajuste;
        O percentual de aumento aplicado;
        O valor do aumento;
        O novo salário, após o aumento.	
     
    */


    public static void main(String[] args) {

        String aux = "", nome = "",funcao = "";
        double salario = 0, salario2 = 0, percentual = 0;
        nome = JOptionPane.showInputDialog("Informe seu nome");
        funcao = JOptionPane.showInputDialog("Informe a sua fução");
        aux = JOptionPane.showInputDialog("Informe seu salario!");
        salario = Double.parseDouble(aux);
        if (salario <= 1280){
            salario2 = salario;
            salario = salario + (salario * 0.20);
            percentual = 20;
            JOptionPane.showMessageDialog(null,"Salario antes do reajuste: "+salario2+"R$|Percentual aplicado de 25%|Valor atual: "+salario+"R$");
        } else if (salario >= 1280.01 && salario <= 1700.00){
            salario2 =  salario;
            salario = salario + (salario * 0.15);
            JOptionPane.showMessageDialog(null,"Salario antes do reajuste: "+salario2+"R$|Percentual aplicado de 15%|Valor atual: "+salario+"R$");
        }else if (salario >= 1700.01 && salario <= 2500.00){
            salario2 = salario;
            salario = salario + (salario * 0.10);
            JOptionPane.showMessageDialog(null,"Salario antes do reajuste: "+salario2+"R$|Percentual aplicado de 10%|Valor atual: "+salario+"R$");
        }
        


    }
}
