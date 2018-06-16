public class PhantomLancer implements Boneco {
    @Override
    public void andar() {
        System.out.println("PL andando");
    }

    @Override
    public void atacar() {
        System.out.println("PL atacando");
    }

    @Override
    public void defender() {
        System.out.println("PL defendendo");
    }

    @Override
    public void avuar() {
        System.out.println("PL vuando");
    }
}
