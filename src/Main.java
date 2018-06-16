public class Main {
    public static void main(String[] args) {
        Carro carroEconomico = new CarroEconomico("Chevrolet", "Astra", 2011);
        carroEconomico.acelerar();


        Carro carro = new CarroPotente("Chevrolet", "Astra", 2011);
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.parar();

        System.out.println(carro.obterVelocidadeAtual());




//        Pessoa pessoa = new Pessoa("Bailão", 27);
//        System.out.println(Pessoa.teste());

//        System.out.println(pessoa.obeterInformacoes());
//        pessoa.fazerAniversario();
//        System.out.println(pessoa.obeterInformacoes());

//        System.out.println(pessoa.getNome());
    }
}
