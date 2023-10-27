package Exercicios;

import Domain.TripApagar;
import Exercicios.EX3;
import Scanners.FileScanner;
import Trees.AVL;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EX3Test {

    @org.junit.jupiter.api.Test

    //Encontrar a viagem com o tripID 2213

    void getTrips() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/ex3-data/ex3-example1.csv");

        Set<TripApagar> tripsToFind = new HashSet<>();
        tripsToFind.add(new TripApagar(2213, 0, 0, 0, 0));


        AVL<TripApagar> result = ex3.getTrips(tripsToFind, lines);

        AVL<TripApagar> expected = new AVL<>();
        expected.insert(new TripApagar(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);

    }
    //Encontrar as viagens com os tripID 527, 300 e 1000
    @org.junit.jupiter.api.Test
    void getTrips2() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/ex3-data/ex3-example2.csv");

        Set<TripApagar> tripsToFind = new HashSet<>();
        tripsToFind.add(new TripApagar(527, 0, 0, 0, 0));
        tripsToFind.add(new TripApagar(300, 0, 0, 0, 0));
        tripsToFind.add(new TripApagar(1000, 0, 0, 0, 0));

        AVL<TripApagar> result = ex3.getTrips(tripsToFind, lines);

        AVL<TripApagar> expected = new AVL<>();
        expected.insert(new TripApagar(527, 42.28457278, -83.74321417, 42.29456361, -83.70448778));
        expected.insert(new TripApagar(300, 42.27257083, -83.79917139, 43.27259583, -84.79918222));
        expected.insert(new TripApagar(1000, 42.27244472, -83.79918278, 42.27257083, -83.79917139));

        assertEquals(expected, result);
    }

    //Encontrar as viagens com o tripID entre 300 e 600
    @org.junit.jupiter.api.Test
    void getTrips3() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/ex3-data/ex3-example2.csv");



        AVL<TripApagar> result = ex3.getTrips(300,600, lines);

        AVL<TripApagar> expected = new AVL<>();
        expected.insert(new TripApagar(527, 42.27173778, -83.79912111, 42.27244472, -83.79918278));
        expected.insert(new TripApagar(300, 42.27257083, -83.79917139, 43.27259583, -84.79918222));


        assertEquals(expected, result);
    }

    //Encontrar a viagens com o tripID 301(que não existe)
    @org.junit.jupiter.api.Test
    void getTrips4() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/ex3-data/ex3-example2.csv");


        Set<TripApagar> tripsToFind = new HashSet<>();
        tripsToFind.add(new TripApagar(301, 0, 0, 0, 0));


        AVL<TripApagar> result = ex3.getTrips(tripsToFind, lines);

        AVL<TripApagar> expected = new AVL<>();



        assertEquals(expected, result);
    }

    //Encontrar a viagens com o tripID entre 350 e 400(que não existe)
    @org.junit.jupiter.api.Test
    void getTrips5() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/ex3-data/ex3-example2.csv");



        AVL<TripApagar> result = ex3.getTrips(350,400, lines);

        AVL<TripApagar> expected = new AVL<>();


        assertEquals(expected, result);
    }
    // Encontrar a viagens com o tripID entre 2213 e 2213 do ficheiro dado pelo professor
    @org.junit.jupiter.api.Test
    void getTrips7() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/VEData/VED_180404_week.csv");



        AVL<TripApagar> result = ex3.getTrips(2213,2213, lines);

        AVL<TripApagar> expected = new AVL<>();
        expected.insert(new TripApagar(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);
    }

    // Encontrar a viagens com o tripID igual a 2213 no ficheiro dado pelo professor
    @org.junit.jupiter.api.Test
    void getTrips8() {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/VEData/VED_180404_week.csv");

        Set<TripApagar> tripsToFind = new HashSet<>();
        tripsToFind.add(new TripApagar(2213, 0, 0, 0, 0));


        AVL<TripApagar> result = ex3.getTrips(tripsToFind, lines);

        AVL<TripApagar> expected = new AVL<>();
        expected.insert(new TripApagar(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        assertEquals(expected, result);
    }

}