import java.util.ArrayList;
import java.util.List;

public class MagicBoard {
    private static volatile MagicBoard instance;
    private final List<EventListener> listeners;
    private MagicBoard(){
        listeners = new ArrayList<>();
    }

    public static MagicBoard getInstance(){
        MagicBoard cache = instance;
        if(cache == null){
            synchronized (MagicBoard.class){
                cache = instance;
                if(cache == null){
                    instance = cache = new MagicBoard();
                }
            }
        }
        return cache;
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void emit(){
        listeners.forEach(EventListener::update);
    }
}
