package FOR;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        for(int i = 0; i < numero; i++) {
            System.out.println("Saudações " + nome + " tudo certinho ?");
        }
    }
}
