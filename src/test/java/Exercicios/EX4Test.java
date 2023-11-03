package Exercicios;

import Domain.PairData;
import Domain.Trip;
import Domain.VehicleTrips;
import Domain.VehicleTripsDistance;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EX4Test {
    /**
     * Test if the method returns an empty AVL when the input is empty
     */
    @Test
    void testEmptyInput() {
        // Arrange
        List<Integer> vehIDs = Collections.emptyList();
        AVL<VehicleTripsDistance> vehicleTrips = new AVL<>();

        // Act
        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Set<Trip>>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertTrue(result.isEmpty());

    }

    /**
     * Test if the method returns an empty AVL when the vehicle IDs do not exist
     */
    @Test
    void testNonexistentVehicles() {
        // Arrange
        List<Integer> vehIDs = List.of(10, 20, 30); // Vehicle IDs that do not exist
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");
        EX1 ex1 = new EX1();
        AVL<VehicleTripsDistance> vehicleTrips = ex1.getStructures(vehicles, trips).getVehicleTripsDistanceAVL();

        // Act
        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Set<Trip>>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        for (Integer vehID : vehIDs) {
            assertNull(result.findElement(new PairData<>(vehID, null)));
        }
    }

    /**
     * Test if the method returns the correct AVL when the vehicle IDs exist, data values from file 1
     */
    @Test
    void testBiggestDistance_week_test1() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTripsDistance> vehicleTrips = ex1.getStructures(vehicles, trips).getVehicleTripsDistanceAVL();

        List<Integer> vehIDs = List.of(1,2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Set<Trip>>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertTrue(result.findElement(new PairData<>(1, null)).getValue().contains(new Trip(1)));
        assertTrue(result.findElement(new PairData<>(2, null)).getValue().contains(new Trip(5)));
        assertTrue(result.findElement(new PairData<>(3, null)).getValue().contains(new Trip(9)));
        assertTrue(result.findElement(new PairData<>(4, null)).getValue().contains(new Trip(12)));
        assertTrue(result.findElement(new PairData<>(5, null)).getValue().contains(new Trip(14)));
        assertTrue(result.findElement(new PairData<>(5, null)).getValue().contains(new Trip(16)));

    }

    /**
     * Test if the method returns the correct AVL when the vehicle IDs exist, data values from file 2
     */
    @Test
    void testBiggestDistance_week_test2() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_2.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_2.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTripsDistance> vehicleTrips = ex1.getStructures(vehicles, trips).getVehicleTripsDistanceAVL();

        List<Integer> vehIDs = List.of(1,2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Set<Trip>>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);


        // Assert
        assertTrue(result.findElement(new PairData<>(1, null)).getValue().contains(new Trip(2)));
        assertTrue(result.findElement(new PairData<>(2, null)).getValue().contains(new Trip(4)));
        assertTrue(result.findElement(new PairData<>(3, null)).getValue().contains(new Trip(8)));
        assertTrue(result.findElement(new PairData<>(4, null)).getValue().contains(new Trip(11)));
        assertTrue(result.findElement(new PairData<>(5, null)).getValue().contains(new Trip(14)));
    }

    /**
     * Test if the method returns the correct AVL when the vehicle IDs exist, data values from file 3
     */
    @Test
    void testBiggestDistance_week_test3() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_3.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_3.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTripsDistance> vehicleTrips = ex1.getStructures(vehicles, trips).getVehicleTripsDistanceAVL();

        List<Integer> vehIDs = List.of(1, 2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Set<Trip>>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertTrue(result.findElement(new PairData<>(1, null)).getValue().contains(new Trip(1)));
        assertTrue(result.findElement(new PairData<>(2, null)).getValue().contains(new Trip(5)));
        assertTrue(result.findElement(new PairData<>(3, null)).getValue().contains(new Trip(9)));
        assertTrue(result.findElement(new PairData<>(4, null)).getValue().contains(new Trip(10)));
        assertTrue(result.findElement(new PairData<>(5, null)).getValue().contains(new Trip(13)));

    }

    /**
     * Test if the method returns the correct AVL when the vehicle IDs exist, data values from file 4
     */
    @Test
    void testBiggestDistance_week_test4() {
        // Arrange
        List<String[]> vehicles = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_4.csv");
        List<String[]> trips = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_4.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTripsDistance> vehicleTrips = ex1.getStructures(vehicles, trips).getVehicleTripsDistanceAVL();

        List<Integer> vehIDs = List.of(1,2,3,4,5);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Set<Trip>>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertTrue(result.findElement(new PairData<>(1, null)).getValue().contains(new Trip(2)));
        assertTrue(result.findElement(new PairData<>(2, null)).getValue().contains(new Trip(6)));
        assertTrue(result.findElement(new PairData<>(3, null)).getValue().contains(new Trip(7)));
        assertTrue(result.findElement(new PairData<>(4, null)).getValue().contains(new Trip(10)));
        assertTrue(result.findElement(new PairData<>(5, null)).getValue().contains(new Trip(14)));
    }

    /**
     * Test if the method returns the correct AVL when the vehicle IDs exist, tested with the main file, checked 3 random vehicles
     */
    @Test
    void testBiggestDistance_Main_File() {
        // Arrange
        List<String[]> vehicles1 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_ICE&HEV.csv");
        List<String[]> vehicles2 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_PHEV&EV.csv");
        vehicles1.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/VEData/VED_180404_week.csv");

        EX1 ex1 = new EX1();
        AVL<VehicleTripsDistance> vehicleTrips = ex1.getStructures(vehicles1, trips).getVehicleTripsDistanceAVL();

        List<Integer> vehIDs = List.of(10,450,311);

        // Act

        EX4 ex4 = new EX4();
        AVL<PairData<Integer, Set<Trip>>> result = ex4.getTripBiggestDistance(vehIDs, vehicleTrips);

        // Assert
        assertTrue(result.findElement(new PairData<>(10, null)).getValue().contains(new Trip(2220)));
        assertTrue(result.findElement(new PairData<>(450, null)).getValue().contains(new Trip(1387)));
        assertTrue(result.findElement(new PairData<>(311, null)).getValue().contains(new Trip(2407)));
    }
}