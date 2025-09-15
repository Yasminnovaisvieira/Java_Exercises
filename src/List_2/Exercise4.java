package List_2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final double valorBase = 3000.00;

        while (true) {
            System.out.println("===== Férias =====");

            int destinoEscolhido = 0;
            while (true) {
                try {
                    System.out.println("\nEscolha o seu destino: \n1 - Maceió\n2 - Porto de Galinhas");
                    System.out.print("\nDigite o número correspondente ao destino desejado: ");
                    String destinoString = read.nextLine().trim();

                    if (destinoString.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        destinoEscolhido = Integer.parseInt(destinoString);
                        if (destinoEscolhido == 1 || destinoEscolhido == 2) {
                            break;
                        }
                        else {
                            System.out.println("\nDigite uma das opções oferecidas!\n");
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!\n");
                }
            }

            boolean refeicaoInclusa = false;
            while (true) {
                System.out.print("Deseja incluir almoço/janta no pacote (SIM / NÃO)? ");
                String respostaRefeicao = read.nextLine().trim();

                if (respostaRefeicao.equalsIgnoreCase("sim") || respostaRefeicao.equalsIgnoreCase("s")) {
                    refeicaoInclusa = true;
                    break;
                }
                else if (respostaRefeicao.equalsIgnoreCase("nao") || respostaRefeicao.equalsIgnoreCase("não") || respostaRefeicao.equalsIgnoreCase("n")) {
                    refeicaoInclusa = false;
                    break;
                }
                else {
                    System.out.println("\nDigite apenas Sim ou Não!\n");
                }
            }

            double valorFinal = 0.0;
            double percentualAcrescimo = 0.0;
            String nomeDestino = "";
            String planoRefeicao = "";

            if (destinoEscolhido == 1) {
                nomeDestino = "Maceió";
                if (refeicaoInclusa) { // Se estiver inclusa
                    percentualAcrescimo = 1.00; // 100%
                    planoRefeicao = "Com almoço/janta";
                }
                else {
                    percentualAcrescimo = 0.85;
                    planoRefeicao = "Sem almoço/janta";
                }
            }
            else {
                nomeDestino = "Porto de Galinhas";
                if (refeicaoInclusa) {
                    percentualAcrescimo = 0.60;
                    planoRefeicao = "Com almoço/janta";
                }
                else {
                    percentualAcrescimo = 0.45;
                    planoRefeicao = "Sem almoço/janta";
                }
            }

            valorFinal = valorBase + (valorBase * percentualAcrescimo);

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("Destino Escolhido: %s\n", nomeDestino);
            System.out.printf("Plano de Refeição: %s\n", planoRefeicao);
            System.out.printf("Valor Base: R$ %.2f\n", valorBase);
            System.out.printf("Acréscimo do Pacote: %.0f%%\n", percentualAcrescimo * 100);
            System.out.printf("VALOR FINAL DA VIAGEM: R$ %.2f\n", valorFinal);

            while (true) {
                System.out.print("\nDeseja realizar um novo cálculo (SIM / NÃO)? ");
                String calcularNovamente = read.nextLine().trim();

                if (calcularNovamente.equalsIgnoreCase("sim") || calcularNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nReiniciando...\n");
                    break;
                } else if (calcularNovamente.equalsIgnoreCase("nao") || calcularNovamente.equalsIgnoreCase("não") || calcularNovamente.equalsIgnoreCase("n")) {
                    System.out.println("\nPrograma finalizado!");
                    read.close();
                    System.exit(0);
                } else {
                    System.out.println("\nDigite apenas Sim ou Não!");
                }
            }
        }
    }
}