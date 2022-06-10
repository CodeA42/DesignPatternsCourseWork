public class FetchBikeCommand implements Command{
    private final MagicBoard board;
    public FetchBikeCommand(MagicBoard board) {
        this.board = board;
    }
    @Override
    public void execute() {
        board.emit();
    }
}
