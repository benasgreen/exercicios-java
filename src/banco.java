import javax.swing.JOptionPane;

public class banco {
    public static void main(String[] args) {
         String usuario = "", senha = "", aux = "", novaSenha = "";
        double contador = 0, saldoAtual = 1000, saque = 0, emprestimo = 0, verificacao = 0, vp = 0, deposito = 0, taxaJuros = 0.4;
        int opc = 0, parcela = 0;

        do {
            usuario = JOptionPane.showInputDialog("Informe o usuário");
            senha = JOptionPane.showInputDialog("Informe a senha");

            if (usuario.equals("123") && senha.equals("123")) {
                contador += 4;
            } else if (contador == 3) {
                JOptionPane.showMessageDialog(null, "Por diversas tentativas seu acesso foi bloqueado");
                System.exit(0);
            } else {
                contador += 1;
            }
        } while (contador <= 3);

        boolean voltarLogin = false;

        do {
            try {
                
                aux = JOptionPane.showInputDialog("Olá, seja bem vindo! Escolha as opções a seguir"
                        + "\n1. Consultar Saldo"
                        + "\n2. Saque"
                        + "\n3. Solicitação de Empréstimo"
                        + "\n4. Depósito"
                        + "\n5. Trocar Senha"
                        + "\n6. Voltar à área de Login"
                        + "\n7. Sair");
                opc = Integer.parseInt(aux);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!");
            }

            switch (opc) {
                case 1:
                    // Opção para consultar o saldo
                    JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + saldoAtual);
                    break;
                case 2:
                    try {
                        // Opção para sacar
                        aux = JOptionPane.showInputDialog("Informe o valor do saque");
                        saque = Double.parseDouble(aux);
                        if (saque <= saldoAtual)
                            saldoAtual -= saque;
                        else
                            JOptionPane.showMessageDialog(null, "Saque maior que o saldo");
                    } catch (NumberFormatException erro) {
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                    }
                    JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + saldoAtual);
                    break;
                case 3:
                    try {
                        // Opção para emprestimo
                        aux = JOptionPane.showInputDialog("Informe o valor do empréstimo");
                        emprestimo = Double.parseDouble(aux);
                        verificacao = saldoAtual * 2;
                        if (emprestimo <= verificacao) {
                            aux = JOptionPane.showInputDialog("Informe a quantidade de parcelas");
                            parcela = Integer.parseInt(aux);
                            vp = (emprestimo * (1 + taxaJuros)) / parcela;
                            JOptionPane.showMessageDialog(null, "O seu empréstimo ficou em " + parcela + "X  de R$" + vp);
                            aux = JOptionPane.showInputDialog("Deseja prosseguir o empréstimo? S/N");
                            if (aux.equalsIgnoreCase("s"))
                                saldoAtual += emprestimo;
                        } else {
                            JOptionPane.showMessageDialog(null, "Empréstimo não autorizado");
                        }
                    } catch (NumberFormatException erro) {
                        JOptionPane.showMessageDialog(null, "Digite apenas números");
                    }
                    break;
                case 4:
                    try {
                        // Opção para depositar
                        aux = JOptionPane.showInputDialog("Informe o valor do depósito");
                        deposito = Double.parseDouble(aux);
                        saldoAtual += deposito;
                        JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + saldoAtual);
                    } catch (NumberFormatException erro) {
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                    }
                    break;
                case 5:
                    // Opção para trocar a senha
                    novaSenha = JOptionPane.showInputDialog("Informe a nova senha");
                    senha = novaSenha;
                    JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
                    break;
                case 6:
                    // Opção para voltar à área de login
                    voltarLogin = true;-
                    break;
                case 7:
                    aux = JOptionPane.showInputDialog("Você realmente deseja sair do programa? (S) ou (N)");
                    if (aux.equalsIgnoreCase("s")) {
                        JOptionPane.showMessageDialog(null, "Até logo!");
                        System.exit(0);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        } while (opc >= 0 && opc <= 7 && !voltarLogin);



    }
}
