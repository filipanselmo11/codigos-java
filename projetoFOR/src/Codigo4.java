import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");

        numero = entrada.nextInt();

        entrada.close();

        for(int y = 0; y < numero; y++) {
            System.out.println("O valor de y é: " + y);
        }
    }
}
