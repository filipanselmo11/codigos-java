import java.util.Scanner;

public class QuestaoIfElse1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();

        if (x > y) {
            System.out.println(x);
        } else if (y > x) {
            System.out.println(y);
        } else if ((x == y) || (y == x)) {//Opcional, eu só coloquei caso o usuário informe numeros iguais
            System.out.println(x + " é igual a " + y);
        }

        entrada.close();
        
    }
}
