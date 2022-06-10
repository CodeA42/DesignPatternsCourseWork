import java.util.ArrayList;
import java.util.List;

public class SantaSlate {
    private static volatile SantaSlate instance;
    private final List<Toy> toyList;

    private SantaSlate(){
        this.toyList = new ArrayList<>();
    }

    public static SantaSlate getInstance(){
        SantaSlate cache = instance;
        if(cache == null){
            synchronized (MagicBoard.class){
                cache = instance;
                if(cache == null){
                    instance = cache = new SantaSlate();
                }
            }
        }
        return cache;
    }

    public void addToy(Toy toy){
        toyList.add(toy);
    }

    public void ListToys(){
        toyList.forEach(toy -> System.out.println(toy.getClass().getName()));
    }
}
