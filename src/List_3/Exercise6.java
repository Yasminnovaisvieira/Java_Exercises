package List_3;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Análise de Pessoas: Mais Alta e Mais Pesada =====");

            String nomeMaisPesado = "";
            double maiorPeso = 0.0;
            String nomeMaisAlto = "";
            double maiorAltura = 0.0;

            String nomeAtual = "";
            for (int i = 0; i < 6; i++) {
                while (true) {
                    System.out.print("Digite o nome: ");
                    nomeAtual = read.nextLine().trim();

                    if (nomeAtual.isEmpty()) {
                        System.out.println("\nO nome não pode ficar vazio!\n");
                    }
                    else {
                        break;
                    }
                }

                double alturaAtual = 0.0;
                String alturaStr = "";
                while (true) {
                    try {
                        System.out.print("Digite a altura: ");
                        alturaStr = read.nextLine().trim();

                        if (alturaStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!\n");
                        }
                        else {
                            alturaAtual = Double.parseDouble(alturaStr.replace(",", "."));

                            if (alturaAtual > 0) {
                                break;
                            }
                            else {
                                System.out.println("\nA altura deve ser um valor positivo!\n");
                            }
                        }
                    } catch (NumberFormatException error) {
                        System.out.println("\nDigite apenas números!\n");
                    }
                }

                double pesoAtual = 0.0;
                String pesoStr = "";
                while (true) {
                    try {
                        System.out.print("Digite o peso: ");
                        pesoStr = read.nextLine().trim();

                        if (pesoStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!\n");
                        }
                        else {
                            pesoAtual = Double.parseDouble(pesoStr.replace(",", "."));

                            if (pesoAtual > 0) {
                                break;
                            }
                            else {
                                System.out.println("\nO peso deve ser um valor positivo!\n");
                            }
                        }
                    } catch (NumberFormatException error) {
                        System.out.println("\nDigite apenas números!\n");
                    }
                }

                if (pesoAtual > maiorPeso) {
                    maiorPeso = pesoAtual;
                    nomeMaisPesado = nomeAtual;
                }

                if (alturaAtual > maiorAltura) {
                    maiorAltura = alturaAtual;
                    nomeMaisAlto = nomeAtual;
                }
            }

            System.out.println("\n=== RESULTADO ===");

            if (!nomeMaisPesado.isEmpty()) {
                System.out.printf("Pessoa mais pesada: %s, com %.1f kg.\n", nomeMaisPesado, maiorPeso);
                System.out.printf("Pessoa mais alta:   %s, com %.2f m.\n", nomeMaisAlto, maiorAltura);
            }
            else {
                System.out.println("Nenhum dado foi inserido para análise.");
            }

            while (true) {
                System.out.print("\nDeseja analisar um novo grupo de 6 pessoas (SIM /NÃO)? ");
                String resposta = read.nextLine().trim();

                if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
                    break;
                }
                else if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não")) {
                    System.out.println("\nPrograma finalizado.");
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