import java.util.Scanner;

public class Entrada3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("\nResultado\n");
        System.out.println(nome + " tem " + idade + " de idade");

        entrada.close();
    }
}
