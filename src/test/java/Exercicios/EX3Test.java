package Exercicios;

import Domain.EX4.Trip;
import Domain.EX4.TripSummary;
import Domain.EX4.Vehicle;
import Domain.EX4.VehicleTrips;
import Domain.TripApagar;
import Exercicios.EX3;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EX3Test {

    EX1 ex1;
    AVL<VehicleTrips> example1;
    AVL<VehicleTrips> example2;
    AVL<VehicleTrips> exampleProf;
    EX3 ex3;

    @BeforeEach
    void setUp() {
        EX1 ex1 = new EX1();

        List<Vehicle> vehicles1 = FileScanner.getVehicleList("project-data/VEData/VED_Static_Data_ICE&HEV.csv");
        List<Vehicle> vehicles2 = FileScanner.getVehicleList("project-data/VEData/VED_Static_Data_PHEV&EV.csv");
        List<Vehicle> vehicles = new java.util.ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);

        List<Trip> trips = FileScanner.getTripsList("project-data/VEData/VED_180404_week.csv");

        AVL<VehicleTrips> example1 = ex1.getAVL(vehicles, trips);
        AVL<VehicleTrips> example2 = ex1.getAVL(vehicles, trips);
        AVL<VehicleTrips> exampleProf = ex1.getAVL(vehicles, trips);
        EX3 ex3 = new EX3();
    }

    @org.junit.jupiter.api.Test
        //Encontrar a viagem com o tripID 2213
    void getTrips() {


        Set<Integer> tripsToFind = new HashSet<>();
        tripsToFind.add(2213);


        AVL<TripSummary> result = ex3.getTrips(tripsToFind, 0, 0, example1);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);

    }

    //Encontrar as viagens com os tripID 527, 300 e 1000
    @org.junit.jupiter.api.Test
    void getTrips2() {
        Set<Integer> tripsToFind = new HashSet<>();
        tripsToFind.add(527);
        tripsToFind.add(300);
        tripsToFind.add(1000);

        AVL<TripSummary> result = ex3.getTrips(tripsToFind, 0, 0, example2);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(527, 42.28457278, -83.74321417, 42.29456361, -83.70448778));
        expected.insert(new TripSummary(300, 42.27257083, -83.79917139, 43.27259583, -84.79918222));
        expected.insert(new TripSummary(1000, 42.27244472, -83.79918278, 42.27257083, -83.79917139));

        assertEquals(expected, result);
    }

    //Encontrar as viagens com o tripID entre 300 e 600
    @org.junit.jupiter.api.Test
    void getTrips3() {


        AVL<TripSummary> result = ex3.getTrips(null, 300, 600, example2);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(527, 42.27173778, -83.79912111, 42.27244472, -83.79918278));
        expected.insert(new TripSummary(300, 42.27257083, -83.79917139, 43.27259583, -84.79918222));


        assertEquals(expected, result);
    }

    //Encontrar a viagens com o tripID 301(que não existe)
    @org.junit.jupiter.api.Test
    void getTrips4() {


        Set<Integer> tripsToFind = new HashSet<>();
        tripsToFind.add(301);


        AVL<TripSummary> result = ex3.getTrips(tripsToFind, 0, 0, example2);

        AVL<TripSummary> expected = new AVL<>();


        assertEquals(expected, result);
    }

    //Encontrar a viagens com o tripID entre 350 e 400(que não existe)
    @org.junit.jupiter.api.Test
    void getTrips5() {


        AVL<TripSummary> result = ex3.getTrips(null, 350, 400, example2);

        AVL<TripSummary> expected = new AVL<>();


        assertEquals(expected, result);
    }

    //Encontrar a viagens com o tripID entre 200 e 1100
    @org.junit.jupiter.api.Test
    void getTrips6() {


        AVL<TripSummary> result = ex3.getTrips(null, 200, 1100, example2);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(527, 42.28457278, -83.74321417, 42.29456361, -83.70448778));
        expected.insert(new TripSummary(300, 42.27257083, -83.79917139, 43.27259583, -84.79918222));
        expected.insert(new TripSummary(1000, 42.27244472, -83.79918278, 42.27257083, -83.79917139));


        assertEquals(expected, result);
    }

    // Encontrar a viagens com o tripID entre 2213 e 2213 do ficheiro dado pelo professor
    @org.junit.jupiter.api.Test
    void getTrips7() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/VEData/VED_180404_week.csv");


        AVL<TripSummary> result = ex3.getTrips(null, 2213, 2213, exampleProf);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);
    }

    // Encontrar a viagens com o tripID igual a 2213 no ficheiro dado pelo professor
    @org.junit.jupiter.api.Test
    void getTrips8() {

        Set<Integer> tripsToFind = new HashSet<>();
        tripsToFind.add(2213);


        AVL<TripSummary> result = ex3.getTrips(tripsToFind, 0, 0, exampleProf);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);
    }

}