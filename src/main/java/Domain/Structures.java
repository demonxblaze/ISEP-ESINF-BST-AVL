package Domain;

import Trees.AVL;

public class Structures {
    AVL<VehicleTrips> vehicleTripsAVL;

    public Structures(AVL<VehicleTrips> vehicleTripsAVL) {
        this.vehicleTripsAVL = vehicleTripsAVL;
    }

    public AVL<VehicleTrips> getVehicleTripsAVL() {
        return vehicleTripsAVL;
    }

    public void setVehicleTripsAVL(AVL<VehicleTrips> vehicleTripsAVL) {
        this.vehicleTripsAVL = vehicleTripsAVL;
    }
}
