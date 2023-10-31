package Domain;

import Trees.AVL;

import java.util.Objects;
import java.util.Set;

/**
 * Represents a vehicle with its unique ID, type, class, engine configuration, transmission, drive wheels, and weight.
 */
public class VehicleTripsDistance implements Comparable<VehicleTripsDistance> {

     // Attributes
    Vehicle vehicle;
    AVL<PairData<Double, Set<Trip>>> trips;

    /**
     * Constructs a new Vehicle object with the given parameters.
     * @param vehicle the vehicle
     */
    public VehicleTripsDistance(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.trips = new AVL<>();
    }


    @Override
    public int compareTo(VehicleTripsDistance o) {
        return 0;
    }
}
