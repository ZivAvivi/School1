abstract class Itemz {
    private final String name;
    private Itemz parent = null;

    protected Itemz(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParent(Itemz parent) {
        this.parent = parent;
    }

    public Itemz getParent() {
        return parent;
    }

    public String getPath(){
        if (parent==null)
            return this.name;
        return parent.getPath()+"/"+this.name;
    }

    public abstract int getSize();
    protected abstract String print(int depth);

    protected String indent(int depth) {
        return "\t".repeat(depth);
    }

    @Override
    public String toString() {
        return print(0);
    }
}
