package Questao5;

import java.util.Scanner;

public class Questao5 {
    
    public static int retornaMaior(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();

        entrada.close();

        System.out.println("O maior numero é: " + retornaMaior(x, y));
        
    }
}
