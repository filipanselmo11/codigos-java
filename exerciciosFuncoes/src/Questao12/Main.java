package Questao12;

import java.util.Scanner;

public class Main {
    
    public static int retornaFatorial(int numero) {
        int resultado = 1;
        for(int i = 1; i <= numero; i++) {
            System.out.println(i);
            resultado = resultado * i;
            // resultado *= i;
        }

        return resultado;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        int resultadoFatorial = retornaFatorial(numero);

        System.out.println("O fatorial de " + numero + " é " + resultadoFatorial);
    }
}
