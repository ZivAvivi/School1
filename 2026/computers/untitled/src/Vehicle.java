abstract class Vehicle {
    private final int plate;
    private String color;
    private String model;
    private int horsePower;

    protected Vehicle(int plate, String color, String model, int horsePower){
        this.color = color;
        this.horsePower = horsePower;
        this.model = model;
        this.plate = plate;
    }

    protected String baseInfo() {
        return "id " + plate + ", Color " + color
                + ", model " + model + ", horsePower " + horsePower;
    }

    public abstract String describe();

    public int getHorsePower() {
        return horsePower;
    }
    public int getPlate() {
        return plate;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

}
