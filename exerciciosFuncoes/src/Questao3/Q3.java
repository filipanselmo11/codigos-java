//Forma1: Fazer um método estático(static) fora do método main, que faça a soma dos dois numeros e depois mostre na tela

package Questao3;

import java.util.Scanner;

public class Q3 {
    
    public static void somarDoisNumeros(int a, int b) { //Quando eu quero fazer um outro método estático(static)
                                                        //Ele tem que ser feito fora do método main
                                                        //Por que o main vai ficar responsável 
                                                        //por chamar esse método e executar outros códigos
                                                        //Que estiverem dentro do main
        int soma = a + b;
        System.out.println("A soma dos dois é: " + soma);
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();

        entrada.close();

        somarDoisNumeros(x, y);
        
    }
}
