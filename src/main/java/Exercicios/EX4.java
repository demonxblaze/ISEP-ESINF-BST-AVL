package Exercicios;

import Domain.*;
import Trees.AVL;

import java.util.List;
import java.util.Set;

public class EX4 {
    public AVL<PairData<Integer, Set<Trip>>> getTripBiggestDistance(List<Integer> vehIDs, AVL<VehicleTripsDistance> vehicleTrips) {
        AVL<PairData<Integer, Set<Trip>>> result = new AVL<>();

        for (Integer vehID : vehIDs) {
            try {
                Set<Trip> trip = vehicleTrips.findElement(new VehicleTripsDistance(new Vehicle(vehID))).getTrips().findMax().getValue();

                if (trip != null)
                    result.insert(new PairData<>(vehID, trip));


            } catch (NullPointerException e) {
                System.out.println("EX4.getTripBiggestDistance: " + e.getMessage());
            }

        }

        return result;
    }
}