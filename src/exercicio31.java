import javax.swing.JOptionPane;

public class exercicio31 {
    
    /*
    Faça um programa que receba o valor de uma compra e apresente o valor a ser pago de acordo a forma de pagamento:
    DINHEIRO: desconto de 10%
    PIX: desconto de 5%
    Cartão de débito/crédito: acréscimo de 15%	
    */


    public static void main(String[] args) {
        
        String aux = "";
       
        double valor = 0,dinheiro = 0.10, pix = 0.5, card = 0.15;
        aux = JOptionPane.showInputDialog("Informe o valor das suas compras!");
        valor = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Informe qual seria o metodo de pagamento!Descontos |(a)Dinheiro %10|(b)Pix% 5|(c)Cartao %15|");
        if (aux.equals ("a")){
            valor = valor - (valor * dinheiro);
            JOptionPane.showMessageDialog(null,"valor a pagar: "+valor);
            }else if (aux.equals ("b")){
            valor = valor - (valor * pix);{
            JOptionPane.showMessageDialog(null,"valor a pagar: "+valor);
            }}else if (aux.equals ("c")){
            valor = valor + (valor * card);{
            JOptionPane.showMessageDialog(null,"Valor a pagar: "+valor);
        
    
    }    
}
    }
}


