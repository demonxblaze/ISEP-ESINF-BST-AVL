package Exercicios;

import Domain.PairData;
import Domain.Trip;
import Domain.Vehicle;
import Domain.VehicleTrips;
import Trees.AVL;

import java.util.List;

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
