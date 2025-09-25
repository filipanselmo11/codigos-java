package WHILE;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();

        int contador = 0;
        int soma = 0;

        while(numero > 0) {
            soma = soma + numero;
            System.out.println("Digite um numero:");
            numero = entrada.nextInt();
            contador+= 1;
        }

        entrada.close();

        System.out.println("Soma = " + soma);
    }
}
