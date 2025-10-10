package Questao16;

public class Tabuada {

    public void mostrarTabuada(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
