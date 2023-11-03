package Exercicios;

import Domain.PairData;
import Domain.Trip;
import Domain.TripSummary;
import Domain.VehicleTripsDistance;
import Scanners.FileScanner;
import Trees.AVL;
import Trees.KDTree;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EX5Test {
    private final EX1 ex1 = new EX1();
    private final List<String[]> vehicles1 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_PHEV&EV.csv");
    private final List<String[]> vehicles2 = FileScanner.lerCSV("project-data/VEData/VED_Static_Data_ICE&HEV.csv");
    private final EX5 ex5 = new EX5();
    private List<String[]> vehicles;
    private AVL<TripSummary> example1;

    /**
     * Test if the method returns an empty Set when the input is empty
     */
    @Test
    void testEmptyInput() {
        // Arrange
        vehicles = new ArrayList<>();
        List<String[]> trips = FileScanner.lerCSV("project-data/ex5-data/ex5-test2.csv");

        example1 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();

        Map<String, KDTree<Integer>> forKd = ex1.getStructures(vehicles, trips).getForKd();
        Point2D.Double origem = new Point2D.Double();
        Point2D.Double destino = new Point2D.Double();

        // Act
        Set<TripSummary> result = ex5.findTheClosest(example1, forKd, origem, destino);

        // Assert
        assertTrue(result.isEmpty());

    }

    /* Encontrar a viagem mais próxima de um ponto de origem e de um ponto de destino
     * Quando uma viagem tem a sua origem mais próxima da origem pretendida e
     * o seu destino mais próximo do pretendido.
     * */
    /* Procurar a viagem com a origem mais próxima do ponto de origem pretendido
     e a viagem com o destino mais próximo do ponto de destino pretendido.
     mas não existem viagens no sistema
    * */
    @Test
    void test_empty_KDtree() {
        // Arrange
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex5-data/ex5-test2.csv");

        example1 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();
        Map<String, KDTree<Integer>> forKd = ex1.getStructures(vehicles, trips).getForKd();
        Point2D.Double origem = new Point2D.Double(55, 40);
        Point2D.Double destino = new Point2D.Double(20, 10);

        // Act
        Set<TripSummary> result = ex5.findTheClosest(example1, forKd, origem, destino);

        // Assert
        assertTrue(result.isEmpty());

    }

    /*Encontrar a viagem mais próxima de um ponto de origem e de um ponto de destino
     * Quando uma viagem tem a sua origem mais próxima da origem pretendida
     * e outra viagem em o seu destino mais próximo do pretendido.
     */

    @Test
    void findTheClosest1() {
        // Arrange
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex5-data/ex5-test1.csv");

        example1 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();
        Map<String, KDTree<Integer>> forKd = ex1.getStructures(vehicles, trips).getForKd();
        Point2D.Double origem = new Point2D.Double(5, 40);
        Point2D.Double destino = new Point2D.Double(35, 40);

        Set<TripSummary> expected = new HashSet<>();
        expected.add(new TripSummary(1, 20, 40, 30, 15));
        expected.add(new TripSummary(3, 50, 15, 30, 40));

        // Act
        Set<TripSummary> result = ex5.findTheClosest(example1, forKd, origem, destino);

        // Assert
        assertEquals(expected, result);

    }

    @Test
    void findTheClosest2() {
        // Arrange
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/ex5-data/ex5-test1.csv");

        example1 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();
        Map<String, KDTree<Integer>> forKd = ex1.getStructures(vehicles, trips).getForKd();
        Point2D.Double origem = new Point2D.Double(55, 40);
        Point2D.Double destino = new Point2D.Double(20, 10);

        Set<TripSummary> expected = new HashSet<>();
        expected.add(new TripSummary(2, 50, 40, 10, 10));

        // Act
        Set<TripSummary> result = ex5.findTheClosest(example1, forKd, origem, destino);

        // Assert
        assertEquals(expected, result);

    }

    /*Encontrar a viagem mais próxima de um ponto de origem e de um ponto de destino
     * Quando uma viagem tem a sua origem mais próxima da origem pretendida
     * e seu destino mais próximo do pretendido. Utilizando o ficheiro do professor e manipulando as coordenadas
     * de forma a obter um resultado válido
     * */
    @Test
    void findTheClosest3() {
        // Arrange
        vehicles = new ArrayList<>(vehicles1);
        vehicles.addAll(vehicles2);
        List<String[]> trips = FileScanner.lerCSV("project-data/VEData/VED_180404_week.csv");

        example1 = ex1.getStructures(vehicles, trips).getTripSummaryAVL();
        Map<String, KDTree<Integer>> forKd = ex1.getStructures(vehicles, trips).getForKd();
        Point2D.Double origem = new Point2D.Double(42.28457255, -83.74321420);
        Point2D.Double destino = new Point2D.Double(42.29456360, -83.70448770);

        Set<TripSummary> expected = new HashSet<>();
        expected.add(new TripSummary(2213, 42.28457278, -83.74321417, 42.29456361, -83.70448778));

        // Act
        Set<TripSummary> result = ex5.findTheClosest(example1, forKd, origem, destino);

        // Assert
        assertEquals(expected, result);

    }
}