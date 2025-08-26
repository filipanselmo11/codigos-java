import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = entrada.nextLine();

        System.out.println("Digite um numero inteiro: ");
        int numero = entrada.nextInt();
        
        System.out.println("Digite um numero decimal: ");
        double numeroDecimal = entrada.nextDouble();

        entrada.close();

        System.out.println("O texto digitado pelo usuário foi: " + texto);
        System.out.println("O numero inteiro digitado pelo usuário foi: " + numero);
        System.out.println("O numero decimal digitado pelo usuário foi: " + numeroDecimal);
        
    }
}
