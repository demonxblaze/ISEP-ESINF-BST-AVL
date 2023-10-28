package Exercicios;

import Domain.PairData;
import Domain.Trip;
import Domain.VehicleTrips;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.List;

class EX4Test {
    @Test
    void getTripBiggestDistance() {
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTrips> vehicleTrips = ex1.getAVL(vehicles, trips);

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Trip>> result = ex4.getTripBiggestDistance(List.of(1, 2), vehicleTrips);
        System.out.println(result.toString());

    }
}