package FOR;

import java.util.Scanner;

public class Tabuada1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        int prod = 1;

        for(int i = 1; i <= 20; i++) {
            prod = numero * i;
            System.out.println(numero + " x " + i + " = " + prod);
        }

    }
}
