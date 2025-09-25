package SWITCH;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um codigo: ");
        int codigo = entrada.nextInt();

        entrada.close();

        switch (codigo) {
            case 1:
                System.out.println("Alimento não-perecivel");
                break;
            case 2:
            case 3:
            case 4:

                System.out.println("Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Vestuario");
                break;
            case 7:
                System.out.println("Higiene Pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Limpeza e Utensílios Domesticos");
                break;
            default:
                System.out.println("Código Inválido");
                break;
        }
    }
}
