import java.util.*;

public class DealerShip {
   private Map<Integer, Vehicle> vehicles;

    public DealerShip(){
        this.vehicles = new HashMap<>();
    }

    public Vehicle findByPlate(int plate){
        return vehicles.get(plate);
    }

    public List<Vehicle> getByMinHorsePower(int min){
        List<Vehicle> list = new ArrayList<>();
        for (Vehicle V : vehicles.values()){
            if (V.getHorsePower() >= min)
                list.add(V);
        }
        return list;
    }

    public List<Vehicle> sortedByHorsePower(){
        Comparator<Vehicle> comparator = new SortByHorsePower();
        List<Vehicle> vList = new ArrayList<>(vehicles.values());
        Collections.sort(vList, comparator);
        return vList;
    }


    void addVehicle(Vehicle v) throws DuplicatePlateException {
        if (vehicles.containsKey(v.getPlate())) {
            throw new DuplicatePlateException("Plate exists");
        } else {
            vehicles.put(v.getPlate(), v);
        }
    }
}

class DuplicatePlateException extends RuntimeException {
    DuplicatePlateException(String message) {
        super(message);
    }
}

class SortByHorsePower implements Comparator<Vehicle>{
    @Override
    public int compare(Vehicle v1, Vehicle v2){
        if (v1.getHorsePower() > v2.getHorsePower()) return -1;
        if (v1.getHorsePower() < v2.getHorsePower()) return 1;
        return 0;
    }
}