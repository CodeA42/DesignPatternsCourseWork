public class Main {
    public static void main(String[] args) {
        final Santa santa = Santa.getInstance();
        final MagicBoard magicBoard = MagicBoard.getInstance();
        final SantaSlate santaSlate = SantaSlate.getInstance();
        final BikeFactory bikeFactory = new BikeFactory();

        final Dwarf dwarf = new Dwarf(bikeFactory, santaSlate);
        final FetchBikeListener fetchBikeListener = new FetchBikeListener(dwarf);
        magicBoard.subscribe(fetchBikeListener);
        final FetchBikeCommand fetchBikeCommand = new FetchBikeCommand(magicBoard);
        santa.setCommand(fetchBikeCommand);
        santa.executeCommand();
        santaSlate.ListToys();
    }
}