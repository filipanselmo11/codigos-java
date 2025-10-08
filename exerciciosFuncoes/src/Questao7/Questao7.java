package Questao7;

import java.util.Scanner;

public class Questao7 {
    
    public static String retornarMensagem(String nome) {
        String textoMensagem = "Olá " + nome + "." + " Bem vindo(a)";
        return textoMensagem;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        entrada.close();

        System.out.println(retornarMensagem(nome));
    }
}
