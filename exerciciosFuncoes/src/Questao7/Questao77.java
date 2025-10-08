package Questao7;

import java.util.Scanner;

public class Questao77 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mensagem mensagem = new Mensagem();

        System.out.println("Digite seu nome: ");
        String meuNome = sc.nextLine();

        sc.close();

        mensagem.mostrarMensagem(meuNome);
    }
}
