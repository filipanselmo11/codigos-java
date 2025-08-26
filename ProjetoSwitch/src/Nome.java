import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = entrada.nextLine();

        entrada.close();

        switch (nome) {
            case "Fílip Anselmo":
                System.out.println("Olá Fílip Anselmo, tudo bem?");
                // case "Anselmo":
                //     System.out.println("Teu sobrenome é Anselmo");
                break;
            case "Maria":
                System.out.println("Olá Maria, tudo bem?");
                break;
            case "Naruto":
                System.out.println("Olá Naruto, tudo bem?");
                break;
            default:
                System.out.println("Olá " + nome + ", tudo bem?");
                break;
        }

    }
}