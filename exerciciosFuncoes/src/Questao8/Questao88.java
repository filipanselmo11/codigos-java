package Questao8;

import java.util.Scanner;

public class Questao88 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Idade idadeObj = new Idade();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        sc.close();

        idadeObj.imprimirMaiorIdade(idade);

    }
}
