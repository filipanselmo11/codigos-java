import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar: ");
        double valor = entrada.nextDouble();

        entrada.close();

        if  (valor <= 0) {
            System.out.println("Valor inválido. Digite um valor maior que zero");
        } else if (valor > 1000) {
            System.out.println("Valor muito alto. O limite de saque eh de R$ 1000,00");
        } else {
            System.out.println("Saque realizado com sucesso. Valor sacado R$: " + valor);
        }
    }
}
