import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        int temperatura = entrada.nextInt();

        entrada.close();

        if (temperatura < 0) {
            System.out.println("Está muito frio");
        } else if (temperatura <= 30) {
            System.out.println("Temperatura agradavel");
        } else {
            System.out.println("Está muito quente");
        }

    }
}
