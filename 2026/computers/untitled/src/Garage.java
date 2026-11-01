import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {

    private List<T> list;
    private final int max;

    public Garage(int max){
        this.max = max;
        this.list = new ArrayList<T>();
    }


    public void park(T vehicle){
        if (list.size() >= max) {
            throw new NoRoomException("No more room to add cars");
        } else {
            list.add(vehicle);
        }
    }

    public List<T> getAll(){
        return new ArrayList<>(list);
    }
}

class NoRoomException extends RuntimeException {
    NoRoomException(String message) {
        super(message);
    }
}