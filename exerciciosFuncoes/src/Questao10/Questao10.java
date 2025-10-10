package Questao10;

import java.util.Scanner;

public class Questao10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MediaAritimetica mediaAritimetica = new MediaAritimetica();

        System.out.println("Informe a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a nota 2: ");
        double nota2 = entrada.nextDouble();

        entrada.close();

        System.out.println("A média aritmética é: " + mediaAritimetica.calcularMedia(nota1, nota2));

    }
}
