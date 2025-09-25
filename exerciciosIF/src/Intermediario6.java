import java.util.Scanner;

public class Intermediario6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();
        
        System.out.println("Informe o valor de Z: ");
        int z = entrada.nextInt();

        entrada.close();

        if ((x > y) && (x > z)) {
            System.out.println("O numero X: " + x + " é o maior!!");
        } else if ((y > x) && (y > z)) {
            System.out.println("O numero Y: " + y + " é o maior!!");
        } else {
            System.out.println("O numero Z: " + z + " é o maior!!");
        }
        
    }
}
