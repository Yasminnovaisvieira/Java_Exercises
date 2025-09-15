package List_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PessoaFa {
    String nome = "";
    String avaliacaoFilme = "";
}

public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("===== Opinião Sobre Filme");

            while (true) {
                System.out.print("\nDigite o nome do filme que os fãs desejam avaliar: ");
                String nomeFilme = read.nextLine().trim();

                if (nomeFilme.isEmpty()) {
                    System.out.println("\nO campo não pode ficar vazio!");
                }
                else {
                    break;
                }
            }

            List<PessoaFa> listaFas = new ArrayList<>();

            Boolean continuarBool = false;
            String continuar = "";
            while (true) {
                /// COLOCAR AQUI O RESTANTE DO CÓDIGO

                while (true) {
                    System.out.print("\nDeseja continuar (SIM / NÃO)? ");
                    continuar = read.nextLine().trim();

                    if (continuar.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        if ((!continuar.equalsIgnoreCase("sim")) && (!continuar.equalsIgnoreCase("s")) && (!continuar.equalsIgnoreCase("nao")) && (!continuar.equalsIgnoreCase("não")) && (!continuar.equalsIgnoreCase("n"))) {
                            System.out.println("\nDigite apenas Sim ou Não!");
                        }
                        else {
                            break;
                        }
                    }
                }

            if ((continuar.equalsIgnoreCase("sim")) || (continuar.equalsIgnoreCase("s"))) {
                // CONTINUAR
            }
            }
        }
    }
}
