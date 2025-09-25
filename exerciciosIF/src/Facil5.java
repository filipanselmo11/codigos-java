import java.util.Scanner;

public class Facil5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a nota 2: ");
        double nota2 = entrada.nextDouble();

        entrada.close();

        double media = (nota1 + nota2) / 2;

        System.out.println("A media é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 10) {
            System.out.println("Aprovado com Distincao");
        } else if (media < 7) {
            System.out.println("Reprovado");
        }
        
    }
}
