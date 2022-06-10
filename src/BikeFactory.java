public class BikeFactory extends Factory {
    @Override
    public Toy createToy() {
        return new Bike();
    }
}
