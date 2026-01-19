public class GarbageCan {
    int num;
    double capacity;
    double quantity;
    String neighborhood;
    public GarbageCan(int num, double capacity, double quantity, String neighborhood) {
        this.num = num;
        this.capacity = capacity;
        this.quantity = quantity;
        this.neighborhood = neighborhood;
    }

    public int getNum() {
        return num;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getNeighborhood() {
        return neighborhood;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void empty() {
        this.quantity = 0;
    }

    @Override
    public String toString() {
        return "num=" + num + ", capacity=" + capacity + ", quantity=" + quantity + ", neighborhood='" + neighborhood;
    }
}
