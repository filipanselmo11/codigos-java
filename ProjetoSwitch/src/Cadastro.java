import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String repetirCadastro;
        String nome;
        int idade;

        repetirCadastro = "S";
        while(repetirCadastro == "S") {
            System.out.println("Nome: ");
            nome = entrada.nextLine();
            System.out.println("Idade: ");
            idade = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Cadastrar Novamente? (S/N)");
            repetirCadastro = entrada.nextLine();
        }

        entrada.close();
    }
}
