package List_2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String perguntaEscolhidaStr = "";
        int perguntaEscolhida = 0;

        String alternativaEscolhida = "";
        while (true) {
            while (true) {
                System.out.println("===== RespondeYas =====");

                System.out.println("\nLeve em consideração as seguintes perguntas:");
                System.out.println("\n1 - Qual é uma das obras mais famosas de Vincent van Gogh?");
                System.out.println("2 - Qual é o nome da galáxia onde está o Sistema Solar?");

                try {
                    System.out.print("\nDigite o número referente a pergunta que deseja responder: ");
                    perguntaEscolhidaStr = read.nextLine().trim();

                    if (perguntaEscolhidaStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!\n");
                    }
                    else  {
                        perguntaEscolhida = Integer.parseInt(perguntaEscolhidaStr);
                        if (perguntaEscolhida == 1 || perguntaEscolhida == 2) {
                            break;
                        }
                        else {
                            System.out.println("\nDigite um dos números oferecidos (1 ou 2)!\n");
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!\n");
                }
            }

            if (perguntaEscolhida == 1) {
                System.out.println("\nQual é uma das obras mais famosas de Vincent van Gogh?");
                System.out.println("\nA - O Grito");
                System.out.println("B - A Noite Estrelada");
                System.out.println("C - Monalisa");

                System.out.print("\nQual é a resposta correta (Apenas a letra)? ");
                alternativaEscolhida = read.nextLine().trim();

                if (alternativaEscolhida.isEmpty()) {
                    System.out.println("\nO campo não pode ficar vazio!");
                }
                else{
                    if (alternativaEscolhida.equalsIgnoreCase("B")) {
                        System.out.println("\nPARABÉNS! Você acertou a questão. Pode retirar seu bônus na Shostners and Shostners! 🥳");
                    }
                    else if ((alternativaEscolhida.equalsIgnoreCase("C")) || (alternativaEscolhida.equalsIgnoreCase("A"))) {
                        System.out.println("\nTente novamente! Resposta Incorreta.");
                    }
                    else {
                        System.out.println("\nDigite apenas A, B ou C!");
                    }
                }
            }
            else {
                System.out.print("\nQual é o nome da galáxia onde está o Sistema Solar?");
                System.out.println("\nA - Via Láctea");
                System.out.println("B - Andrômeda");
                System.out.println("C - Olho Negro");

                System.out.print("\nQual é a resposta correta (Apenas a letra)? ");
                alternativaEscolhida = read.nextLine().trim();

                if (alternativaEscolhida.isEmpty()) {
                    System.out.println("\nO campo não pode ficar vazio!");
                }
                else{
                    if (alternativaEscolhida.equalsIgnoreCase("A")) {
                        System.out.println("\nPARABÉNS! Você acertou a questão. Pode retirar seu bônus na Shostners and Shostners! 🥳");
                    }
                    else if ((alternativaEscolhida.equalsIgnoreCase("C")) || (alternativaEscolhida.equalsIgnoreCase("B"))) {
                        System.out.println("\nTente novamente! Resposta Incorreta.");
                    }
                    else {
                        System.out.println("\nDigite apenas A, B ou C!");
                    }
                }
            }

            while (true) {
                System.out.print("\nDeseja responder novamente (SIM / NÃO)? ");
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
