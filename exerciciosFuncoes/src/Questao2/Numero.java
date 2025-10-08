package Questao2;

public class Numero {
    
    //Forma 1: Fazer um método que recebe um número inteiro como parâmetro e exibe o dobro desse número.
    // public void mostrarDobro(int numero) {
    //     int dobro = numero * 2;
    //     System.out.println("O dobro de " + numero + " é: " + dobro);
    // }

    //Forma 2: Criar uma classe chamada "Número" com um método que recebe um número inteiro e retorna o dobro desse número.
    public int calcularDobro(int numero) {
        int dobro = numero * 2; //Ou criar uma variável que vai receber o resultado do calculo para retornar depois
        return dobro;
        // return numero * 2; // Eu posso retornar assim direto
    }

    //Lembrete: Métodos em JAVA são "void" quando não retornam nada. E tem um tipo de retorno (int, String, boolean, etc) quando retornam algo.
}
