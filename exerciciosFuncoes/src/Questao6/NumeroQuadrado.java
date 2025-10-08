package Questao6;

public class NumeroQuadrado {
    
    public void mostrarQuadrado(int x) {
        int quadrado = x*x; //Forma 1
        System.out.println("O quadrado do numero " + x + " é " + quadrado);
        //int quadrado = Math.pow(x, 2).Forma 2, usando a classe Math, passando o método pow, que calcula a potencia de um numero
    }

    public int retornarQuadrado(int numero) {
        int quadrado = numero * numero;
        return quadrado;
    }
}
