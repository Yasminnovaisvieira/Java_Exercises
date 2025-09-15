package List_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Verificação de Números =====");

            int[] numerosObtidos = new int[10]; //  Armazena 10 números, ou seja, há 10 espaços disponíveis.
            String numeroLidoStr = "";
            int numeroLido = 0;
            for (int i = 0; i < 10; i++) {
                while (true) {
                    try {
                        System.out.printf("\nDigite o %dº número: ", i+1);
                        numeroLidoStr = read.nextLine().trim();

                        if (numeroLidoStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!");
                        }
                        else {
                            numeroLido = Integer.parseInt(numeroLidoStr);
                            numerosObtidos[i] = numeroLido; // Adicionar o número ao Array.
                            break;
                        }
                    }
                    catch (NumberFormatException error) {
                        System.out.println("\nDigite apenas números inteiros!");
                    }
                }
            }

            String escolhaStr = "";
            while (true) {
                System.out.println("\nEm relação as opções oferecidas a baixo:");
                System.out.println("\nA - Mostrar quantidade de números pares");
                System.out.println("B - Mostrar quantidade de números ímpares");
                System.out.println("C - Mostrar quantidade de números negativos");
                System.out.println("D - Mostrar quantidade de números positivos");

                System.out.print("\nDigite a letra da opção que deseja: ");
                escolhaStr = read.nextLine().trim().toLowerCase();

                if (escolhaStr.isEmpty()) {
                    System.out.println("\nO campo não pode ficar vazio!");
                }
                else {
                    if ((!escolhaStr.equals("a")) && (!escolhaStr.equals("b")) && (!escolhaStr.equals("c")) && (!escolhaStr.equals("d"))) {
                        System.out.println("\nEscolha A, B, C ou D!");
                    }
                    else {
                        break;
                    }
                }
            }

            switch (escolhaStr) {
                case "a":
                    int contadorPares = 0;
                    List<Integer> numerosParesList = new ArrayList<>(); // ArrayList é usado para quando não se sabe quantos itens/espaços serão utilizados.

                    for (int numero : numerosObtidos) {
                        if (numero % 2 == 0) {
                            contadorPares ++;
                            numerosParesList.add(numero);
                        }
                    }

                    System.out.println("\n=== RESULTADO ===");

                    if (contadorPares > 0) {
                        System.out.printf("Foram encontrados %d números pares: %s\n", contadorPares, numerosParesList);
                    }
                    else {
                        System.out.println("Nenhum número par foi encontrado.");
                    }
                    break;

                case "b":
                    int contadorImpares = 0;
                    List<Integer> numerosImparesList = new ArrayList<>();

                    for (int numero : numerosObtidos) {
                        if (numero % 2 != 0) {
                            contadorImpares ++;
                            numerosImparesList.add(numero);
                        }
                    }

                    System.out.println("\n=== RESULTADO ===");

                    if (contadorImpares > 0) {
                        System.out.printf("Foram encontrados %d números ímpares: %s\n", contadorImpares, numerosImparesList);
                    }
                    else {
                        System.out.println("Nenhum número ímpar foi encontrado.");
                    }
                    break;

                case "c":
                    int contadorNegativos = 0;
                    List<Integer> numerosNegativosList = new ArrayList<>();

                    for (int numero : numerosObtidos) {
                        if (numero < 0) {
                            contadorNegativos ++;
                            numerosNegativosList.add(numero);
                        }
                    }

                    System.out.println("\n=== RESULTADO ===");

                    if (contadorNegativos > 0) {
                        System.out.printf("Foram encontrados %d números negativos: %s\n", contadorNegativos, numerosNegativosList);
                    }
                    else {
                        System.out.println("Nenhum número negativo foi encontrado.");
                    }
                    break;

                case "d":
                    int contadorPositivos = 0;
                    List<Integer> numerosPositivosList = new ArrayList<>();

                    for (int numero : numerosObtidos) {
                        if (numero > 0) {
                            contadorPositivos ++;
                            numerosPositivosList.add(numero);
                        }
                    }

                    System.out.println("\n=== RESULTADO ===");

                    if (contadorPositivos > 0) {
                        System.out.printf("Foram encontrados %d números positivos: %s\n", contadorPositivos, numerosPositivosList);
                    }
                    else {
                        System.out.println("Nenhum número positivo foi encontrado.");
                    }
                    break;

                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }

            while (true) {
                System.out.print("\nDeseja verificar novos números (SIM / NÃO)? ");
                String verificarNovamente = read.nextLine().trim();

                if (verificarNovamente.equalsIgnoreCase("sim") || verificarNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nReiniciando...\n");
                    break;
                }
                else if (verificarNovamente.equalsIgnoreCase("nao") || verificarNovamente.equalsIgnoreCase("não") || verificarNovamente.equalsIgnoreCase("n")) {
                    System.out.println("\nObrigado pela verificação! Programa finalizado.");
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
