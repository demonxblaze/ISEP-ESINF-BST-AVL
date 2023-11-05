package Exercicios;

import Domain.DayNumTrip;
import Domain.Vehicle;
import Domain.VehicleTypesStats;
import Scanners.FileScanner;
import Trees.AVL;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EX2Test {

    @Test
    void getVehiclesStats1() {
        //Uma entrada por trip, 4 trips, 1 tipo de vehicle
        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex2-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex2-data/random_week_data_test_1.csv");
        EX1 ex1 = new EX1();
        EX2 ex2 = new EX2();


       VehicleTypesStats expectedStats = new VehicleTypesStats();
         expectedStats.setPHEVMaxSpeed(55.12999725);
         expectedStats.setPHEVMinSpeed(0.0);
         expectedStats.setPHEVAvgSpeed(26.359999180000003);
         expectedStats.setPHEVMaxLoad(49.41176605);
         expectedStats.setPHEVMinLoad(0.0);
         expectedStats.setPHEVAvgLoad(32.35294199);
        expectedStats.setPHEVMaxOAT(7.5);
        expectedStats.setPHEVMinOAT(-2.5);
        expectedStats.setPHEVAvgOAT(1.5);
        expectedStats.setPHEVLoadCount(2);
        expectedStats.setPHEVSpeedCount(4);
        expectedStats.setPHEVOATCount(4);

        expectedStats.setHEVMaxSpeed(0.0);
        expectedStats.setHEVMinSpeed(0.0);
        expectedStats.setHEVAvgSpeed(0.0);
        expectedStats.setHEVMaxLoad(0.0);
        expectedStats.setHEVMinLoad(0.0);
        expectedStats.setHEVAvgLoad(0.0);
        expectedStats.setHEVMaxOAT(0.0);
        expectedStats.setHEVMinOAT(0.0);
        expectedStats.setHEVAvgOAT(0.0);
        expectedStats.setHEVLoadCount(0);
        expectedStats.setHEVSpeedCount(0);
        expectedStats.setHEVOATCount(0);

        expectedStats.setICEMaxSpeed(0.0);
        expectedStats.setICEMinSpeed(0.0);
        expectedStats.setICEAvgSpeed(0.0);
        expectedStats.setICEMaxLoad(0.0);
        expectedStats.setICEMinLoad(0.0);
        expectedStats.setICEAvgLoad(0.0);
        expectedStats.setICEMaxOAT(0.0);
        expectedStats.setICEMinOAT(0.0);
        expectedStats.setICEAvgOAT(0.0);
        expectedStats.setICEOATCount(0);
        expectedStats.setICESpeedCount(0);
        expectedStats.setICELoadCount(0);


        AVL<DayNumTrip> dayNumTripAVL= ex1.getStructures(vehicleData, tripData).getDayNumAvl();
        AVL<Vehicle> vehicleAVL = ex1.getStructures(vehicleData, tripData).getVehicleAVL();

       VehicleTypesStats a = ex2.getVehiclesStats(dayNumTripAVL, vehicleAVL, 155, 157);


       assertEquals(expectedStats, a);


    }
    @Test
     void getVehicleStats2(){
        //Mais que uma entrada por trip, 4 trips, 1 tipo de vehicle

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex2-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex2-data/random_week_data_test_2.csv");
        EX1 ex1 = new EX1();
        EX2 ex2 = new EX2();

        VehicleTypesStats expectedStats = new VehicleTypesStats();
        expectedStats.setPHEVMaxSpeed(57.31999969);
        expectedStats.setPHEVMinSpeed(0.0);
        expectedStats.setPHEVAvgSpeed(27.166090496545475);
        expectedStats.setPHEVMaxLoad(49.41176605);
        expectedStats.setPHEVMinLoad(0.0);
        expectedStats.setPHEVAvgLoad(23.601307726666676);
        expectedStats.setPHEVMaxOAT(7.5);
        expectedStats.setPHEVMinOAT(-2.5);
        expectedStats.setPHEVAvgOAT(2.381818181818182);
        expectedStats.setPHEVLoadCount(60);
        expectedStats.setPHEVSpeedCount(110);
        expectedStats.setPHEVOATCount(110);

        expectedStats.setHEVMaxSpeed(0.0);
        expectedStats.setHEVMinSpeed(0.0);
        expectedStats.setHEVAvgSpeed(0.0);
        expectedStats.setHEVMaxLoad(0.0);
        expectedStats.setHEVMinLoad(0.0);
        expectedStats.setHEVAvgLoad(0.0);
        expectedStats.setHEVMaxOAT(0.0);
        expectedStats.setHEVMinOAT(0.0);
        expectedStats.setHEVAvgOAT(0.0);
        expectedStats.setHEVLoadCount(0);
        expectedStats.setHEVSpeedCount(0);
        expectedStats.setHEVOATCount(0);

        expectedStats.setICEMaxSpeed(0.0);
        expectedStats.setICEMinSpeed(0.0);
        expectedStats.setICEAvgSpeed(0.0);
        expectedStats.setICEMaxLoad(0.0);
        expectedStats.setICEMinLoad(0.0);
        expectedStats.setICEAvgLoad(0.0);
        expectedStats.setICEMaxOAT(0.0);
        expectedStats.setICEMinOAT(0.0);
        expectedStats.setICEAvgOAT(0.0);
        expectedStats.setICEOATCount(0);
        expectedStats.setICESpeedCount(0);
        expectedStats.setICELoadCount(0);


        AVL<DayNumTrip> dayNumTripAVL= ex1.getStructures(vehicleData, tripData).getDayNumAvl();
        AVL<Vehicle> vehicleAVL = ex1.getStructures(vehicleData, tripData).getVehicleAVL();

        VehicleTypesStats a = ex2.getVehiclesStats(dayNumTripAVL, vehicleAVL, 155, 157);

        assertEquals(expectedStats, a);

    }
    @Test
    void getVehicleStats3(){
        //Nenhum aentrada entre aqueles dayNums

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex2-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex2-data/random_week_data_test_2.csv");
        EX1 ex1 = new EX1();
        EX2 ex2 = new EX2();

        VehicleTypesStats expectedStats = new VehicleTypesStats();
        expectedStats.setPHEVMaxSpeed(0);
        expectedStats.setPHEVMinSpeed(0.0);
        expectedStats.setPHEVAvgSpeed(0);
        expectedStats.setPHEVMaxLoad(0);
        expectedStats.setPHEVMinLoad(0.0);
        expectedStats.setPHEVAvgLoad(0);
        expectedStats.setPHEVMaxOAT(0);
        expectedStats.setPHEVMinOAT(0);
        expectedStats.setPHEVAvgOAT(0);
        expectedStats.setPHEVLoadCount(0);
        expectedStats.setPHEVSpeedCount(0);
        expectedStats.setPHEVOATCount(0);

        expectedStats.setHEVMaxSpeed(0.0);
        expectedStats.setHEVMinSpeed(0.0);
        expectedStats.setHEVAvgSpeed(0.0);
        expectedStats.setHEVMaxLoad(0.0);
        expectedStats.setHEVMinLoad(0.0);
        expectedStats.setHEVAvgLoad(0.0);
        expectedStats.setHEVMaxOAT(0.0);
        expectedStats.setHEVMinOAT(0.0);
        expectedStats.setHEVAvgOAT(0.0);
        expectedStats.setHEVLoadCount(0);
        expectedStats.setHEVSpeedCount(0);
        expectedStats.setHEVOATCount(0);

        expectedStats.setICEMaxSpeed(0.0);
        expectedStats.setICEMinSpeed(0.0);
        expectedStats.setICEAvgSpeed(0.0);
        expectedStats.setICEMaxLoad(0.0);
        expectedStats.setICEMinLoad(0.0);
        expectedStats.setICEAvgLoad(0.0);
        expectedStats.setICEMaxOAT(0.0);
        expectedStats.setICEMinOAT(0.0);
        expectedStats.setICEAvgOAT(0.0);
        expectedStats.setICEOATCount(0);
        expectedStats.setICESpeedCount(0);
        expectedStats.setICELoadCount(0);


        AVL<DayNumTrip> dayNumTripAVL= ex1.getStructures(vehicleData, tripData).getDayNumAvl();
        AVL<Vehicle> vehicleAVL = ex1.getStructures(vehicleData, tripData).getVehicleAVL();

        VehicleTypesStats a = ex2.getVehiclesStats(dayNumTripAVL, vehicleAVL, 1, 2);

        assertEquals(expectedStats, a);

    }



}