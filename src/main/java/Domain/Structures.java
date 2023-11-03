package Domain;

import Trees.AVL;
import Trees.KDTree;

import java.util.Map;

public class Structures {
    AVL<VehicleTrips> vehicleTripsAVL;
    AVL<VehicleTripsDistance> vehicleTripsDistanceAVL;
    AVL<TripSummary> tripSummaryAVL;
    AVL<DayNumTrip> dayNumAvl;
    AVL<Vehicle> vehicleAVL;
    Map<String, KDTree<Integer>> forKd;

    public Structures(AVL<VehicleTrips> vehicleTripsAVL, AVL<VehicleTripsDistance> vehicleTripsDistanceAVL, AVL<TripSummary> tripSummaryAVL,AVL<DayNumTrip> dayNumAvl, Map<String, KDTree<Integer>> forKd, AVL<Vehicle> vehicleAVL) {
        this.vehicleTripsAVL = vehicleTripsAVL;
        this.vehicleTripsDistanceAVL = vehicleTripsDistanceAVL;
        this.tripSummaryAVL = tripSummaryAVL;
        this.dayNumAvl = dayNumAvl;
        this.vehicleAVL = vehicleAVL;
        this.forKd = forKd;
    }

    public AVL<DayNumTrip> getDayNumAvl() {
        return dayNumAvl;
    }

    public void setDayNumAvl(AVL<DayNumTrip> dayNumAvl) {
        this.dayNumAvl = dayNumAvl;
    }

    public AVL<Vehicle> getVehicleAVL() {
        return vehicleAVL;
    }

    public void setVehicleAVL(AVL<Vehicle> vehicleAVL) {
        this.vehicleAVL = vehicleAVL;
        this.forKd = forKd;
    }

    public Map<String, KDTree<Integer>> getForKd() {
        return forKd;
    }

    public void setForKd(Map<String, KDTree<Integer>> forKd) {
        this.forKd = forKd;
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
