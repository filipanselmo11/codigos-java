package Questao6;

import java.util.Scanner;

public class Questao6 {
    
    public static void mostrarQuadrado(int x) {
        int quadrado = x*x;
        System.out.println("O quadrado do numero " + x + " é " + quadrado);
    }
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de morango: ");
        int morango = entrada.nextInt();

        entrada.close();

        mostrarQuadrado(morango);
    }
}
