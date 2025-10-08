package Questao8;

import java.util.Scanner;

public class Questao8 {

    public static void mostrarMaiorIdade(int idadePessoa) {
        if(idadePessoa >= 18) {
            System.out.println("Você é de maior. Já pode pagar contas");
        } else {
            System.out.println("Você é de menor. Vá brincar");
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma idade: ");
        int idade = entrada.nextInt();

        entrada.close();

        mostrarMaiorIdade(idade);
    }
}
