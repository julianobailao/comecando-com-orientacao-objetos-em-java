public class CarroEconomico extends Carro {
    public CarroEconomico(String marca, String modelo, Integer anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        this.velocidade += 2;
    }

    @Override
    public void frear() {
        this.velocidade -= 1;
    }
}
