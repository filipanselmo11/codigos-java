package IF;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();

        entrada.close();

        int soma = x + y;

        System.out.println("Resultado da soma: " + soma);

        if(soma > 20) {
            int soma2 = soma + 8;
            System.out.println("Soma = " + soma2);
        } else if (soma <= 20) {
            int subtracao = soma - 5;
            System.out.println("Subtracao = " + subtracao);
        }

    }
}
