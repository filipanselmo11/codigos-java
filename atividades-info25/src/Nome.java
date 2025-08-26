import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        if (nome.equals("Joao")) {
            System.out.println("Ola Joao!!!");
        } else if (!nome.equals("Joao")) {
            System.out.println(nome);
        }

        entrada.close();
    }
}
