//Forma 1: Fazer um método que recebe um número inteiro como parâmetro e exibe o dobro desse número. 

package Questao2;

import java.util.Scanner;

public class Q2 {

    //O método é fora do main, por que ele é uma função auxiliar
    public static void mostrarDobro(int numero) {
        int dobro = numero * 2;
        System.out.println("O dobro de " + numero + " é: " + dobro);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        scanner.close();

        mostrarDobro(numero);//Para usar ele no main, é só chamar o nome do método e passar o parâmetro se tiver

    }
}
