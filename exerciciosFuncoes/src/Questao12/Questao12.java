package Questao12;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        System.out.println("Informe o numero");
        int numero = entrada.nextInt();

        entrada.close();

        System.out.println(fatorial.retornaFatorial(numero));
    }
}
