package List_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Análise de Risco de Saldos do Banco =====");

            List<Double> saldos = new ArrayList<>();

            double saldoLido = 0;
            String saldoStr = "";
            while (true) {
                while (true) {
                    try {
                        System.out.printf("\nDigite o saldo da %dª pessoa: R$ ", saldos.size() + 1);
                        saldoStr = read.nextLine().trim();

                        if (saldoStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!");
                        }
                        else {
                            saldoLido = Double.parseDouble(saldoStr.replace(",", "."));
                            break;
                        }
                    }
                    catch (NumberFormatException error) {
                        System.out.println("\nDigite apenas números.");
                    }
                }

                saldos.add(saldoLido);

                String resposta = "";
                while (true) {
                    System.out.print("\nDeseja informar o saldo de outra pessoa (S/N)? ");
                    resposta = read.nextLine().trim();
                    if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não")) {
                        break;
                    }
                    else {
                        System.out.println("\nDigite apenas Sim ou Não!");
                    }
                }

                if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não")) {
                    break;
                }
            }

            int totalPessoas = saldos.size();

            System.out.println("\n=== RESULTADOS ===");

            int contadorPositivos = 0;
            int contadorNegativos = 0;

            if (totalPessoas > 0) {
                for (double saldo : saldos) {
                    if (saldo > 0) {
                        contadorPositivos++;
                    }
                    else if (saldo < 0) {
                        contadorNegativos++;
                    }
                }

                double percentualPositivos = ((double) contadorPositivos / totalPessoas) * 100;

                System.out.println("\n=== RESULTADO ===");
                System.out.printf("\nTotal de pessoas analisadas: %d\n", totalPessoas);
                System.out.printf("- Pessoas com saldo positivo: %d (%.1f%%)\n", contadorPositivos, percentualPositivos);
                System.out.printf("- Pessoas com saldo negativo: %d\n", contadorNegativos);

                if (percentualPositivos >= 50) {
                    System.out.println("\nAVALIAÇÃO DE RISCO: Nenhum risco!");
                }
                else {
                    System.out.println("\nAVALIAÇÃO DE RISCO: Risco ao banco!");
                }

            }
            else {
                System.out.println("Nenhum saldo foi informado para análise.");
            }

            while (true) {
                System.out.print("\nDeseja iniciar uma nova análise com um novo grupo de pessoas (SIM / NÃO)? ");
                String responderNovamente = read.nextLine().trim();

                if (responderNovamente.equalsIgnoreCase("sim") || responderNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nReiniciando...\n");
                    break;
                }
                else if (responderNovamente.equalsIgnoreCase("nao") || responderNovamente.equalsIgnoreCase("não") || responderNovamente.equalsIgnoreCase("n")) {
                    System.out.println("\nObrigado por responder! Programa finalizado.");
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
