import java.util.Scanner;

/**
 * 
 * Faça uma função que receba um número e retorne se é par ou não
 * Se o número for par, faça a subtração por 5
 * Se o número for ímpar, faça a soma por 3
 *
 */
public class Questao3 {
    
    public static void mostrarCalculoNumeroPar(int numero){
        if(numero % 2 == 0) {
            int subtracao = numero - 5;
            System.out.println("Resultado da subtracao é: " + subtracao);
        } else {
            int soma = numero + 3;
            System.out.println("Resultado da soma é: " + soma);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        entrada.close();

        mostrarCalculoNumeroPar(numero);

    }

}
