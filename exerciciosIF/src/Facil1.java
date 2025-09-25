import java.util.Scanner;

public class Facil1 {
    public static void main(String[] args) {
        //Faça um programa qie peça dois numeros e imprima o maior deles (usando if else)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();

        entrada.close();

        if(x > y) {
            System.out.println("O numero " + x + " é maior!!");
        } else if (y > x) {
            System.out.println("O numero " + y + " é maior!!");
        }
        
    }
}
