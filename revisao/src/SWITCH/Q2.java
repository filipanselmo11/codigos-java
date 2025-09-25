package SWITCH;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        int nota1 = entrada.nextInt();

        System.out.println("Informe a segunda nota: ");
        int nota2 = entrada.nextInt();

        entrada.close();

        int somaNota = nota1 + nota2;

        System.out.println("Soma das notas: " + somaNota);

        switch(somaNota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Reprovado");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Exame");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Aprovado");
                break;
            default:
                break;
        }

    }
}
