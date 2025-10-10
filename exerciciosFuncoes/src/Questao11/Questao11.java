package Questao11;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroPar numeroPar = new NumeroPar();

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        entrada.close();
        // Usando o método que retorna uma String
        String resultado = numeroPar.verificarParOuImpar(numero);
        System.out.println(resultado);
        // Usando o método que imprime na tela
        numeroPar.mostrarParOuImpar(numero);
    }
}
