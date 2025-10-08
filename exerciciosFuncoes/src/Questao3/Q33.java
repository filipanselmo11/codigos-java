package Questao3;

public class Q33 {
    
    public static void main(String[] args) {

        Soma soma = new Soma();

        int numero1 = 78;
        int numero2 = 9;

        //Chamando o método sem retorno (void)
        soma.somarDoisNumeros(numero1, numero2);

        //Chamando o método com retorno(int)
        System.out.println(soma.somaDois(numero1, numero2));
    }
}
