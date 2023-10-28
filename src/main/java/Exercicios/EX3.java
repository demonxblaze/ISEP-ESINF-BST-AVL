package Exercicios;

import java.util.*;

import Domain.EX4.Trip;
import Domain.EX4.TripSummary;
import Domain.EX4.VehicleTrips;
import Domain.TripApagar;
import Trees.AVL;

public class EX3 {


    public AVL<TripSummary> getTrips(Set<Integer> tripIDs, int min, int max, AVL<VehicleTrips> vehicleTripsAVL) {

        if (tripIDs!=null) {
            AVL<TripSummary> tripsFounded = new AVL<>();
            for (Integer i : tripIDs) {
                Trip temp = getTheTrip(vehicleTripsAVL, new Trip(-1, i, new AVL<>()));
                if (temp != null) {
                    tripsFounded.insert(new TripSummary(temp.getTripID(), temp.getTripData().findMin().getLatitude(), temp.getTripData().findMin().getLongitude(),
                            temp.getTripData().findMax().getLatitude(), temp.getTripData().findMax().getLongitude()));
                }
            }
            if (tripsFounded.isEmpty()) {
                return null;
            } else {
                return tripsFounded;
            }
        }else{

            AVL<Trip> allTrips = new AVL<>();
            AVL<TripSummary> tripsFounded = new AVL<>();
            getAllTrips(vehicleTripsAVL, allTrips );
            Trip minTrip= new Trip(-1,min,new AVL<>());
            Trip maxTrip= new Trip(-1,max,new AVL<>());
            for (Trip t : allTrips.findBetween(minTrip, maxTrip).inOrder()) {
                tripsFounded.insert(new TripSummary(t.getTripID(), t.getTripData().findMin().getLatitude(), t.getTripData().findMin().getLongitude(),
                        t.getTripData().findMax().getLatitude(),t.getTripData().findMax().getLongitude()));
            }
            return tripsFounded;
        }
    }

    private void getAllTrips(AVL<VehicleTrips> vehicleTripsAVL, AVL<Trip> allTrips) {
        vehicleTripsAVL.inOrder();
        for (VehicleTrips vt : vehicleTripsAVL.inOrder()) {
            for (Trip t: vt.getTrips().inOrder()) {
                allTrips.insert(t);
            }
        }
    }
    private Trip getTheTrip(AVL<VehicleTrips> vehicleTripsAVL, Trip T) {
        Trip trip = null;
        for (VehicleTrips vt : vehicleTripsAVL.inOrder()) {
            trip = vt.getTrips().findElement(T);
            if (trip != null) {
                return trip;
            }
        }
        return null ;
    }






}
