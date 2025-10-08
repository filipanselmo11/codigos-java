package Questao8;

public class Idade {
    
    public boolean deMaior(int idade) {
        boolean eMaior = false;
        if(idade >= 18) {
            eMaior = true;
        } else if(idade < 18) {
            eMaior = false;
        }

        return eMaior;
    }

    public void imprimirMaiorIdade(int idade) {
        if(deMaior(idade)) {
            System.out.println("A pessoa de idade " + idade + "." + "É de maior");
        } else {
            System.out.println("A pessoa de idade " + idade + "." + "É de menor");
        }
    }

    //Lembrete: No Java, eu posso chamar uma função dentro de outra.
    //Nesse codigo acima, eu verifico se a idade que o usuario informar é mais de 18
    //No caso na linha 17, eu passo um if chamando o método deMaior, passando a idade
    //Ele ta verificando se a idade que o usuário informar for 18, ou seja
    //Eu não preciso fazer todas aquelas verificações que estão mais acima
    //Eu posso apenas chamar o método, que ele já faz essa verificação da idade
}
