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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public AVL<PairData<Double, Set<Trip>>> getTrips() {
        return trips;
    }

    public void setTrips(AVL<PairData<Double, Set<Trip>>> trips) {
        this.trips = trips;
    }

    @Override
    public int compareTo(VehicleTripsDistance o) {
        return this.vehicle.compareTo(o.vehicle);
    }
}
