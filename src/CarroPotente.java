public class CarroPotente extends Carro {
    public CarroPotente(String marca, String modelo, Integer anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        this.velocidade += (40 * 2) + (1 + 4);
    }

    @Override
    public void frear() {
        this.velocidade -= 80;
    }
}
