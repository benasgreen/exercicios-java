import javax.swing.JOptionPane;

public class exercicio29 {


    /*
    Algoritmo para saque em conta corrente, a conta possui 1.000, após o saque informar na tela o saldo atual, não permitir saques com valor mais alto que o saldo na conta.
    exemplos de mensagens
    o valor solicitado é maior que o disponível na conta
    saldo atual R$

    saque liberado
    saldo atual R$	
    */

public static void main(String[] args) {
    String aux = "";
    double saldo = 1000.00, saque = 0;
    aux = JOptionPane.showInputDialog("O seu saldo é de: "+ saldo+" Informe qual valor da sua transferencia");
    saque = Double.parseDouble(aux);
    saldo = saldo - saque;
    if (saldo <= -1){
            saldo = saldo + saque;
            JOptionPane.showMessageDialog(null,"Valor insuficiente seu saldo é de "+ saldo);
        
    }else if (saldo >= 0){
                JOptionPane.showMessageDialog(null,"Transferencia realiza com sucesso seu saldo atual é de: "+saldo);
        }
    
}

}