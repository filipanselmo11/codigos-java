import java.util.Scanner;

public class Intermediario7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();

        System.out.println("Informe o valor de Z: ");
        int z = entrada.nextInt();

        entrada.close();

        int maior = 0;
        int menor = 0;

        // verificando primeiro para o maior valor
        if ((x > y) && (x > z)) {
            maior = x;
        } else if ((y > x) && (y > z)) {
            maior = y;
        } else if ((z > x) && (z > y)) {
            maior = z;
        }

        // Verificando para o menor valor agora
        if ((x < y) && (x < z)) {
            menor = x;
        } else if ((y < x) && (y < z)) {
            menor = y;
        } else if ((z < x) && (z < y)) {
            menor = z;
        }

        System.out.println("O maior valor dos três é: " + maior);
        System.out.println("O menor valor dos três é: " + menor);

    }
}
