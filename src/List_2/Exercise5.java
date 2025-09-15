package List_2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Efetuação de Compra =====");

            String quantAtualEstoqueStr = "";
            int quantAtualEstoque = 0;
            while (true) {
                try {
                    System.out.print("\nDigite a quantidade ATUAL do estoque: ");
                    quantAtualEstoqueStr = read.nextLine().trim();

                    if (quantAtualEstoqueStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        quantAtualEstoque = Integer.parseInt(quantAtualEstoqueStr);

                        if (quantAtualEstoque < 0) {
                            System.out.println("\nO estoque atual não pode ser negativo!");
                        }
                        else {
                            break;
                        }
                    }
                }
                catch (NumberFormatException error) {
                    System.out.println("\nDigite apenas números inteiros!");
                }
            }

            String quantMaxEstoqueStr = "";
            String quantMinEstoqueStr = "";
            int quantMinEstoque = 0;
            int quantMaxEstoque = 0;
            while (true) { // Para verificar Máx e Min
                while (true) {
                    try {
                        System.out.print("\nDigite a quantidade MÁXIMA do estoque: ");
                        quantMaxEstoqueStr = read.nextLine().trim();

                        if (quantMaxEstoqueStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!");
                        }
                        else {
                            quantMaxEstoque = Integer.parseInt(quantMaxEstoqueStr);

                            if (quantMaxEstoque < 0) {
                                System.out.println("\nO estoque máximo não pode ser negativo!");
                            }
                            else {
                                break;
                            }
                        }
                    }
                    catch (NumberFormatException error) {
                        System.out.println("\nDigite apenas números inteiros!");
                    }
                }

                while (true) {
                    try {
                        System.out.print("\nDigite a quantidade MÍNIMA do estoque: ");
                        quantMinEstoqueStr = read.nextLine().trim();

                        if (quantMinEstoqueStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!");
                        }
                        else {
                            quantMinEstoque = Integer.parseInt(quantMinEstoqueStr);

                            if (quantMinEstoque < 0) {
                                System.out.println("\nO estoque mínimo não pode ser negativo!");
                            }
                            else {
                                break;
                            }
                        }
                    } catch (NumberFormatException error) {
                        System.out.println("\nDigite apenas números inteiros!");
                    }
                }

                if (quantMinEstoque <= quantMaxEstoque) {
                    break;
                } else {
                    System.out.println("\nO estoque mínimo não pode ser maior que o máximo!");
                }
            }

            int quantMedia = (quantMaxEstoque + quantMinEstoque) / 2;

            if (quantAtualEstoque >= quantMedia) {
                System.out.println("\nNão efetuar compra!");
            }
            else {
                System.out.println("\nEfetuar compra!");
            }

            while (true) {
                System.out.print("\nDeseja realizar um novo cálculo (SIM / NÃO)? ");
                String calcularNovamente = read.nextLine().trim();

                if (calcularNovamente.equalsIgnoreCase("sim") || calcularNovamente.equalsIgnoreCase("s")) {
                    System.out.println("\nReiniciando...\n");
                    break;
                } else if (calcularNovamente.equalsIgnoreCase("nao") || calcularNovamente.equalsIgnoreCase("não") || calcularNovamente.equalsIgnoreCase("n")) {
                    System.out.println("\nPrograma finalizado!");
                    read.close();
                    System.exit(0);
                } else {
                    System.out.println("\nDigite apenas Sim ou Não!");
                }
            }
        }
    }
}
