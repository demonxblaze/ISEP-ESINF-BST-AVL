package Exercicios;

import Domain.TripSummary;
import Domain.VehicleTrips;
import Scanners.FileScanner;
import Trees.AVL;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EX3Test {

  EX1 ex1 = new EX1();

    List<String[]> vehicles1 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_PHEV&EV.csv");
    List<String[]> vehicles2 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_ICE&HEV.csv");

    List<String []>vehicles;

    AVL<TripSummary> example1;
    AVL<TripSummary> example2;
    AVL<TripSummary> exampleProf;
    EX3 ex3 = new EX3();

    @org.junit.jupiter.api.Test
        //Encontrar a viagem com o tripID 2213
    void getTrips() {
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex3-data/ex3-example1.csv");
        example1 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        Set<Integer> tripsToFind = new HashSet<>();

        tripsToFind.add(2294);



        AVL<TripSummary> result = ex3.getTrips(tripsToFind, 0, 0, example1);

        AVL<TripSummary> expected = new AVL<>();

        expected.insert(new TripSummary(2294, 42.29039778, -83.71835944, 42.27822722,-83.74609722));

        assertEquals(expected, result);

    }
    //Encontrar as viagens com os tripID 527, 300 e 1000
    @org.junit.jupiter.api.Test
    void getTrips2() {
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex3-data/ex3-example2.csv");
        example2 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        Set<Integer> tripsToFind = new TreeSet<>();
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
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex3-data/ex3-example2.csv");
        example2 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        AVL<TripSummary> result = ex3.getTrips(null, 300, 600, example2);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(527, 42.27173778, -83.79912111, 42.27244472, -83.79918278));
        expected.insert(new TripSummary(300, 42.27257083, -83.79917139, 43.27259583, -84.79918222));


        assertEquals(expected, result);
    }

    //Encontrar a viagens com o tripID 301(que não existe)
    @org.junit.jupiter.api.Test
    void getTrips4() {
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex3-data/ex3-example2.csv");
        example2 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        Set<Integer> tripsToFind = new HashSet<>();
        tripsToFind.add(301);


        AVL<TripSummary> result = ex3.getTrips(tripsToFind, 0, 0, example2);


        assertNull(result);
    }

    //Encontrar a viagens com o tripID entre 350 e 400(que não existe)
    @org.junit.jupiter.api.Test
    void getTrips5() {
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex3-data/ex3-example2.csv");
        example2 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        AVL<TripSummary> result = ex3.getTrips(null, 350, 400, example2);


        assertNull( result);
    }

    //Encontrar a viagens com o tripID entre 200 e 1100
    @org.junit.jupiter.api.Test
    void getTrips6() {
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex3-data/ex3-example2.csv");
        example2 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

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
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/VEData/VED_180404_week.csv");
        exampleProf = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        AVL<TripSummary> result = ex3.getTrips(null, 2213, 2213, exampleProf);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);
    }

    // Encontrar a viagens com o tripID igual a 2213 no ficheiro dado pelo professor
    @org.junit.jupiter.api.Test
    void getTrips8() {
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/VEData/VED_180404_week.csv");
        exampleProf = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        Set<Integer> tripsToFind = new HashSet<>();
        tripsToFind.add(2213);


        AVL<TripSummary> result = ex3.getTrips(tripsToFind, 0, 0, exampleProf);

        AVL<TripSummary> expected = new AVL<>();
        expected.insert(new TripSummary(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);
    }


}