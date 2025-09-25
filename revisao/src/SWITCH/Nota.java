package SWITCH;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota escolar: ");
        String nota = entrada.nextLine();

        entrada.close();

        switch(nota) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Bom");
                break;
            case "C":
                System.out.println("Regular");
                break;
            case "D":
                System.out.println("Insuficiente");
                break;
            case "F":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Nota invalida. Por favor digite uma nota valida");
                break;
        }
    }
}
