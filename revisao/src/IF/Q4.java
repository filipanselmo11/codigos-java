package IF;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        if(numero % 2 == 0) {
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é impar!");
        }
    }
}
