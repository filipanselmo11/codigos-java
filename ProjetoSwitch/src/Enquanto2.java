public class Enquanto2 {
    public static void main(String[] args) {

        int x, soma, subtracao;

        x = 0;
        soma = 1;
        subtracao = 2;

        while(x <= 11) {
            System.out.println("Valor atual X: " + x);
            soma = soma + x;
            System.out.println("Valor atual soma: " + soma);
            subtracao = subtracao - 4;
            System.out.println("Valor atual subtracao: " + subtracao);
            x = x + 1;
        }

    }
}
