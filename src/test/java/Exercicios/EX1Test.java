package Exercicios;

import Domain.*;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EX1Test {


    @Test
    void searchByVehID() {

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        Vehicle expected = new Vehicle(1);
        Vehicle result = ex1.searchByVehID(structures.getVehicleTripsAVL(), 1);


        assertEquals(expected,result);
    }

    @Test
    void searchByVehIDNotFound(){

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        //Não existe nenhum veículo com o ID 999

        assertNull(ex1.searchByVehID(structures.getVehicleTripsAVL(), 999));
    }

    @Test
    void searchByTripID() {

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        PairData result = ex1.searchByTripID(structures.getVehicleTripsAVL(), new Trip(1,1,1,new AVL<TripData>()));
        PairData expected = new PairData<>(new Trip(1), new Vehicle(1));

        assertEquals(expected,result);
    }

    @Test
    void searchByTripIDNotFound(){

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        //Não existe nenhuma viagem com o ID 999

        assertNull(ex1.searchByTripID(structures.getVehicleTripsAVL(), new Trip(999)));
    }
}