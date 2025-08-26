import java.util.Scanner;

public class IdadeUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        int idade = entrada.nextInt();

        /***
         * Imaginem que a idade é 19
         * idade = 19
         * 
         * Ai no if fica assim
         * if (19 == 18 ? && 19 >= 18 ?)
         * A primeira condicao sera False, por que 19 não é igual a 18
         * E a segunda condicao ser True, por que 19 é maior ou igual a 18
         * Depois que essas condições são verificadas, o if fica assim:
         * if (False && True) {}
         * Esse False, é resultado de 19 == 18 ?
         * E o True, é resultado de 19 >= 18
         * Como nesse trecho tá sendo utilizado o operador lógico &&
         * Ambas as condições tem que ser True para serem verdadeiras
         * False && Qualquer coisa(True ou False) sempre vai ser False
         */

        if (idade >= 18 && idade < 26) {//(19 == 18 ? False) && (19 >= 18 ? True) => False && True ? False
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é da terceira idade");
        }

        entrada.close();
    }
}
