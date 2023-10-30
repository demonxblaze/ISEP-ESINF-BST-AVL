package Exercicios;

import Domain.PairData;
import Domain.Trip;
import Domain.VehicleTrips;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EX4Test {
    @Test
    void testBiggestDistance_week_test1() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTrips> vehicleTrips = ex1.getAVL(vehicles, trips);

        List<Integer> vehIDs = List.of(1,2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Trip>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        //assertEquals(1, result.findElement(new PairData<>(1, null)).getValue().getTripID());
        assertEquals(5, result.findElement(new PairData<>(2, null)).getValue().getTripID());
        assertEquals(9, result.findElement(new PairData<>(3, null)).getValue().getTripID());
        assertEquals(12, result.findElement(new PairData<>(4, null)).getValue().getTripID());
        assertEquals(14, result.findElement(new PairData<>(5, null)).getValue().getTripID());

    }
    @Test
    void testBiggestDistance_week_test2() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_2.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_2.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTrips> vehicleTrips = ex1.getAVL(vehicles, trips);

        List<Integer> vehIDs = List.of(1,2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Trip>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertEquals(2, result.findElement(new PairData<>(1, null)).getValue().getTripID());
        assertEquals(4, result.findElement(new PairData<>(2, null)).getValue().getTripID());
        assertEquals(8, result.findElement(new PairData<>(3, null)).getValue().getTripID());
        assertEquals(11, result.findElement(new PairData<>(4, null)).getValue().getTripID());
        assertEquals(14, result.findElement(new PairData<>(5, null)).getValue().getTripID());

    }
    @Test
    void testBiggestDistance_week_test3() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_3.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_3.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTrips> vehicleTrips = ex1.getAVL(vehicles, trips);

        List<Integer> vehIDs = List.of(1, 2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Trip>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertEquals(1, result.findElement(new PairData<>(1, null)).getValue().getTripID());
        assertEquals(5, result.findElement(new PairData<>(2, null)).getValue().getTripID());
        assertEquals(9, result.findElement(new PairData<>(3, null)).getValue().getTripID());
        assertEquals(10, result.findElement(new PairData<>(4, null)).getValue().getTripID());
        assertEquals(13, result.findElement(new PairData<>(5, null)).getValue().getTripID());

    }
    @Test
    void testBiggestDistance_week_test4() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_4.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_4.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTrips> vehicleTrips = ex1.getAVL(vehicles, trips);

        List<Integer> vehIDs = List.of(1,2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Trip>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertEquals(2, result.findElement(new PairData<>(1, null)).getValue().getTripID());
        assertEquals(6, result.findElement(new PairData<>(2, null)).getValue().getTripID());
        assertEquals(7, result.findElement(new PairData<>(3, null)).getValue().getTripID());
        assertEquals(10 ,result.findElement(new PairData<>(4, null)).getValue().getTripID());
        assertEquals(14, result.findElement(new PairData<>(5, null)).getValue().getTripID());

    }
}