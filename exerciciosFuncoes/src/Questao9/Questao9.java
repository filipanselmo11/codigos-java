package Questao9;

import java.util.Scanner;

public class Questao9 {
    
    public static void mostrarMaior(int a, int b, int c) {

        if(a > b && a > c) {
            System.out.println("O maior valor é: " + a);
        } else if(b > a && b > c) {
             System.out.println("O maior valor é: " + b);
        } else {
             System.out.println("O maior valor é: " + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de Z: ");
        int z = sc.nextInt();

        System.out.println("Informe o valor de X: ");
        int x = sc.nextInt();
        
        System.out.println("Informe o valor de Y: ");
        int y = sc.nextInt();

        sc.close();

        mostrarMaior(z, x, y);
        
    }
}
