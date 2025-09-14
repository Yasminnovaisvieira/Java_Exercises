package List_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Operações entre 2 números =====");

            String numero1String = "";
            double numero1 = 0;
            while (true) {
                try {
                    System.out.print("Digite o 1º número: ");
                    numero1String = read.nextLine().trim();

                    if (!numero1String.isEmpty()) {
                        numero1 = Double.parseDouble(numero1String);
                        break;
                    }
                    else {
                        System.out.println("\nDigite números!\n");
                    }
                }
                catch (InputMismatchException | NumberFormatException error) {
                    System.out.println("\nDigite apenas números!\n");
                }
            }

            String numero2String = "";
            double numero2 = 0;
            while (true) {
                try {
                    System.out.print("Digite o 2º número: ");
                    numero2String = read.nextLine().trim();

                    if (!numero2String.isEmpty()) {
                        numero2 = Double.parseDouble(numero2String);
                        break;
                    }
                    else {
                        System.out.println("\nDigite números!\n");
                    }
                }
                catch (InputMismatchException | NumberFormatException error) {
                    System.out.println("\nDigite apenas números!\n");
                }
            }

            double soma = numero1 + numero2;
            double subtracao = numero1 - numero2;
            double multiplicacao = numero1 * numero2;
            double potenciacao = Math.pow(numero1, numero2);

            System.out.println("\n=== RESULTADOS ===");
            System.out.printf("Soma: %.2f\n", soma);
            System.out.printf("Subtração: %.2f\n", subtracao);
            System.out.printf("Multiplicação: %.2f\n", multiplicacao);
            System.out.printf("Potenciação: %.2f\n", potenciacao);

            if (numero2 == 0) {
                System.out.println("Divisão: Impossível dividir por 0");
                System.out.println("Resto da Divisão: Impossível calcular com divisor 0");
            }
            else {
                double divisao = numero1 / numero2;
                double restoDivisao = numero1 % numero2;
                System.out.printf("Divisão: %.2f\n", divisao);
                System.out.printf("Resto da Divisão: %.2f\n", restoDivisao);
            }

            while (true) {
                System.out.print("\nDeseja realizar as operações novamente (SIM / NÃO)? ");
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
