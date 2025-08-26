import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numero1 = entrada.nextInt();

        System.out.println("Informe o segundo numero: ");
        int numero2 = entrada.nextInt();

        int soma = numero1 + numero2;

        if (soma > 10) {
            soma = numero1 + 10;
            System.out.println("Resultado da soma atualizada: " + soma);
        } else {
            System.out.println("A soma e menor ou igual a 10: " + soma);
        }

        entrada.close();
    }
}
