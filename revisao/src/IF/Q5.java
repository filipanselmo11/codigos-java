package IF;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numero1 = entrada.nextInt();

        System.out.println("Informe o segundo numero: ");
        int numero2 = entrada.nextInt();

        System.out.println("Informe o terceiro numero: ");
        int numero3 = entrada.nextInt();

        entrada.close();

        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Numero 3: " + numero3);

        if ((numero1 > numero2) && (numero1 > numero3)) {
            System.out.println("O numero " + numero1 + " é o maior dentre os 3 numeros informados");
        } else if ((numero2 > numero1) && (numero2 > numero3)) {
            System.out.println("O numero " + numero2 + " é o maior dentre os 3 numeros informados");
        } else if ((numero3 > numero1) && (numero3 > numero2)) {
            System.out.println("O numero " + numero3 + " é o maior dentre os 3 numeros informados");
        }

    }
}
