/**
 * 
 * Faça uma função em Java que receba um nome e uma idade
 * Se a idade for menor que 0, exiba a seguinte mensagem: "Idade inválida para " + nome
 * Se a idade for menor que 18, exiba a seguinte mensagem: nome + " é menor de idade"
 * Senão, exiba a seguinte mensagem: nome + " é maior de idade"
 */

import java.util.Scanner;

public class Questao4 {
    
    public static void verificarIdade(String nome, int idade){
        if(idade < 0) {
            System.out.println("Idade inválida para " + nome);
        } else if(idade < 18) {
            System.out.println(nome + " é menor de idade.");
        } else {
            System.out.println(nome + " é maior de idade.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nomeUsuario = entrada.nextLine();

        System.out.println("Informe seu nome: ");
        int idadeUsuario = entrada.nextInt();

        entrada.close();

        verificarIdade(nomeUsuario, idadeUsuario);
        
    }
}
