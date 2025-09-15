package List_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Antecessor e Sucessor de um Número =====");

            String numeroString = "";
            int numero = 0;
            while (true) {
                try {
                    System.out.print("\nDigite um número inteiro: ");
                    numeroString = read.nextLine().trim();

                    if (!numeroString.isEmpty()) {
                        numero = Integer.parseInt(numeroString);
                        break;
                    }
                    else {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                }
                catch (NumberFormatException | InputMismatchException error) {
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            int antecessor = numero - 1;
            int sucessor = numero + 1;

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("\nAntecessor: %d", antecessor);
            System.out.printf("\nNúmero Informado: %d", numero);
            System.out.printf("\nSucessor: %d\n", sucessor);

            while (true) {
                System.out.print("\nDeseja realizar a operação novamente (SIM / NÃO)? ");
                String realizarNovamente = read.nextLine().trim();

                if (realizarNovamente.equalsIgnoreCase("sim") || realizarNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nReiniciando...\n");
                    break;
                }
                else if (realizarNovamente.equalsIgnoreCase("nao") || realizarNovamente.equalsIgnoreCase("não") || realizarNovamente.equalsIgnoreCase("n")) {
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
