package WHILE;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        int prod = 1; //produto ou multiplicacao

        int contador = 1;

        //DE 1 ATÉ 10, por isso o uso do (<=)
        while(contador <= 10) {
            prod = numero * contador;
            System.out.println(numero + " x " + contador + " = " + prod);
            contador += 1;
        } 
    }
}
