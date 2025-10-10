package Questao10;

import java.util.Scanner;

public class Main {

    public static double calcularMedia(double a, double b) {
        double media = (a + b) / 2.; //Usar 2.0 para garantir que a divisão seja feita em ponto flutuante
        return media;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a nota 2: ");
        double nota2 = entrada.nextDouble();

        entrada.close();

        System.out.println("A média aritmética é: " + calcularMedia(nota1, nota2));

    }
}
