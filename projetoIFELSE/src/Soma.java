import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        int numero2 = entrada.nextInt();

        entrada.close();

        int soma = numero1 + numero2;

        if (soma > 10) {
            soma = numero1 + 10;
            System.out.println("Resultado da soma atualizada: " + soma);
        } else {
            System.out.println("A soma eh menor ou igual a 10");
        }

    }
}
