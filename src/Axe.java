public class Axe implements Boneco{
    @Override
    public void andar() {
        System.out.println("Axe andando");
    }

    @Override
    public void atacar() {
        System.out.println("Axe atacando");
    }

    @Override
    public void defender() {
        System.out.println("Axe defendendo");
    }

    @Override
    public void avuar() {
        System.out.println("Axe avuando");
    }
}
