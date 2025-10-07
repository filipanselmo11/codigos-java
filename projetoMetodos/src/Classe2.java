import java.util.Scanner;

public class Classe2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        pessoa1.nome = entrada.nextLine();
        System.out.println("Informe sua idade: ");
        pessoa1.idade = entrada.nextInt();
        entrada.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Informe seu endereço: ");
        pessoa1.endereco = entrada.nextLine();

        System.out.println("Informe o ano: ");
        int ano = entrada.nextInt();

        entrada.close();

        System.out.println("Mostrando informações");
        pessoa1.mostrarInformacoes();

        System.out.println("O ano de nascimento de " + pessoa1.nome + " é " + pessoa1.calcularAnoNascimento(ano));

    }
}
