package IF;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade, nadador: ");
        int idade = entrada.nextInt();

        entrada.close();

        if(idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 14) {
            System.out.println("Juvenil");
        } else if(idade >= 9) {
            System.out.println("Infantil");
        } else if(idade < 9) {
            System.out.println("Mirim");
        }
    }
}
