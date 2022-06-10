public class FetchDollCommand implements Command{
    private final MagicBoard board;
    public FetchDollCommand(MagicBoard board) {
        this.board = board;
    }
    @Override
    public void execute() {
        board.notify();
    }
}
