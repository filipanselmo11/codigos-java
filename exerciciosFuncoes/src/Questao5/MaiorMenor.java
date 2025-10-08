package Questao5;

public class MaiorMenor {
    
    public void imprimirMaiorMenor(int a, int b) {
        if(a > b) {
            System.out.println("O numero " + a + " é maior que " + b);
        } else if(b > a) {
            System.out.println("O numero " + b + " é maior que " + a);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }

    public int retornarMaior(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
