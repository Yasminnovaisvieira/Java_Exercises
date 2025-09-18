package List_3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Incremento Até Número Desejado =====");

            String numeroFinalStr = "";
            int numeroFinal = 0;
            while (true) {
                try {
                    System.out.print("\nDigite o número final da incrementação: ");
                    numeroFinalStr = read.nextLine().trim();

                    if (numeroFinalStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        numeroFinal = Integer.parseInt(numeroFinalStr);

                        if (numeroFinal <= 0) {
                            System.out.println("\nNão é possível fazer a operação usando o 0 ou números negativos!");
                        }
                        else {
                            break;
                        }
                    }
                } catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            String valorIncrementoStr = "";
            int valorIncremento = 0;
            while (true) {
                try {
                    System.out.print("Digite o valor do incremento: ");
                    valorIncrementoStr = read.nextLine().trim();

                    if (valorIncrementoStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!\n");
                    }
                    else {
                        valorIncremento = Integer.parseInt(valorIncrementoStr);

                        if (valorIncremento <= 0) {
                            System.out.println("\nO incremento não pode ser menor ou igual a zero!");
                        }
                        else {
                            break;
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!\n");
                }
            }

            System.out.println("\n=== RESULTADO ===");
            for (int i = 0; i <= numeroFinal; i += valorIncremento) {
                if (i == 0) {
                    System.out.print(i);
                }
                else {
                    System.out.print(", " + i);
                }
            }

            System.out.println();

            while (true) {
                System.out.print("\nDeseja responder novamente e realizar a contagem (SIM / NÃO)? ");
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
