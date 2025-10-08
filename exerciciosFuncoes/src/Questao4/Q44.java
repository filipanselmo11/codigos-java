package Questao4;

import java.util.Scanner;

public class Q44 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroPositivo numeroPositivo = new NumeroPositivo();

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        numeroPositivo.imprimirNumeroPositivo(numero);
        System.out.println(numeroPositivo.verificarNumeroPositivo(numero));
        System.out.println(numeroPositivo.retornarNumeroPositivo(numero));
    }
}
