package Questao4;

import java.util.Scanner;

public class Q4 {
    
    public static boolean ePositivo(int numero) {//Esse método aqui é do tipo booelan, por que eu tenho que verificar se tal numero é positivo ou negativo
        if(numero > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int z = entrada.nextInt();

        entrada.close();

        System.out.println(ePositivo(z));
    }
}
