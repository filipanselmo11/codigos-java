import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, num1, num2, soma, multiplicar, subtrair;

        opcao = 0;

        while (opcao != 4) {
            System.out.println("Menu de Opcoes!");
            System.out.println("1 - Somar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Subtrair");
            System.out.println("Informe a opcao desejada (4 para sair): ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do num1: ");
                    System.out.println("Informe o valor do num2: ");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    soma = num1 + num2;
                    System.out.println("Soma = " + soma);
                    break;
                case 2:
                    System.out.println("Informe o valor do num1: ");
                    System.out.println("Informe o valor do num2: ");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    multiplicar = num1 * num2;
                    System.out.println("Multiplicacao = " + multiplicar);
                    break;
                case 3:
                    System.out.println("Informe o valor do num1: ");
                    System.out.println("Informe o valor do num2: ");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    subtrair = num1 - num2;
                    System.out.println("Subtracao = " + subtrair);
                    break;
                default:
                    break;
            }
        }

        entrada.close();
    }
}
