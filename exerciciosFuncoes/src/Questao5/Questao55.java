package Questao5;

public class Questao55 {
    
    public static void main(String[] args) {
        MaiorMenor mm = new MaiorMenor();//instancia a classe MaiorMenor, parecido com a instancia da classe Scanner, que usamos para ler dados do usuario
        mm.imprimirMaiorMenor(10, 20);
        int maior = mm.retornarMaior(10, 20);
        System.out.println("O maior numero é: " + maior);
    }
}
