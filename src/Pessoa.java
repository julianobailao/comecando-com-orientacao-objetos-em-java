public class Pessoa {
    // propriedades
    private String nome = null;
    private Integer idade = null;

    // construtor
    Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // metodo
    public String obeterInformacoes() {
        return "Nome: " + this.nome + ", Idade:" + this.idade;
    }

    // metodo
    public void fazerAniversario() {
        this.idade++;
        // mesma coisa que: this.idade = this.idade + 1;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public static String teste() {
        return "Método estático brow";
    }

}
