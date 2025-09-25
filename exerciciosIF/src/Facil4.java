import java.util.Scanner;

public class Facil4 {
    public static void main(String[] args) {
        //Verificar se a letra digitada é letra ou consoante
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        String letra = entrada.nextLine();

        entrada.close();

        if(
            letra.equals("a") || letra.equals("A") || letra.equals("e") ||
            letra.equals("E") || letra.equals("i") || letra.equals("I") ||
            letra.equals("o") || letra.equals("O") || letra.equals("u") ||
            letra.equals("U")
        ) {
            System.out.println("A letra digitada é uma vogal");
        } else {
            System.out.println("A letra digitada é uma consoante");
        }
    }
}
