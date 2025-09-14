package List_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Calculo da Venda =====");

            String valorVendaString = "";
            double valorVenda = 0;
            while (true) {
                try {
                    System.out.print("\nDigite o valor da venda: ");
                    valorVendaString = read.nextLine().trim();

                    if(!valorVendaString.isEmpty()) {
                        valorVenda = Double.parseDouble(valorVendaString);
                        break;
                    }
                    else {
                        System.out.println("\nNão é possível deixar campo vazio!");
                    }
                }
                catch (InputMismatchException | NumberFormatException error) {
                    System.out.println("\nDigite apenas números! ");
                }
            }

            double comissaoRepresentante = valorVenda * 0.20;
            double impostos = valorVenda * 0.30;
            double valorVendaFinal = valorVenda - comissaoRepresentante - impostos;

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("\nValor da Venda: %.2f", valorVenda);
            System.out.printf("\nValor da Comissão Representante: %.2f", comissaoRepresentante);
            System.out.printf("\nValor dos Impostos: %.2f", impostos);
            System.out.printf("\nValor Final da Venda: %.2f\n", valorVendaFinal);

            while (true) {
                System.out.print("\nDeseja calcular o valor da venda de outra mercadoria (SIM / NÃO)? ");
                String calcularNovamente = read.nextLine().trim();

                if (calcularNovamente.equalsIgnoreCase("sim") || calcularNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nReiniciando...\n");
                    break;
                }
                else if (calcularNovamente.equalsIgnoreCase("nao") || calcularNovamente.equalsIgnoreCase("não") || calcularNovamente.equalsIgnoreCase("n")) {
                    System.out.println("\nPrograma finalizado!");
                    read.close();
                    System.exit(0);
                }
                else {
                    System.out.println("\nDigite apenas Sim ou Não!");
                }
            }
        }
    }
}
