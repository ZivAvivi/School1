public class Motorcycle extends Vehicle{

    public Motorcycle(int plate, String color, String model, int horsePower){
        super(plate, color, model, horsePower);
    }

    @Override
    public String describe() {
        return "motorcycle{" + baseInfo() + " }";
    }
}
