import java.util.Scanner;

public class QuestaoFor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: " );
            int numero = sc.nextInt();

            if(numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior numero é: " + maior);
        sc.close();
    }
}