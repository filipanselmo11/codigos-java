import java.util.Scanner;

/**
 * 
 * Faça uma função que receba 2 números inteiros e calcule a multiplicação dos dois
 * 
 */

public class Questao2 {
    public static int calcularMult(int x, int y) {
        int prod = x * y;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero 1: ");
        int numero1 = sc.nextInt();

        System.out.println("Informe o numero 2: ");
        int numero2 = sc.nextInt();

        sc.close();
        
        int resultado = calcularMult(numero1, numero2);

        System.out.println("O resultado da multiplicacao é: " + resultado);
    }
}
