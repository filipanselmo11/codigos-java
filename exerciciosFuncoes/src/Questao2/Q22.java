//Forma 2: Criar uma classe chamada "Número" com um método que recebe um número inteiro e retorna o dobro desse número.
package Questao2;

public class Q22 {
    
    //Lembrete: Para rodar esse código, crie uma classe com o método main, ou coloque esse código dentro do main de outra classe.
    //Por que se a classe não tiver o método main, ela não pode ser executada diretamente.
    public static void main(String[] args){
        Numero numeroObj = new Numero();
        int numero = 90; //Exemplo de número
        int dobro = numeroObj.calcularDobro(numero);
        //Dica: Como na classe Numero o método calcularDobro retorna um int, eu posso armazenar esse valor em uma variável do tipo int.
        //E depois exibir esse valor. Usando o System.out.println
        //Se fosse void, eu não poderia fazer isso. Eu ja poderia exibir direto dentro do método calcularDobro.
        System.out.println("O dobro de " + numero + " é: " + dobro);
    }
}
