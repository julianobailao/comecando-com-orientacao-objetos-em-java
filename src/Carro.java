public abstract class Carro {
    private String marca = null;
    private String modelo = null;
    private Integer anoFabricacao = null;
    protected Integer velocidade = 0;

    public Carro(String marca, String modelo, Integer anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void parar() {
        this.velocidade = 0;
    }

    public Integer obterVelocidadeAtual() {
        return this.velocidade;
    }

    public abstract void acelerar();
    public abstract void frear();
}
