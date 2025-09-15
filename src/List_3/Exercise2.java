package List_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe para armazenar as informações da pessoa
// Não tem o public pois ela é visível apenas para outras classes da mesma pasta (List_3)
class Pessoa {
    // Atributos dessa pessoa
    String nome = "";
    int idade = 0;
    double altura = 0.0;
    double peso = 0.0;
}

public class Exercise2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[10];

        String nomeLido = "";
        String idadeStr = "";
        int idadeLida = 0;
        String alturaStr = "";
        double alturaLida = 0;
        String pesoStr = "";
        double pesoLido = 0;

        while (true) {
            System.out.println("===== Classificação de Pessoas com Base em Critérios =====");

            for (int i = 0; i < 10; i++) {
                while (true) {
                    System.out.printf("\nDigite o nome da %dª pessoa: ", i+1);
                    nomeLido = read.nextLine().trim();

                    if (nomeLido.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!\n");
                    }
                    else {
                        break;
                    }
                }

                while (true) {
                    try {
                        System.out.printf("Digite a idade da %dª pessoa: ", i+1);
                        idadeStr = read.nextLine().trim();

                        if (idadeStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!\n");
                        }
                        else {
                            idadeLida = Integer.parseInt(idadeStr);

                            if (idadeLida < 0) {
                                System.out.println("\nA idade não pode ser negativa!\n");
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

                while (true) {
                    try {
                        System.out.printf("Digite a altura da %dª pessoa: ", i+1);
                        alturaStr = read.nextLine().trim();

                        if (alturaStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!\n");
                        }
                        else {
                            alturaLida = Double.parseDouble(alturaStr.replace(",", "."));

                            if (alturaLida < 0) {
                                System.out.println("\nA altura não pode ser negativa!\n");
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

                while (true) {
                    try {
                        System.out.printf("Digite o peso da %dª pessoa: ", i+1);
                        pesoStr = read.nextLine().trim();

                        if (pesoStr.isEmpty()) {
                            System.out.println("\nO campo não pode ficar vazio!\n");
                        }
                        else {
                            pesoLido = Double.parseDouble(pesoStr.replace(",", "."));

                            if (pesoLido < 0) {
                                System.out.println("\nO peso não pode ser negativo!");
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

                /* Criando um objeto para guardar as informações */
                Pessoa novaPessoa = new Pessoa();

                novaPessoa.nome = nomeLido;
                novaPessoa.idade = idadeLida;
                novaPessoa.altura = alturaLida;
                novaPessoa.peso = pesoLido;

                /* Guardando o objeto no Array */
                pessoas[i] = novaPessoa;
            }

            List<Pessoa> pessoasMais50Anos = new ArrayList<>();
            List<Pessoa> pessoasMais160Altura = new ArrayList<>();
            List<Pessoa> pessoasMenos80kg = new ArrayList<>();

            for (Pessoa pessoa : pessoas) {
                if (pessoa.idade > 50) {
                    pessoasMais50Anos.add(pessoa);
                }

                if (pessoa.altura > 1.60) {
                    pessoasMais160Altura.add(pessoa);
                }

                if (pessoa.peso < 80) {
                    pessoasMenos80kg.add(pessoa);
                }
            }

            System.out.println("\n=== RESULTADO ===");
            System.out.printf("\nQuantidade de Pessoas com Idade acima de 50 anos: %d", pessoasMais50Anos.size());

            if (pessoasMais50Anos.isEmpty()) {
                System.out.print(" Nenhuma.");
            }
            else {
                for (Pessoa p : pessoasMais50Anos) {
                    System.out.printf("\n- %s (%d anos)", p.nome, p.idade);
                }
            }

            System.out.printf("\n\nQuantidade de Pessoas com Altura acima de 1.60m: %d", pessoasMais160Altura.size());

            if (pessoasMais160Altura.isEmpty()) {
                System.out.print(" Nenhuma.");
            }
            else {
                for (Pessoa p : pessoasMais160Altura) {
                    System.out.printf("\n- %s (%.2fm)", p.nome, p.altura);
                }
            }

            System.out.printf("\n\nQuantidade de Pessoas com Peso Menor que 80kg: %d", pessoasMenos80kg.size());

            if (pessoasMenos80kg.isEmpty()) {
                System.out.print(" Nenhuma.");
            }
            else {
                for (Pessoa p : pessoasMenos80kg) {
                    System.out.printf("\n- %s (%.1fkg)", p.nome, p.peso);
                }
            }

            while (true) {
                System.out.print("\nDeseja responder novamente (SIM / NÃO)? ");
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
