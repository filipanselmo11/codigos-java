package Questao9;

import java.util.Scanner;

public class Questao99 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MaiorMenorTres maior = new MaiorMenorTres();

        System.out.println("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.println("Informe o valor de Y: ");
        int y = entrada.nextInt();
        
        System.out.println("Informe o valor de Z: ");
        int z = entrada.nextInt();

        entrada.close();
 
        System.out.println(maior.maiorTres(x, y, z));
        
    }
}
