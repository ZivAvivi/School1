import java.util.ArrayList;
import java.util.List;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(12, "red", "Skyline r34", 100, 4);
        Car car2 = new Car(48, "yellow", "nissan", 60, 4);
        Truck truck = new Truck(21, "orange", "Ford", 50, 400);
        Motorcycle motorcycle = new Motorcycle(43, "blue", "BMW", 80);

        List<Vehicle> list = new ArrayList<>();
        list.add(car);
        list.add(car2);
        list.add(truck);
        list.add(motorcycle);

        Garage<Car> carGarage = new Garage<>(2);
        Garage<Truck> truckGarage = new Garage<>(1);

        carGarage.park(car);
        truckGarage.park(truck);
        System.out.println(truckGarage.getAll());

        DealerShip dealerShip = new DealerShip();
        dealerShip.addVehicle(car);
        dealerShip.addVehicle(car2);
        dealerShip.addVehicle(motorcycle);
        System.out.println(dealerShip.findByPlate(43));
        System.out.println(dealerShip.sortedByHorsePower());

        System.out.println((char)('!'+1));


//        for(Vehicle vehicle : list){
//            System.out.println(vehicle.describe());
//            if (vehicle instanceof Washable){
//                ((Washable) vehicle).wash();
//            }
//        }


    }
}
