package List_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PessoaFa {
    String nome = "";
    String avaliacaoFilme = "";
}

public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Opinião Sobre Filme");

            String nomeFilme = "";
            while (true) {
                System.out.print("\nDigite o nome do filme que os fãs desejam avaliar: ");
                nomeFilme = read.nextLine().trim();

                if (nomeFilme.isEmpty()) {
                    System.out.println("\nO campo não pode ficar vazio!");
                }
                else {
                    break;
                }
            }

            List<PessoaFa> listaFas = new ArrayList<>();

            String nomeFa = "";
            int opiniaoLida = 0;
            String continuar = "";
            boolean continuarVotacao = true;
            while (true) {
                while (true) {
                    System.out.print("Digite o nome do fã: ");
                    nomeFa = read.nextLine().trim();

                    if (nomeFa.isEmpty()) {
                        System.out.println("\nO nome não pode ficar vazio!\n");
                    } else {
                        break;
                    }
                }

                while (true) {
                    try {
                        System.out.printf("\nQual a opinião do(a) %s sobre o filme?\n", nomeFa);
                        System.out.println("1 - Ótimo");
                        System.out.println("2 - Bom");
                        System.out.println("3 - Ruim");

                        System.out.print("\nDigite o número da opção: ");
                        String opiniaoStr = read.nextLine().trim();

                        if (opiniaoStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!");
                        }
                        else {
                            opiniaoLida = Integer.parseInt(opiniaoStr);

                            if (opiniaoLida >= 1 && opiniaoLida <= 3) {
                                break;
                            }
                            else {
                                System.out.println("\nOpção inválida! Digite apenas 1, 2 ou 3.");
                            }
                        }
                    } catch (NumberFormatException error) {
                        System.out.println("\nDigite apenas números!");
                    }
                }

                PessoaFa novoFa = new PessoaFa();

                novoFa.nome = nomeFa;

                if (opiniaoLida == 1) {
                    novoFa.avaliacaoFilme = "Ótimo";
                }
                else if (opiniaoLida == 2) {
                    novoFa.avaliacaoFilme = "Bom";
                }
                else {
                    novoFa.avaliacaoFilme = "Ruim";
                }

                listaFas.add(novoFa);

                while (true) {
                    System.out.print("\nDeseja registrar a opinião de outro fã (SIM / NÃO)? ");
                    String resposta = read.nextLine().trim();

                    if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
                        break;
                    }
                    else if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não")) {
                        continuarVotacao = false;
                        break;
                    }
                    else {
                        System.out.println("\nDigite apenas Sim ou Não!");
                    }
                }

                if (!continuarVotacao) {
                    break;
                }
            }

            int contadorOtimo = 0;
            int contadorBom = 0;
            int contadorRuim = 0;
            int somaNotas = 0;

            for (PessoaFa fa : listaFas) {
                if (fa.avaliacaoFilme.equals("Ótimo")) {
                    contadorOtimo ++;
                    somaNotas += 1;
                }
                else if (fa.avaliacaoFilme.equals("Bom")) {
                    contadorBom ++;
                    somaNotas += 2;
                }
                else {
                    contadorRuim ++;
                    somaNotas += 3;
                }
            }

            if (listaFas.size() > 0) {
                int totalRespondentes = listaFas.size();
                double percOtimo = ((double) contadorOtimo / totalRespondentes) * 100; // Double é um "cast", serve para especificar como essa expressão deve ser tratada
                double percBom = ((double) contadorBom / totalRespondentes) * 100;
                double percRuim =((double) contadorRuim / totalRespondentes) * 100;

                double mediaNotas = (double) somaNotas / totalRespondentes;

                System.out.println("\n=== RESULTADO ===");
                System.out.printf("\nTotal de Fãs que responderam: %d\n", totalRespondentes);
                System.out.printf("\nÓtimo: %d votos (%.1f%%)\n", contadorOtimo, percOtimo);
                System.out.printf("Bom:   %d votos (%.1f%%)\n", contadorBom, percBom);
                System.out.printf("Ruim:  %d votos (%.1f%%)\n", contadorRuim, percRuim);
                System.out.printf("\nMédia de notas do filme: %.2f\n", mediaNotas);

                System.out.println("\n== Fãs que avaliaram ==");

                for (PessoaFa fa : listaFas) {
                    System.out.printf("- %s (Opinião: %s)\n", fa.nome, fa.avaliacaoFilme);
                }

            }
            else {
                System.out.println("\nNenhuma opinião foi registrada para este filme.\n");
            }

            while (true) {
                System.out.print("\nDeseja responder novamente sobre outro filme (SIM / NÃO)? ");
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
