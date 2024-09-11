import javax.swing.JOptionPane;
import java.text.DecimalFormat;

    /*
     Sistema para uma imobiliária. O programa deve receber como entradas: nome do
     corretor de imóveis, nome do cliente e a cidade onde está localizado o terreno, comprimento e
     largura do terreno, se existe ou não área construída, caso positivo, deverá ser informado a
     área construída em metros quadrados. Pesquise o valor do metro quadrado nas seguintes
      cidades: Jundiaí, Campo Limpo Paulista, Jarinu, Várzea Paulista e Itupeva. Caso o imóvel esteja
     localizado em uma cidade não listada, calcular o valor de venda de acordo a média das cidades
       listadas. O programa deverá calcular o valor de venda do imóvel, e a partir deste valor,
        apresentar a taxa a ser paga a imobiliária que deverá corresponder a 3% do valor do imóvel, e
        a comissão a ser paga ao corretor de imóveis de acordo a tabela abaixo:
        Imóveis urbanos 6%,
        Imóveis rurais 10%,
        Imóveis industriais 8%,
        Venda judicial 5%.
        Na saída o programa deve apresentar o nome do corretor, valor de venda do imóvel e valor da
        comissão a ser paga ao corretor e valor das taxas administrativas. Verificar e tratar os possíveis
        erros de execução do programa. Oferecer ao final a possibilidade de fazer nova utilização do
        sistema.
    */



// Classe responsável pela imobiliária e suas operações
class Imobiliaria {
    private static final String NOME_IMOBIL = "IMOBILIÁRIA PAU NO GATO";
    private DecimalFormat df = new DecimalFormat("R$ 0.00");
    private String nomeCorretor;
    private String nomeCliente;
    private String cidadeImovel;
    private String tipoImovel;
    private double comprimento;
    private double largura;
    private double areaConstruida;
    private double valorImovel;
    private double areaTotal;
    private double taxaImobiliaria;
    private double valorComissao;
    
    // Valores do metro quadrado por cidade
    private final double m2Jundiai = 1000.00;
    private final double m2ClPaulista = 900.00;
    private final double m2VgPaulista = 800.00;
    private final double m2Jarinu = 700.00;
    private final double m2Itupeva = 600.00;
    
    // Taxas de comissão por tipo de imóvel
    private final double comUrbano = 0.06;
    private final double comRurais = 0.10;
    private final double comIndustriais = 0.08;
    private final double comJudicial = 0.05;
    
    // Taxa imobiliária fixa
    private final double taxaImobiliariaPercentual = 0.03;

    // Método de entrada principal para começar o cadastro
    public void entradaDados() {
        try {
            String opcao = JOptionPane.showInputDialog(null, NOME_IMOBIL + "\n\n(1) Cadastro corretor" +
                    "\n\n(2) Cadastro Cliente" + "\n\n(3) Cadastro Imóvel" + "\n\n(4) Sair");
            cadastro(opcao);
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Não enviar campos em branco (nulo)");
        }
    }

    // Método que direciona para o cadastro correto baseado na escolha do usuário
    private void cadastro(String opcao) {
        switch (opcao) {
            case "1": cadastrarCorretor(); break;
            case "2": cadastrarCliente(); break;
            case "3": cadastrarImovel(); break;
            case "4": System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "Opção inválida!"); entradaDados(); break;
        }
    }

    // Método para cadastrar o corretor
    private void cadastrarCorretor() {
        nomeCorretor = JOptionPane.showInputDialog(null, "Nome do corretor: ");
        entradaDados();
    }

    // Método para cadastrar o cliente
    private void cadastrarCliente() {
        nomeCliente = JOptionPane.showInputDialog(null, "Nome do cliente: ");
        entradaDados();
    }

    // Método para cadastrar o imóvel e suas características
    private void cadastrarImovel() {
        try {
            String cidadeOpcao = JOptionPane.showInputDialog(null, "Escolha a Cidade do Imóvel: \n(1) Jundiaí\n(2) Campo Limpo Paulista" +
                    "\n(3) Jarinu\n(4) Várzea Paulista\n(5) Itupeva\n(6) Outros");
            String tipoOpcao = JOptionPane.showInputDialog(null, "Escolha o tipo do Imóvel: \n(1) Urbano\n(2) Rural\n(3) Industrial\n(4) Judicial");

            comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Comprimento do terreno (m2): "));
            largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Largura do terreno (m2): "));
            areaTotal = comprimento * largura;

            String areaConstruidaOpcao = JOptionPane.showInputDialog(null, "Tem Construção? (S/N)");
            if (areaConstruidaOpcao.equalsIgnoreCase("S")) {
                areaConstruida = Double.parseDouble(JOptionPane.showInputDialog(null, "Área construída (m2): "));
            }

            calcularValorImovel(cidadeOpcao);
            calcularComissao(tipoOpcao);
            apresentarDados();
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Não enviar campos em branco (nulo)");
        }
    }

    // Método para calcular o valor do imóvel com base na cidade
    private void calcularValorImovel(String cidadeOpcao) {
        switch (cidadeOpcao) {
            case "1": valorImovel = areaTotal * m2Jundiai; cidadeImovel = "Jundiaí"; break;
            case "2": valorImovel = areaTotal * m2ClPaulista; cidadeImovel = "Campo Limpo Paulista"; break;
            case "3": valorImovel = areaTotal * m2Jarinu; cidadeImovel = "Jarinu"; break;
            case "4": valorImovel = areaTotal * m2VgPaulista; cidadeImovel = "Várzea Paulista"; break;
            case "5": valorImovel = areaTotal * m2Itupeva; cidadeImovel = "Itupeva"; break;
            case "6": valorImovel = areaTotal * ((m2Jundiai + m2ClPaulista + m2Jarinu + m2VgPaulista + m2Itupeva) / 5); cidadeImovel = "Outros"; break;
            default: JOptionPane.showMessageDialog(null, "Cidade inválida!"); entradaDados(); break;
        }
        taxaImobiliaria = valorImovel * taxaImobiliariaPercentual;
    }

    // Método para calcular a comissão do corretor com base no tipo de imóvel
    private void calcularComissao(String tipoOpcao) {
        switch (tipoOpcao) {
            case "1": valorComissao = valorImovel * comUrbano; tipoImovel = "Urbano"; break;
            case "2": valorComissao = valorImovel * comRurais; tipoImovel = "Rural"; break;
            case "3": valorComissao = valorImovel * comIndustriais; tipoImovel = "Industrial"; break;
            case "4": valorComissao = valorImovel * comJudicial; tipoImovel = "Judicial"; break;
            default: JOptionPane.showMessageDialog(null, "Tipo de imóvel inválido!"); entradaDados(); break;
        }
    }

    // Método para apresentar os dados finais da operação
    private void apresentarDados() {
        JOptionPane.showMessageDialog(null, NOME_IMOBIL +
                "\n\nCidade: " + cidadeImovel +
                "\nTipo do Imóvel: " + tipoImovel +
                "\nÁrea do terreno: " + areaTotal + " m²" +
                "\nÁrea construída: " + areaConstruida + " m²" +
                "\nValor do Imóvel: " + df.format(valorImovel) +
                "\nTaxa Imobiliária: " + df.format(taxaImobiliaria) +
                "\nCliente: " + nomeCliente +
                "\nCorretor: " + nomeCorretor +
                "\nComissão do Corretor: " + df.format(valorComissao));
        
        entradaDados();
    }
}

// Classe principal para rodar o programa
public class exercicio45 {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();
        imobiliaria.entradaDados();
    }
}
