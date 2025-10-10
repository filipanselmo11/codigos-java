package Questao11;

import java.util.Scanner;

public class Main {

    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "O número " + numero + " é par.";// String, por que eu to retornando um texto
        } else {
            return "O número " + numero + " é ímpar.";
        }
    }

    public static void mostrarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");//Void, por que to imprimindo na tela com o
                                                                 //System.out.println()
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        entrada.close();

        // Usando o método que retorna uma String
        String resultado = verificarParOuImpar(numero);
        System.out.println(resultado);
        // Usando o método que imprime na tela
        mostrarParOuImpar(numero);
    }
}
