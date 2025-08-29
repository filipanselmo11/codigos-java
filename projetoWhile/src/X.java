import java.util.Scanner;

public class X {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x;

        System.out.println("Informe o valor de X: ");
        x = entrada.nextInt();
        
        while (x != 8) {
            System.out.println("Valor incorreto! Tente novamente: ");
            x = entrada.nextInt();
        }

        entrada.close();
        System.out.println("Valor correto.Saindo do while...");

    }
}
