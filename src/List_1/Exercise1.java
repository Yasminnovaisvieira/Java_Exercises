package List_1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DateTimeFormatter formatacaoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoFormatada = null;

        while (true) {
            System.out.println("===== Dados de Cadastro =====");

            String nome = "";
            while (true) {
                System.out.print("Digite seu 1º nome: ");
                nome = read.nextLine().trim();

                if ((!nome.isEmpty())) {
                    break;
                }
                else {
                    System.out.println("\nO nome não pode ser vazio! Por favor, digite novamente.\n");
                }
            }

            String sobrenome = "";
            while (true) {
                System.out.print("Digite seu sobrenome: ");
                sobrenome = read.nextLine().trim();

                if ((!sobrenome.isEmpty())) {
                    break;
                }
                else {
                    System.out.println("\nO sobrenome não pode ser vazio! Por favor, digite novamente.\n");
                }
            }

            while (true) {
                System.out.print("Digite sua data de nascimento (dia/mês/ano): ");
                String dataNascimento = read.nextLine().trim();

                if (!dataNascimento.contains("/") && dataNascimento.length() == 8) {
                    dataNascimento = dataNascimento.substring(0,2) + "/" + dataNascimento.substring(2,4) + "/" + dataNascimento.substring(4);
                }

                try {
                    dataNascimentoFormatada = LocalDate.parse(dataNascimento, formatacaoDatas);
                    if (dataNascimentoFormatada.isAfter(LocalDate.now())) {
                        System.out.println("\nA data de nascimento não pode ser no futuro. Tente novamente.\n");
                    } else {
                        break;
                    }
                }
                catch (DateTimeException error) {
                    System.out.println("\nFormato Inválido. Digite em formato de dia/mês/ano\n");
                }
            }

            double pretensaoSalarial;
            while (true) {
                try {
                    System.out.print("Digite sua pretensão salarial: ");
                    pretensaoSalarial = read.nextDouble();
                    read.nextLine();

                    if (pretensaoSalarial > 0) {
                        break;
                    } else {
                        System.out.println("\nA pretensão salarial deve ser um valor POSITIVO! Por favor, digite novamente.\n");
                    }
                }
                catch (InputMismatchException error) {
                    System.out.println("\nDigite apenas números!\n");
                    read.nextLine();
                }
            }

            String grauEnsino = "";
            while(true) {
                System.out.print("Em relação aos graus de instituição: ");
                System.out.print("\n1 - Ensino Médio\n2 - Ensino Técnico\n3 - Ensino Superior");
                System.out.print("\nDigite o número referente ao seu grau de instituição: ");

                try {
                    int grauEnsinoNumero = read.nextInt();
                    read.nextLine();

                    if (grauEnsinoNumero == 1) {
                        grauEnsino = "Ensino Médio";
                        break;
                    }
                    else if (grauEnsinoNumero == 2) {
                        grauEnsino = "Ensino Técnico";
                        break;
                    }
                    else if (grauEnsinoNumero == 3) {
                        grauEnsino = "Ensino Superior";
                        break;
                    }
                    else {
                        System.out.println("\nDigite um dos números das opções oferecidas!\n");
                    }
                }
                catch (InputMismatchException error) {
                    System.out.println("\nDigite apenas números!\n");
                    read.nextLine(); // Para "limpar" e não pular o próximo input
                }
            }

            String cargoPretendido = "";

            while (true) {
                System.out.print("Digite o cargo pretendido: ");
                cargoPretendido = read.nextLine().trim();

                if (!cargoPretendido.isEmpty()) {
                    break;
                } else {
                    System.out.println("\n\nO cargo não pode ser vazio! Por favor, digite novamente.\n");
                }
            }



            String cnh = "";
            while (true) {
                System.out.print("Digite se você possui CNH tipo B (Sim ou Não): ");
                String cnhBool = read.nextLine().trim();

                if (cnhBool.equalsIgnoreCase("sim") || cnhBool.equalsIgnoreCase("s")) {
                    cnh = "Possui";
                    break;
                }
                else if (cnhBool.equalsIgnoreCase("nao") || cnhBool.equalsIgnoreCase("não") || cnhBool.equalsIgnoreCase("n")) {
                    cnh = "Não possui";
                    break;
                }
                else {
                    System.out.println("\nDigite apenas Sim ou Não!\n");
                }
            }

            System.out.println("=== DADOS INFORMADOS PELO CANDIDATO ===");
            System.out.printf("\nNome: %s %s\nData de Nascimento: %s\nPretensão Salarial: %.2f\nGrau de Instituição: %s\nCargo Pretendido: %s\nCNH tipo B: %s", nome, sobrenome, dataNascimentoFormatada.format(formatacaoDatas), pretensaoSalarial, grauEnsino, cargoPretendido, cnh);

            System.out.println("\n\nCADASTRO REALIZADO COM SUCESSO! 😁");

            while (true) {
                System.out.print("\nDeseja realizar outro cadastro (SIM ou NÃO)? ");
                String novoCadastro = read.nextLine().trim();

                if (novoCadastro.equalsIgnoreCase("nao") || novoCadastro.equalsIgnoreCase("não") || novoCadastro.equalsIgnoreCase("n")) {
                    System.out.println("\nPrograma finalizado!");
                    read.close(); // Fecha o Scanner
                    System.exit(0); // Encerra o programa
                }
                else if (novoCadastro.equalsIgnoreCase("sim") || novoCadastro.equalsIgnoreCase("s")) {
                    break;
                }
                else {
                    System.out.println("\nDigite apenas SIM ou NÃO!");
                }
            }
        }
    }
}
