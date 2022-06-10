public class Santa {
    private static volatile Santa instance;
    Command command;
    private Santa(){}

    public static Santa getInstance(){
        Santa cache = instance;
        if(cache == null){
            synchronized (MagicBoard.class){
                cache = instance;
                if(cache == null){
                    instance = cache = new Santa();
                }
            }
        }

        return cache;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
