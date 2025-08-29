public class Contador {
    public static void main(String[] args) {

        int contador = 0;
        int soma = 0;

        while (contador < 5) {
            System.out.println("Valor do Contador: " + contador);
            System.out.println("Valor da Soma: " + soma);
            soma = soma + contador;
            System.out.println("Soma: " + soma);
            System.out.println();
            contador++;
        }
    }
}
