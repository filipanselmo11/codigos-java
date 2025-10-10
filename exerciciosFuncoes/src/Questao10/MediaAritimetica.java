package Questao10;

public class MediaAritimetica {
    
    //Lembrete: Quando na descrição tiver "mostre" voces ja consideram que o método vai ser void
    //Caso tenha retorne, ai voces ja consideram que o método vai retornar algum valor, como int, double, String, etc.

    //Esse método é usado double, por que a média aritmética pode ser um número com casa decimal
    public double calcularMedia(double a, double b) {
        double media = (a + b) / 2.; //Usar 2.0 para garantir que a divisão seja feita em ponto flutuante
        return media;
    }
}
