import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota: ");
        int nota = entrada.nextInt();

        entrada.close();

        if (nota == 7) {
            System.out.println("Aprovado");
        } else if (nota == 6) {
            System.out.println("Recuperação");
        } else if (nota == 5) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Nota inválida");
        }


    }
}
