package Domain;

import Trees.AVL;

public class Structures {
    AVL<VehicleTrips> vehicleTripsAVL;
    AVL<VehicleTripsDistance> vehicleTripsDistanceAVL;

    public Structures(AVL<VehicleTrips> vehicleTripsAVL, AVL<VehicleTripsDistance> vehicleTripsDistanceAVL) {
        this.vehicleTripsAVL = vehicleTripsAVL;
        this.vehicleTripsDistanceAVL = vehicleTripsDistanceAVL;
    }

    public AVL<VehicleTrips> getVehicleTripsAVL() {
        return vehicleTripsAVL;
    }

    public void setVehicleTripsAVL(AVL<VehicleTrips> vehicleTripsAVL) {
        this.vehicleTripsAVL = vehicleTripsAVL;
    }

    public AVL<VehicleTripsDistance> getVehicleTripsDistanceAVL() {
        return vehicleTripsDistanceAVL;
    }

    public void setVehicleTripsDistanceAVL(AVL<VehicleTripsDistance> vehicleTripsDistanceAVL) {
        this.vehicleTripsDistanceAVL = vehicleTripsDistanceAVL;
    }
}
