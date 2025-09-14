package List_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Horário =====");

            String horasString = "";
            int horas = 0;
            while (true) {
                try {
                    System.out.print("\nDigite a quantidade de horas: ");
                    horasString = read.nextLine().trim();

                    if (!horasString.isEmpty()) {
                        horas = Integer.parseInt(horasString);
                         if ((horas < 0) || (horas > 23)) {
                             System.out.println("\nDigite apenas horas entre 0 e 23!");
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
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            String minutosString = "";
            int minutos = 0;
            while (true) {
                try {
                    System.out.print("Digite a quantidade de minutos: ");
                    minutosString = read.nextLine().trim();

                    if (!minutosString.isEmpty()) {
                        minutos = Integer.parseInt(minutosString);
                        if ((minutos < 0) || (minutos > 59)) {
                            System.out.println("\nDigite apenas minutos entre 0 e 59!");
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
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            String segundosString = "";
            int segundos = 0;
            while (true) {
                try {
                    System.out.print("Digite a quantidade de segundos: ");
                    segundosString = read.nextLine().trim();

                    if (!segundosString.isEmpty()) {
                        segundos = Integer.parseInt(segundosString);
                        if ((segundos < 0) || (segundos > 59)) {
                            System.out.println("\nDigite apenas segundos entre 0 e 59!");
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
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            int horasSegundos = horas * 3600; // 60 x 60
            int minutosSegundos = minutos * 60;
            int segundosTotais = horasSegundos + minutosSegundos + segundos;

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("\nSegundos Totais: %d\n", segundosTotais);

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
