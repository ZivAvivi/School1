public class File extends Itemz {

    final private int size;
    public File(String name, int size){
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    protected String print(int depth) {
        return indent(depth) + this.getName() + " (" + size + ")";
    }
}
