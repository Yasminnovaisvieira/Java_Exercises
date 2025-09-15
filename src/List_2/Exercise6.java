package List_2;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random sorteador = new Random();

        while (true) {
            int numeroSorteado = sorteador.nextInt(100) + 1; /* nextInt vai de 0 até o número máximo. Somar 1, pois o máximo está até 99 */

            int chances = 0;
            String numeroChuteStr = "";
            int numeroChute = 0;
            boolean acertou = false;

            while (chances < 3) {
                try {
                    System.out.println("===== Sorteador =====");

                    System.out.print("\nDigite um número de 1 a 100: ");
                    numeroChuteStr = read.nextLine().trim();

                    if (numeroChuteStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!\n");
                    }
                    else {
                        numeroChute = Integer.parseInt(numeroChuteStr);

                        if ((numeroChute < 1) || (numeroChute > 100)) {
                            System.out.println("\nDigite apenas números entre 1 e 100!\n");
                        }
                        else {
                            if (numeroChute == numeroSorteado) {
                                System.out.println("PARABÉNS! Você acertou o número sorteado! 🥳");
                                acertou = true;
                                break;
                            }
                            else {
                                System.out.println("\nVocê errou!");

                                if (numeroChute < numeroSorteado) {
                                    System.out.println("DICA: O número sorteado é MAIOR.\n");
                                }
                                else {
                                    System.out.println("DICA: O número sorteado é MENOR.\n");
                                }

                                chances++;
                            }
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            if (!acertou) {
                System.out.println("Suas tentativas acabaram!");
                System.out.printf("O número sorteado era: %d\n", numeroSorteado);
            }

            while (true) {
                System.out.print("\nDeseja jogar novamente (SIM / NÃO)? ");
                String jogarNovamente = read.nextLine().trim();

                if (jogarNovamente.equalsIgnoreCase("sim") || jogarNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nÓtimo! Sorteando um novo número...\n");
                    break;
                }
                else if (jogarNovamente.equalsIgnoreCase("nao") || jogarNovamente.equalsIgnoreCase("não") || jogarNovamente.equalsIgnoreCase("n")) {
                    System.out.println("\nObrigado por jogar! Programa finalizado.");
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
