package Questao4;

public class NumeroPositivo {
    
    public void imprimirNumeroPositivo(int x) {// Aqui a função é do tipo void, por que eu só quero imprimir na tela se o numero é positivo ou negativo
        if(x > 0) {
            System.out.println("O numero " + x + " é positivo");
        } else  {
            System.out.println("O numero " + x + " é negativo");
        }
    }

    public boolean verificarNumeroPositivo(int x)  {
        if(x > 0) {
            return true; // True(Verdadeiro), quando o numero x for maior do que 0, ou seja é um numero positivo
        } else {
            return false;
        }
    }

    public String retornarNumeroPositivo(int x) { // Aqui a função é do tipo String, por que eu quero retornar uma frase
        if(x > 0) {
            return "O numero " + x + " é positivo";
        } else {
            return "O numero " + x + " é negativo";
        }
    }
}
