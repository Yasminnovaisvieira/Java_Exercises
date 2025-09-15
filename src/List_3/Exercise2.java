package List_3;

import com.sun.security.jgss.GSSUtil;

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
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.printf("\nDigite o nome da %dª pessoa: ", i+1);
                nomeLido = read.nextLine().trim();

                if (nomeLido.isEmpty()) {
                    System.out.println("\nO campo não pode ficar vazio!");
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
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        idadeLida = Integer.parseInt(idadeStr);

                        if (idadeLida < 0) {
                            System.out.println("\nA idade não pode ser negativa!");
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
                    System.out.printf("Digite a altura da %dª pessoa: ", i+1);
                    alturaStr = read.nextLine().trim();

                    if (alturaStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        alturaLida = Double.parseDouble(alturaStr);

                        if (alturaLida < 0) {
                            System.out.println("\nA altura não pode ser negativa!");
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
                    System.out.printf("Digite o peso da %dª pessoa: ", i+1);
                    pesoStr = read.nextLine().trim();

                    if (pesoStr.isEmpty()) {
                        System.out.println("\nO campo não pode ficar vazio!");
                    }
                    else {
                        pesoLido = Double.parseDouble(pesoStr);

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


        }
    }
}
