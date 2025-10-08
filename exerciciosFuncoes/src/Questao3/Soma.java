package Questao3;

public class Soma {
    
    //Forma 1: Fazer um método que não retorne nada(void), para realizar a soma e depois mostrar o resultado na tela
    public void somarDoisNumeros(int a, int b) {
        int soma = a + b;
        System.out.println("A soma dos dois é: " + soma);
    }

    //Forma 2: Fazer um método que retorne a soma dos dois numeros
    public int somaDois(int a, int b) {
        int soma = a + b;
        return soma;
    }
}
