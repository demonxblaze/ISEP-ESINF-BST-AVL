package Domain;

import Trees.AVL;

import java.util.Objects;

/**
 * Represents a vehicle with its unique ID, type, class, engine configuration, transmission, drive wheels, and weight.
 */
public class VehicleTrips implements Comparable<VehicleTrips> {

     // Attributes
    Vehicle vehicle;
    AVL<Trip> trips;

    /**
     * Constructs a new Vehicle object with the given parameters.
     * @param vehicle the vehicle
     */
    public VehicleTrips(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.trips = new AVL<>();
    }

    /**
     * Returns the vehicle.
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Gets the AVL of trips.
     * @return the AVL of trips
     */
    public AVL<Trip> getTrips() {
        return trips;
    }

    /**
     * Adds a trip to the AVL of trips.
     * @param trip the trip to add
     */
    public void addTrip(Trip trip) {
        trips.insert(trip);
    }

    /**
     * Removes a trip from the AVL of trips.
     * @param trip the trip to remove
     */
    public void removeTrip(Trip trip) {
        trips.remove(trip);
    }

    /**
     * Returns the number of trips.
     * @return the number of trips
     */
    public int getNumTrips() {
        return trips.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleTrips that = (VehicleTrips) o;
        return Objects.equals(vehicle, that.vehicle);
    }

    @Override
    public int compareTo(VehicleTrips o) {
        return this.vehicle.compareTo(o.getVehicle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle, trips);
    }

    @Override
    public String toString() {
        return "VehicleTrips{" +
                "vehicle=" + vehicle +
                ", trips=" + trips +
                '}';
    }
}
