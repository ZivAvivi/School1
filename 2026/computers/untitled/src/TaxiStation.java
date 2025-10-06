public class TaxiStation {
    private String stationName;
    private Taxi[] arr;
    int current;

    public TaxiStation(String name){
        this.stationName = name;
        this.arr = new Taxi[80];
        this.current = 0;
    }

    public void addTaxi(Taxi car){
        if(current<80)
        {
            this.arr[current] = car;
            current+=1;
        }
    }

    public String getTaxi(int passanger){
        for (int i = 0; i < this.current; i++) {
            if (arr[i].getNumPass() == passanger && arr[i].isAvailable())
            {
                arr[i].taxiBusy();
                return arr[i].getTaxiId();
            }
        }
        return "couldn't find u a taxi";
    }

}
