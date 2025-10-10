package Questao12;

public class Fatorial {
    
    //A ideia do fatorial é de multiplicar um numero a partir dele até o 1
    //Por exemplo, o fatorial de 5 seria: 5 x 4 x 3 x 2 x 1
    //Aqui no código é feito dessa forma: como o contador i começa de 1 então fica:
    //1 X 2 X 3 X 4 X 5
    //Ai o resultado será 120
    public int retornaFatorial(int numero) {
        int resultado = 1;
        for(int i = 1; i <= numero; i++) {
            System.out.println(i);
            resultado *= i;
        }

        return resultado;
    }
}
