package Exercicios;

import Domain.EX4.PairData;
import Domain.EX4.Trip;
import Domain.EX4.Vehicle;
import Domain.EX4.VehicleTrips;
import Domain.TripApagar;
import Trees.AVL;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EX4 {
    public AVL<PairData<Integer, Trip>> getTripBiggestDistance(List<Integer> vehIDs, AVL<VehicleTrips> vehicleTrips) {
        AVL<PairData<Integer, Trip>> result = new AVL<>();

        try {
            for (Integer vehID : vehIDs) {
                Trip trip = vehicleTrips.findElement(new VehicleTrips(new Vehicle(vehID))).getTrips().findMax();
                result.insert(new PairData<>(vehID, trip));
            }
        } catch (NullPointerException e) {
            System.out.println("EX4.getTripBiggestDistance: " + e.getMessage());
            return null;
        }

        return result;
    }
}
