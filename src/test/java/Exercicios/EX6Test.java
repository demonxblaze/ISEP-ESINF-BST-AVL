package Exercicios;

import Domain.Trip;
import Scanners.FileScanner;
import Trees.KDTree;
import com.sun.source.tree.Tree;
import org.junit.jupiter.api.*;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.*;

public class EX6Test {


    @Test
    void getTopTrips1(){
        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex6-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex6-data/random_week_data_test_2.csv");

        EX1 ex1 = new EX1();
        EX6 ex6 = new EX6();

        KDTree<Trip> beginig = ex1.getStructures(vehicleData, tripData).getBeginTripsTree();
        KDTree<Trip> end = ex1.getStructures(vehicleData, tripData).getEndTripsTree();
        Point2D point1 = new Point2D.Double(40, -84);
        Point2D point2 = new Point2D.Double(46, -79);

        Set<Trip> result = ex6.getTopTrips(1,beginig,end,point1,point2);

         Set<Trip> expected = new TreeSet<>();
        expected.add(new Trip(2213));

       assertIterableEquals(expected, result);




    }
    @Test
    void getTopTrips2(){
        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex6-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex6-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();
        EX6 ex6 = new EX6();

        KDTree<Trip> beginig = ex1.getStructures(vehicleData, tripData).getBeginTripsTree();
        KDTree<Trip> end = ex1.getStructures(vehicleData, tripData).getEndTripsTree();
        Point2D point1 = new Point2D.Double(40, -84);
        Point2D point2 = new Point2D.Double(91, -79);



        Set<Trip> result = ex6.getTopTrips(2,beginig,end,point1,point2);



        List<Trip> expected = new ArrayList<>();
        expected.add(new Trip(3000));
        expected.add(new Trip(2213));


        assertIterableEquals(expected, result);




    }
    @Test
    void getTopTrips3(){
        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex6-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex6-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();
        EX6 ex6 = new EX6();

        KDTree<Trip> beginig = ex1.getStructures(vehicleData, tripData).getBeginTripsTree();
        KDTree<Trip> end = ex1.getStructures(vehicleData, tripData).getEndTripsTree();
        Point2D point1 = new Point2D.Double(40, -84);
        Point2D point2 = new Point2D.Double(91, -79);



        Set<Trip> result = ex6.getTopTrips(1,beginig,end,point1,point2);



        Set<Trip> expected = new TreeSet<>();
        expected.add(new Trip(3000));


        assertIterableEquals(expected, result);




    }
    @Test
    void getTopTrips4(){
        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex6-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex6-data/random_week_data_test_3.csv");

        EX1 ex1 = new EX1();
        EX6 ex6 = new EX6();

        KDTree<Trip> beginig = ex1.getStructures(vehicleData, tripData).getBeginTripsTree();
        KDTree<Trip> end = ex1.getStructures(vehicleData, tripData).getEndTripsTree();
        Point2D point1 = new Point2D.Double(40, -84);
        Point2D point2 = new Point2D.Double(110, -79);



        Set<Trip> result = ex6.getTopTrips(3,beginig,end,point1,point2);

        Set<Trip> expected = new TreeSet<>();
        expected.add(new Trip(768));
        expected.add(new Trip(2003));
        expected.add(new Trip(2294));


        assertIterableEquals(expected, result);




    }


}
