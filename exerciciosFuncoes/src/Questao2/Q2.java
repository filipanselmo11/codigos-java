//Forma 1: Fazer um método que recebe um número inteiro como parâmetro e exibe o dobro desse número. 

package Questao2;

import java.util.Scanner;

public class Q2 {

    public static void mostrarDobro(int numero) {
        int dobro = numero * 2;
        System.out.println("O dobro de " + numero + " é: " + dobro);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Como o gpt gosta de usar
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        scanner.close();

        mostrarDobro(numero);

    }
}
