public class Pessoa {

    public String nome;
    public int idade;
    public String endereco;


    // public Pessoa(String nome, int idade, String endereco) {
    //     this.nome = nome;
    //     this.idade = idade;
    //     this.endereco = endereco;
    // }
    //Construtor com parametros

    public Pessoa() {}//Construtor Sem parametros

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }

    public int calcularAnoNascimento(int anoAtual) {
        return anoAtual - idade;
    }

    public String seApresentar() {
        return "Olá meu nome é " + this.nome + " tenho " + this.idade + " anos de idade. É um prazer";
    }
}
