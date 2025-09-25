package IF;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.println("Informe a terceira nota: ");
        double nota3 = entrada.nextDouble();

        entrada.close();

        double media = nota1 + nota2 + nota3 / 3;

        System.out.println("Media = " + media);

        if(media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if(media >= 5 && media < 7) {
            System.out.println("Aluno em Recuperação");
        } else if(media < 5) {
            System.out.println("Aluno Reprovado");
        }
        
    }
}
