package List_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Salário de Vendedor =====");

            String nome = "";
            while (true) {
                System.out.print("\nDigite o seu nome: ");
                nome = read.nextLine().trim();

                if (!nome.isEmpty()) {
                    break;
                }
                else {
                    System.out.println("\nO campo não pode ficar vazio!");
                }
            }

            String mesString = "";
            int mes = 0;
            while (true) {
                try {
                    System.out.print("\n1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril\n5 - Maio\n6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro\n");
                    System.out.print("\nDigite o número referente ao mês atual: ");
                    mesString = read.nextLine().trim();

                    if (mesString.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        mes = Integer.parseInt(mesString);

                        if (mes >= 1 && mes <= 12) {
                            break;
                        } else {
                            System.out.println("\nNúmero inválido! Digite um dos números oferecidos (1 a 12)!");
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!\n");
                }
            }

            String carrosVendidosString = "";
            int carrosVendidos = 0;
            while (true) {
                try {
                    System.out.print("Digite o número de carros vendidos: ");
                    carrosVendidosString = read.nextLine().trim();

                    if (carrosVendidosString.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!\n");
                    }
                    else {
                        carrosVendidos = Integer.parseInt(carrosVendidosString);

                        if (carrosVendidos >= 0) {
                            break;
                        }
                        else {
                            System.out.println("\nO número de carros vendidos não pode ser negativo!\n");
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!\n");
                }
            }

            String totalVendasString = "";
            double totalVendas = 0;
            while (true) {
                try {
                    System.out.print("Digite o valor total de vendas: ");
                    totalVendasString = read.nextLine().trim();

                    if (totalVendasString.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!\n");
                    }
                    else {
                        totalVendas = Double.parseDouble(totalVendasString);

                        if (totalVendas >= 0) {
                            break;
                        }
                        else {
                            System.out.println("\nO valor total de vendas não pode ser negativo!\n");
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números!\n");
                }
            }

            double salarioFixo = 1500.00;
            double comissaoCarrosVendidos = carrosVendidos * 350.00;
            double comissaoSobreVendas = totalVendas * 0.001;

            double salarioFinal = salarioFixo + comissaoCarrosVendidos + comissaoSobreVendas;

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("\nVendedor(a): %s", nome);
            System.out.printf("\nMês: %d", mes);
            System.out.printf("\nSalário Fixo: R$ %.2f", salarioFixo);
            System.out.printf("\nComissão por Carros: R$ %.2f", comissaoCarrosVendidos);
            System.out.printf("\nComissão sobre Vendas: R$ %.2f", comissaoSobreVendas);
            System.out.printf("\nSALÁRIO FINAL: R$ %.2f\n", salarioFinal);

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
