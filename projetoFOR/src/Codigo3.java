import java.util.Scanner;

public class Codigo3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;

        for(int x = 0; x < 3; x++) {
            System.out.println("X = " + x);
            System.out.println("Informe o valor do numero1: ");
            numero1 = entrada.nextInt();
            System.out.println("Informe o valor do numero2: ");
            numero2 = entrada.nextInt();
            soma = numero1 + numero2;
            System.out.println("Soma = " + soma);
        }

        entrada.close();
    }   
}
