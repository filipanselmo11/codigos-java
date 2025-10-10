package Questao11;

public class NumeroPar {
    //No caso dessa questão ele diz que a gente deve "dizer" se ele é par ou impar
    //Nesse caso, fica a critério do desenvolvedor como ele vai "dizer"
    //Se vai retornar algo(int, booleno, string) ou se vai imprimir na tela(void)
    //Nesse caso eu vou fazer das duas formas, um método que retorna uma String e outro que imprime na tela

    public String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "O número " + numero + " é par.";//String, por que eu to retornando um texto
        } else {
            return "O número " + numero + " é ímpar.";
        }
    }

    public void mostrarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");//Void, por que to imprimindo na tela com o
                                                                 //System.out.println()
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
