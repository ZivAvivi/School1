public class Patient {
    private int id;
    private int priority;

    public Patient(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
    public int getId() {
        return id;
    }
    public int getPriority() {
        return priority;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
}
