import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de y: ");
        int y = entrada.nextInt();

        entrada.close();

        int soma = x + y;

        switch(soma) {
            case 10:
                System.out.println("O resultado da soma deu 10");
                break;
            case 25:
                System.out.println("O resultado da soma deu 25");
                break;
            case 30:
                System.out.println("O resultado da soma deu 30");
                break;
            default:
                System.out.println("O resultado da soma deu " + soma);
                break;
        }
    }
}
