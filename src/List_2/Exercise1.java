package List_2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Categoria Etária =====");

            String nome = "";
            while (true) {
                System.out.print("\nDigite seu nome: ");
                nome = read.nextLine().trim();

                if (nome.isEmpty()) {
                    System.out.println("\nO campo não pode ficar vazio!");
                }
                else {
                    break;
                }
            }

            String idadeString = "";
            int idade = 0;
            while (true) {
                try {
                    System.out.print("Digite sua idade: ");
                    idadeString = read.nextLine().trim();

                    if (idadeString.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!\n");
                    }
                    else {
                        idade = Integer.parseInt(idadeString);

                        if (idade < 0) {
                            System.out.println("\nA idade não pode ser negativa!");
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
            System.out.printf("\nNome: %s", nome);

            if (idade >= 30) {
                System.out.println("\nCategoria: Adulto");
            }
            else if (idade >= 18) {
                System.out.println("\nCategoria: Adulto Jovem");
            }
            else if (idade >= 15) {
                System.out.println("\nCategoria: Adolescente");
            }
            else {
                System.out.println("\nCategoria: Criança");
            }

            while (true) {
                System.out.print("\nDeseja calcular a categoria novamente (SIM / NÃO)? ");
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
