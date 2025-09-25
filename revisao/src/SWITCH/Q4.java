package SWITCH;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();

        System.out.println("Digite a operacao: +, -, * ou / ");
        String operacao = entrada.nextLine();

        entrada.close();

        switch(operacao) {
            case "+":
                int soma = x + y;
                System.out.println("Soma = " + soma);
                break;
            case "-":
                int subtracao = x - y;
                System.out.println("Subtracao = " + subtracao);
                break;

        }
    }
}
