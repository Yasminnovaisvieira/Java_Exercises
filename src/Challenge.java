import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Colisão de Trens =====");

            String inicialTremAStr = "";
            double inicialTremA = 0;
            while (true) {
                try {
                    System.out.print("Digite a posição inicial do trem A: ");
                    inicialTremAStr = read.nextLine().trim();

                    if (inicialTremAStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        inicialTremA = Double.parseDouble(inicialTremAStr.replace(",", "."));

                        if ((inicialTremA >= 0) && (inicialTremA <= 10000)) {
                            break;
                        }
                        else {
                            System.out.println("\nDigite apenas números que estão entre 0 e 10.000!");
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números!");
                }
            }

            String inicialTremBStr = "";
            double inicialTremB = 0;
            while (true) {
                try {
                    System.out.print("Digite a posição inicial do trem B: ");
                    inicialTremBStr = read.nextLine().trim();

                    if (inicialTremBStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        inicialTremB = Double.parseDouble(inicialTremBStr.replace(",", "."));

                        if ((inicialTremB >= 0) && (inicialTremB <= 10000)) {
                            break;
                        }
                        else {
                            System.out.println("\nDigite apenas números que estão entre 0 e 10.000!");
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números!");
                }
            }

            String velocidadeTremAStr = "";
            double velocidadeTremA = 0;
            while (true) {
                try {
                    System.out.print("Digite a velocidade do trem A (até 300 km/h): ");
                    velocidadeTremAStr = read.nextLine().trim();

                    if (velocidadeTremAStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        velocidadeTremA = Double.parseDouble(velocidadeTremAStr.replace(",", "."));

                        if ((velocidadeTremA > 0) && (velocidadeTremA <= 300)) {
                            break;
                        }
                        else {
                            System.out.println("\nA velocidade do Trem A deve ser positiva e de no máximo 300 km/h!");
                        }
                    }
                } catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números!");
                }
            }

            String velocidadeTremBStr = "";
            double velocidadeTremB = 0;
            while (true) {
                try {
                    System.out.print("Digite a velocidade do trem B (até 300 km/h): ");
                    velocidadeTremBStr = read.nextLine().trim();

                    if (velocidadeTremBStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        velocidadeTremB = Double.parseDouble(velocidadeTremBStr.replace(",", "."));

                        if ((velocidadeTremB < 0) && (velocidadeTremB >= -300)) {
                            break;
                        }
                        else {
                            System.out.println("\nA velocidade do Trem B deve ser negativa e de no máximo -300 km/h!");
                        }
                    }
                } catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números!");
                }
            }

            if (inicialTremA > inicialTremB) {
                System.out.println("\nIMPORTANTE: Os trens não irão colidir, pois estão em rotas de afastamento.");
            }
            else {
                double tempoEmHoras = (inicialTremA - inicialTremB) / (velocidadeTremB - velocidadeTremA);

                double posicaoColisao = inicialTremA + (velocidadeTremA * tempoEmHoras); // Pega a posição inicial do trem A e soma a distância que ele percorreu no tempo calculado.

                double tempoEmSegundos = tempoEmHoras * 3600;

                int horaPartida = 17; // Horário que os trens partem de suas respectivas cidades
                int segundosNaHoraDaPartida = horaPartida * 3600;

                int tempoColisaoEmSegundosInt = (int) Math.round(tempoEmSegundos); // Math.round serve para arredondar para o número inteiro mais próximo

                int totalSegundosNoDia = segundosNaHoraDaPartida + tempoColisaoEmSegundosInt; // Para saber o momento exato do dia que ocorreu a colisão

                int horaFinal = totalSegundosNoDia / 3600;
                int resto = totalSegundosNoDia % 3600;
                int minutoFinal = resto / 60;
                int segundoFinal = resto % 60;

                String horarioFormatado = String.format("%02d:%02d:%02d", horaFinal, minutoFinal, segundoFinal);

                System.out.printf( "\nA colisão de trens acontecerá no KM %.2f e ocorrerá após %.2f segundos no horário de %s.\n", posicaoColisao, tempoEmSegundos, horarioFormatado);
            }

            while (true) {
                System.out.print("\nDeseja verificar em relação a novos trens (SIM /NÃO)? ");
                String resposta = read.nextLine().trim();

                if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
                    break;
                }
                else if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não")) {
                    System.out.println("\nPrograma finalizado.");
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