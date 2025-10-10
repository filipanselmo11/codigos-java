package Questao16;

public class Main {
    
    public static void mostrarTabuada(int numero) {
        int resultado = 1;
        for(int i = 1; i <= numero; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {

        int numero = 5;
        mostrarTabuada(numero);
    }
}
