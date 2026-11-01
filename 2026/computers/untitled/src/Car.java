public class Car extends Vehicle implements Washable{

    private int doorCount;

    public Car(int plate, String color, String model, int horsePower, int doorCount){
        super(plate, color, model, horsePower);
        this.doorCount = doorCount;
    }

    @Override
    public void wash() {
        System.out.println("This car wash took 20 sec");
    }

    public int getDoorCount() {
        return doorCount;
    }

    @Override
    public String describe(){
        return("Car {" + baseInfo() + ", doorCount " + this.doorCount + " }");
    }
}
