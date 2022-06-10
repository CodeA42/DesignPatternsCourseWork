public class DollFactory extends Factory{
    @Override
    public Toy createToy() {
        return new Doll();
    }
}
