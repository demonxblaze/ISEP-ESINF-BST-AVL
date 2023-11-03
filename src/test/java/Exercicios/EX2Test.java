package Exercicios;

import Domain.DayNumTrip;
import Domain.Structures;
import Domain.Vehicle;
import Domain.VehicleTypesStats;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.jar.JarOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class EX2Test {

    @Test
    void getVehiclesStats() {
        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex2-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex2-data/random_week_data_test_1.csv");
        EX1 ex1 = new EX1();
        EX2 ex2 = new EX2();


        AVL<DayNumTrip> dayNumTripAVL= ex1.getStructures(vehicleData, tripData).getDayNumAvl();
        AVL<Vehicle> vehicleAVL = ex1.getStructures(vehicleData, tripData).getVehicleAVL();

       VehicleTypesStats a = ex2.getVehiclesStats(dayNumTripAVL, vehicleAVL, 1, 2.002);
        System.out.println(a.getPHEVMaxSpeed());
        assertEquals(1, a.getPHEVMaxOAT());





    }
}