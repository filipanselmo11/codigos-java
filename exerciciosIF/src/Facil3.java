import java.util.Scanner;

public class Facil3 {
    public static void main(String[] args) {
        //Faça um programa que verifique (if else) se uma letra digitada é "F" ou "M"
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma letra. F, M: ");
        String letra = entrada.nextLine();

        entrada.close();

        if(letra.equals("F")) {
            System.out.println("F - Feminino");
        } else if(letra.equals("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}
