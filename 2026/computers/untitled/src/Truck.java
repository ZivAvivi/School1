public class Truck extends Vehicle implements Washable{

    private int maxWeight;

    public Truck(int plate, String color, String model, int horsePower, int maxWeight){
        super(plate, color, model, horsePower);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public void wash() {
        System.out.println("this Truck wash took 50 sec");
    }

    @Override
    public String describe() {
        return ("Truck {" + baseInfo() + ", maxWeight " + this.maxWeight + " }");
    }
}
