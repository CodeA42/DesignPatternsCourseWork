public class FetchBikeListener implements EventListener{
    private final Dwarf dwarf;

    public FetchBikeListener(Dwarf dwarf){
        this.dwarf = dwarf;
    }

    public void update(){
        dwarf.makeToy();
    }
}
