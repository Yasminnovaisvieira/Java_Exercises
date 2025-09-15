package List_2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Cálculo Sobre Produto =====");

           String valorUniString = "";
           double valorUnitario = 0;
           while (true) {
               try {
                   System.out.print("\nDigite o valor unitário do produto desejado: ");
                   valorUniString = read.nextLine().trim();

                   if (valorUniString.isEmpty()) {
                       System.out.println("\nO campo não pode ser vazio!");
                   }
                   else {
                       valorUnitario = Double.parseDouble(valorUniString.replace(",", "."));

                       if (valorUnitario >= 0) {
                           break;
                       }
                       else {
                           System.out.println("\nO valor não pode ser negativo!");
                       }
                   }
               }
               catch (NumberFormatException error) {
                   System.out.println("\nDigite apenas números!");
               }
           }

           String quantidadeString = "";
           int quantidade = 0;
           while (true) {
               try {
                   System.out.print("Digite a quantidade que deseja comprar desse produto: ");
                   quantidadeString = read.nextLine().trim();

                   if (quantidadeString.isEmpty()) {
                       System.out.println("\nO campo não pode ser vazio!");
                   }
                   else {
                       quantidade = Integer.parseInt(quantidadeString);

                       if (quantidade >= 0) {
                           break;
                       }
                       else {
                           System.out.println("\nA quantidade não pode ser negativa!");
                       }
                   }
               }
               catch (NumberFormatException error) {
                   System.out.println("\nDigite apenas números inteiros!");
               }
           }

           double valorProduto = 0;
            double percentualDesconto = 0.10;

            if (quantidade <= 12) {
                valorProduto = valorUnitario * quantidade;
            }
            else {
                double descontoPorUnidade = valorUnitario * percentualDesconto;
                valorProduto = (valorUnitario - descontoPorUnidade) * quantidade;
            }

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("\nValor Unitário: R$ %.2f\n", valorUnitario);
            System.out.printf("Quantidade: %d unidades\n", quantidade);
            System.out.printf("Desconto Aplicado: %.0f%%\n", percentualDesconto * 100);
            System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f\n", valorProduto);

            while (true) {
                System.out.print("\nDeseja realizar um novo cálculo (SIM / NÃO)? ");
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
