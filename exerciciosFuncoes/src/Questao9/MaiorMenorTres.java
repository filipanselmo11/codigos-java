package Questao9;

public class MaiorMenorTres {
    
    public int maiorTres(int a, int b, int c) {
        int maior = 0;
        if(a > b && a > c) {
            maior = a;
        } else if(b > a && b > c) {
            maior = b;
        } else {
            maior = c;
        }

        return maior;
    }
}
