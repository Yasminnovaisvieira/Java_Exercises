package List_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        while (true) {
            System.out.println("===== Média Ponderada =====");

            String nota1String = "";
            double nota1 = 0;
            while (true) {
                try {
                    System.out.print("\nDigite a 1ª nota: ");
                    nota1String = read.nextLine().trim();

                    if (!nota1String.isEmpty()) {
                        nota1 = Double.parseDouble(nota1String);

                        if ((nota1 < 0) || (nota1 > 10)) {
                            System.out.println("\nDigite apenas notas entre 0 e 10!");
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                }
                catch (InputMismatchException | NumberFormatException error) {
                    System.out.println("\nDigite apenas números!");
                }
            }

            String nota2String = "";
            double nota2 = 0;
            while (true) {
                try {
                    System.out.print("Digite a 2ª nota: ");
                    nota2String = read.nextLine().trim();

                    if (!nota2String.isEmpty()) {
                        nota2 = Double.parseDouble(nota2String);

                        if ((nota2 < 0) || (nota2 > 10)) {
                            System.out.println("\nDigite apenas notas entre 0 e 10!");
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                }
                catch (InputMismatchException | NumberFormatException error) {
                    System.out.println("\nDigite apenas números!");
                }
            }

            double peso1 = 0.40;
            double peso2 = 0.60;

            double mediaPonderada = (nota1 * peso1) + (nota2 * peso2);

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("\nMédia Ponderada: %.2f\n", mediaPonderada);

            while (true) {
                System.out.print("\nDeseja calcular a média ponderada novamente (SIM / NÃO)? ");
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
