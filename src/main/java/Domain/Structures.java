package Domain;

import Trees.AVL;

public class Structures {
    AVL<VehicleTrips> vehicleTripsAVL;
    AVL<VehicleTripsDistance> vehicleTripsDistanceAVL;
    AVL<TripSummary> tripSummaryAVL;
    public Structures(AVL<VehicleTrips> vehicleTripsAVL, AVL<VehicleTripsDistance> vehicleTripsDistanceAVL, AVL<TripSummary> tripSummaryAVL) {
        this.vehicleTripsAVL = vehicleTripsAVL;
        this.vehicleTripsDistanceAVL = vehicleTripsDistanceAVL;
        this.tripSummaryAVL = tripSummaryAVL;
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

    public AVL<TripSummary> getTripSummaryAVL() {
        return tripSummaryAVL;
    }

    public void setTripSummaryAVL(AVL<TripSummary> tripSummaryAVL) {
        this.tripSummaryAVL = tripSummaryAVL;
    }
}
