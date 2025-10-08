package Questao4;

public class NumeroPositivo {
    
    public void imprimirNumeroPositivo(int x) {// Aqui a função é do tipo void, por que eu só quero imprimir na tela se o numero é positivo ou negativo
        if(x > 0) {
            System.out.println("O numero " + x + " é positivo"); //Se o numero for maior que 0, exibe essa mensagem
        } else  {
            System.out.println("O numero " + x + " é negativo"); //Senão, exibe essa mensagem
        }
    }

    public boolean verificarNumeroPositivo(int x)  {
        if(x > 0) {
            return true; // True(Verdadeiro), quando o numero x for maior do que 0, ou seja é um numero positivo
        } else {
            return false; // False(Falso), quando o numero x for menor do que 0, ou seja é um numero negativo
        }
    }

    public String retornarNumeroPositivo(int x) { // Aqui a função é do tipo String, por que eu quero retornar uma frase
        if(x > 0) {
            return "O numero " + x + " é positivo"; // Se o numero for maior que 0, retorna essa mensagem
        } else {
            return "O numero " + x + " é negativo"; //Senão, retorna essa mensagem
        }
    }
}
