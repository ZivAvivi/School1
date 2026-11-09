
import java.util.HashMap;
import java.util.Map;


public class Folder extends Itemz{

    private Map<String, Itemz> list;

    public Folder(String name){
        super(name);
        list = new HashMap<>();
    }

    @Override
    public int getSize(){
        int sum = 0;
        for(Itemz item : list.values()){
            sum += item.getSize();
        }
        return sum;
    }

    public Itemz removeByName(String name){
        if (list.containsKey(name))
            list.get(name).setParent(null);
        return list.remove(name); // if nothing is removed it will return null that way to use can check if it was even really there
    }

    public void addToFolder(Itemz item) {
        if (item != null && item != this) {
            if (list.containsKey(item.getName()) || item.getParent() != null) {
                throw new DuplicateItemException("An item with this name already exists in this directory.");
            }
            item.setParent(this);
            list.put(item.getName(), item);
        }
    }


    @Override
    protected String print(int depth) {
        String str = indent(depth) + getName();
        for (Itemz item : list.values()) {
            str += "\n" + item.print(depth + 1);
        }
        return str;
    }

}

class DuplicateItemException extends RuntimeException{
    DuplicateItemException(String msg){
        super(msg);
    }
}
