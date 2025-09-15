package List_2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Jogo =====");

            String qtnGolsAString = "";
            int qtnGolsA = 0;
            while (true) {
                try {
                    System.out.print("\nDigite a quantidade de gols feitos pelo time A: ");
                    qtnGolsAString = read.nextLine().trim();

                    if (qtnGolsAString.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        qtnGolsA = Integer.parseInt(qtnGolsAString);

                        if (qtnGolsA >= 0) {
                            break;
                        }
                        else {
                            System.out.println("\nO número de gols não pode ser negativo!");
                        }
                    }
                }
                catch (NumberFormatException erros) {
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            String qtnGolsBString = "";
            int qtnGolsB = 0;
            while (true) {
                try {
                    System.out.print("Digite a quantidade de gols feitos pelo time B: ");
                    qtnGolsBString = read.nextLine().trim();

                    if (qtnGolsBString.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        qtnGolsB = Integer.parseInt(qtnGolsBString);

                        if (qtnGolsB >= 0) {
                            break;
                        }
                        else {
                            System.out.println("\nO número de gols não pode ser negativo!");
                        }
                    }
                }
                catch (NumberFormatException erros) {
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            System.out.println("\n=== RESULTADO ===");

            if (qtnGolsA > qtnGolsB) {
                System.out.printf("\nO Time A venceu a partida por %d a %d! 🥳\n", qtnGolsA, qtnGolsB);
            }
            else if (qtnGolsB > qtnGolsA) {
                System.out.printf("\nO Time B venceu a partida por %d a %d! 🥳\n", qtnGolsB, qtnGolsA);
            }
            else {
                System.out.printf("A partida terminou em empate: %d a %d!\n", qtnGolsA, qtnGolsB);
            }

            while (true) {
                System.out.print("\nDeseja iniciar uma nova partida (SIM / NÃO)? ");
                String iniciarNovamente = read.nextLine().trim();

                if (iniciarNovamente.equalsIgnoreCase("sim") || iniciarNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nReiniciando...\n");
                    break;
                }
                else if (iniciarNovamente.equalsIgnoreCase("nao") || iniciarNovamente.equalsIgnoreCase("não") || iniciarNovamente.equalsIgnoreCase("n")) {
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
