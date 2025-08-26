// package class;

import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int x = entrada.nextInt();

        System.out.println("Informe o segundo valor: ");
        int y = entrada.nextInt();

        System.out.println("Resultados");

        System.out.println(x + " + " + y + " = " + (x + y));
        
        entrada.close();
    }
}
