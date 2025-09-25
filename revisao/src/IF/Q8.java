package IF;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double valorProduto = entrada.nextDouble();

        entrada.close();

        if(valorProduto < 20.00) {
            System.out.println("Lucro de 45%");
        } else {
            System.out.println("Lucro de 30%");
        }
    }
}
