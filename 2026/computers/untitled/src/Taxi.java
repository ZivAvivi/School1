public class Taxi {
    private String taxiId;
    private String driverName;
    private int numPass;
    private boolean isAvailable;

    public Taxi(String id, String name, int numPass){
        this.taxiId = id;
        this.driverName = name;
        this.numPass = numPass;
        isAvailable = true;
    }
    public boolean isAvailable(){return isAvailable;}

    public void taxiBusy(){this.isAvailable = false;}

    public int getNumPass() {
        return numPass;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getTaxiId() {
        return taxiId;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setTaxiId(String taxiId) {
        this.taxiId = taxiId;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

}
