package SWITCH;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        entrada.close();

        switch (idade) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Crianca");
                break;
            case 13, 14, 15, 16, 17:
                System.out.println("Adolescente");
                break;
            case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
                 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
                 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
                System.out.println("Adulto");
                break;
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71:
               System.out.println("Idoso");
               break;
            default:
                System.out.println("Idade invalida");
                break;
        }
    }
}
