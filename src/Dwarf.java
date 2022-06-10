public class Dwarf {
    private final Factory factory;
    private final SantaSlate santaSlate;
    public Dwarf(Factory factory, SantaSlate santaSlate){
        this.factory = factory;
        this.santaSlate = santaSlate;
    }

    public void makeToy(){
        this.santaSlate.addToy(this.factory.createToy());
    }
}
