import java.util.Scanner;

public class Questao5 {
    public static void contarVogais(String palavra){
        int contador = 0;
        //Esse trecho, palavra.length(), ele basicamente ta pegando do tamanho da palavra. Por meio dessa palavra length() (tamanho)
        //Ele retorna um número, indicando o tamanho da palavra
        //Por exemplo: banana, o length(tamanho) dela é: 6
        for(int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);//Variavel do tipo char que recebe a letra na posição i da palavra, por meio do método charAt()
                                           //Que é um método da classe String que retorna o caractere (char) na posição especificada.
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
               letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contador++;
            }
        }

        System.out.println("A palavra " + palavra + " tem " + contador + " vogais.");
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        entrada.close();

        contarVogais(palavra);
    }
}
