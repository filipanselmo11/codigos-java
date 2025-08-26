import java.util.Scanner;

public class Entrada4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        int x = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Informe o valor de y: ");
        int y = entrada.nextInt();

        int soma = x + y;
        int multiplicacao = x * y;
        int subtracao = x - y;
        int divisao = x / y;

        System.out.println("A soma dos numeros sao: " + soma);
        System.out.println("A multiplicacao dos numeros sao: " + multiplicacao);
        System.out.println("A subtracao dos numeros sao: " + subtracao);
        System.out.println("A divisao dos numeros sao: " + divisao); 
        
        entrada.close();
    }
}
