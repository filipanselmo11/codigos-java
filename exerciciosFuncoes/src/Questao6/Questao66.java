package Questao6;

import java.util.Scanner;

public class Questao66 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumeroQuadrado nq = new NumeroQuadrado();

        System.out.println("Informe o valor de Y: ");
        int y = sc.nextInt();

        sc.close();

        nq.mostrarQuadrado(y);
        System.out.println("O quadrado do número é: " + nq.retornarQuadrado(y));//Forma 1, chamar o método direto no println
        //Forma 2
        //int quadrado = nq.retornarQuadrado(y), armazenar em uma variavel e depois printar
        //System.out.println("O quadrado do número é: " + quadrado);


    }
}
