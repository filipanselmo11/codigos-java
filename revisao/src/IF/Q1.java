package IF;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        if(numero < 0) {
            System.out.println("Você digitou um número negativo");
        } else {
            System.out.println("Você digitou um número positivo");
        }
    }
}
