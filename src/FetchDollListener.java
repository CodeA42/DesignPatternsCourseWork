public class FetchDollListener implements EventListener{
    private final Dwarf dwarf;

    public FetchDollListener(Dwarf dwarf) {
        this.dwarf = dwarf;
    }

    public void update() {
        dwarf.makeToy();
    }
}
