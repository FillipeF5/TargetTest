public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        // Faturamento diário fornecido diretamente no código
        double[] faturamentoDiario = {1200.50, 3100.75, 0.0, 2000.00, 1500.00, 0.0, 500.00, 
                                      2500.00, 2300.00, 0.0, 1700.50, 1900.00, 0.0, 2700.00, 
                                      0.0, 1600.00, 1200.00, 3000.00, 1800.00, 2200.00};

        double menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
        double maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
        double mediaMensal = calcularMediaMensal(faturamentoDiario);
        int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoDiario, mediaMensal);

        System.out.println("Menor valor de faturamento: R$ " + menorFaturamento);
        System.out.println("Maior valor de faturamento: R$ " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }

    // Método para calcular o menor faturamento diário
    public static double calcularMenorFaturamento(double[] faturamento) {
        double menor = Double.MAX_VALUE;

        for (double valor : faturamento) {
            if (valor > 0 && valor < menor) {  // Ignora dias sem faturamento (valor 0)
                menor = valor;
            }
        }

        return menor;
    }

    // Método para calcular o maior faturamento diário
    public static double calcularMaiorFaturamento(double[] faturamento) {
        double maior = Double.MIN_VALUE;

        for (double valor : faturamento) {
            if (valor > maior) {
                maior = valor;
            }
        }

        return maior;
    }

    // Método para calcular a média mensal de faturamento
    public static double calcularMediaMensal(double[] faturamento) {
        double soma = 0.0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                soma += valor;
                diasComFaturamento++;
            }
        }

        return soma / diasComFaturamento;
    }

    // Método para contar os dias com faturamento acima da média mensal
    public static int contarDiasAcimaDaMedia(double[] faturamento, double media) {
        int count = 0;

        for (double valor : faturamento) {
            if (valor > media) {
                count++;
            }
        }

        return count;
    }
}