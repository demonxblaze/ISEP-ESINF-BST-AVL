package Exercicios;

import Domain.Structures;
import Domain.Vehicle;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EX1Test {

    @Test
    void searchByVehID1() {

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        Vehicle expected = new Vehicle(1);
        Vehicle result = ex1.searchByVehID(structures.getVehicleTripsAVL(), 1);

        assertEquals(expected,result);
    }

    @Test
    void searchByVehIDNoVehicle(){


        List<String[]> vehicleData = FileScanner.lerCSV("no-data.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        Vehicle expected = null;
        Vehicle result = ex1.searchByVehID(structures.getVehicleTripsAVL(), 2);


    }

    @Test
    void searchByTripID() {
    }
}