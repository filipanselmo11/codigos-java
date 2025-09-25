import java.util.Scanner;

public class Facil2 {
    public static void main(String[] args) {
        //Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = entrada.nextInt();

        entrada.close();

        //FORMA 1
        if(valor > 0) {
            System.out.println("O valor é positivo");
        } else if(valor < 0) {
            System.out.println("O valor é negativo");
        }

        //FORMA 2
        // if (valor > 0) { //Se esse primeiro if acontecer, ou seja, se ele for verdade ele será executado
            // System.out.println("O valor é positivo");
        // } else {//Se não ele executa esse else aqui, ou seja aqui eu nao precisei verificar para valor < 0
                // Por que se o valor > 0 for falso, o JAVA entende que esse else tera que ser executado
            // System.out.println("O valor é negativo");
        // }
    }
}
