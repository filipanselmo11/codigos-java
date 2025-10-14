import java.util.Scanner;

/***
 * 
 * Crie uma função que mostre um texto digitado pelo usuário na tela.
 */
public class Questao1 {
    
    public static void mostrarTexto(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String textoDigitado = entrada.nextLine();

        entrada.close();

        mostrarTexto(textoDigitado);
    }
}
