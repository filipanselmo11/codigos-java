import java.util.Scanner;

public class VerificaNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        /**
         * Aqui nesse primeiro if, ele verifica se o nome informado pelo usuário é Jonas:
         * Ex: Fílip == Jonas ? False.
         * No exemplo acima, mostra que o nome Fílip é diferente de Jonas, ou seja esse if é False
         * Como esse primeiro if foi falso. Ou seja: if (Fílip == Jonas ? False). Ela passa pra próxima condicao
         * Que nesse caso aqui é o else
         * Como a condição que eu verifiquei inicialmente no if foi falsa, ele vai para outro bloco de código que é o else
         * Que nesse caso o else só acontece quando o if é False
         * Como o nome informado pelo usuário foi diferente de Jonas, ele vai imprimir o nome da pessoa
         * Ex: Olá Fílip
        */
        if (nome == "Jonas") {
            System.out.println("Olá Jonas!!!");
        } else {
            System.out.println("Olá " + nome);
        }
        
        entrada.close();
    }    
}
