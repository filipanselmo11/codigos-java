package SWITCH;

import java.util.Scanner;

public class Exercicio1 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o dia da semana (1-7): ");
        int dia = entrada.nextInt();

        entrada.close();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
     }
}
