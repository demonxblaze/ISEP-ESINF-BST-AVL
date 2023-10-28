package Exercicios;

import Domain.EX4.PairData;
import Domain.EX4.Trip;
import Domain.EX4.VehicleTrips;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EX4Test {

    @Test
    void getTripBiggestDistance() {
        List<String[]> vehicles1 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_PHEV&EV.csv");
        List<String[]> vehicles2 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_ICE&HEV.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/VEData/VED_180404_week.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTrips> vehicleTrips = ex1.getAVL(vehicles1, trips);

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Trip>> result = ex4.getTripBiggestDistance(List.of(10, 11), vehicleTrips);
        System.out.println(result.toString());

    }
}