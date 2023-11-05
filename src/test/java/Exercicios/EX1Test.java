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
        VehicleTrips result = ex1.searchByVehID(structures.getVehicleTripsAVL(), 1);


        assertEquals(expected, result.getVehicle());
    }

    @Test
    void searchByVehIDVehicleData() {

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        Vehicle expected = new Vehicle(1, "PHEV", "Car", "4-GAS/ELECTRIC 1.6217978035879645L", "NO DATA", "FWD", 3555);
        VehicleTrips result = ex1.searchByVehID(structures.getVehicleTripsAVL(), 1);

        assertEquals(expected.getVehID(), result.getVehicle().getVehID());
        assertEquals(expected.getVehicleType(), result.getVehicle().getVehicleType());
        assertEquals(expected.getVehicleClass(), result.getVehicle().getVehicleClass());
        assertEquals(expected.getEngineConfiguration(), result.getVehicle().getEngineConfiguration());
        assertEquals(expected.getTransmission(), result.getVehicle().getTransmission());
        assertEquals(expected.getDriveWheels(), result.getVehicle().getDriveWheels());
        assertEquals(expected.getWeight(), result.getVehicle().getWeight());
    }

    @Test
    void searchByVehIDTripData() {

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex1-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex1-data/random_week_data_test_2.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        TripData expected1 = new TripData(0,-58.26187908420773,
                -122.62861799070336,85.09305405338765,3.883193313255356,1102,
                99.54351273941131,-7.620167174321355,1.3259930767088346,
                1957.5476306022933,1302.8857564814712,1349.6591163477835,
                12.558755157359492,31.638821442684883,352.67362774119886,
                4.457206431806727,-3.9848125042921367,-2.919472917947341,7.495435805682053);
        TripData expected2 = new TripData(1000,-58.45394752149488,-122.02424823578754,
                56.08323569708277,2.787553666831979,3476,60.12992963813182,
                25.177082932979026,6.404523728845276,1733.433451564324,1495.7803319464774,
                1799.0899300546728,29.711580351519594,3.8113768549494442,
                390.0683618164459,-0.20490682168279228,2.4724957772221003,
                -7.876703211328913,2.442981052278663);
        TripData expected3 = new TripData(2000,-58.64601595878204,-121.41987848087172,
                57.86324518279878,7.260173482450849,1579,33.580561272875066,
                16.135802739816025,3.45247447991793,1962.3168226436871,
                1681.567904248377,1066.3721914902167,8.14063952510486,
                8.263906549847366,365.5585603061184,4.221451813697907,
                -3.675582810585202,-5.018376070164468,0.7151654688873261);
        TripData expected4 = new TripData(3000,-58.83808439606919,-120.8155087259559,
                88.20214570735736,4.040323706806644,1248,78.8119480770095,
                4.742344792276283,5.67024818642661,1130.3765831519922,
                1658.9440826671441,1554.9518010100994,27.615089451235875,
                96.8642628508387,374.9239144356025,-0.750255796751615,
                -0.20230262458149362,3.6686355191993982,7.712947670445235);
        TripData expected5 = new TripData(4000,-59.03015283335635,-120.21113897104007,
                119.30152275865996,8.855922739534455,1504,19.552656023934112,
                7.957769152402193,8.550507185828927,1104.3173193462096,1269.4693294934953,
                1684.8417543905666,6.498444434554834,31.39201197536834,380.67147407539665,
                -1.8740515186672324,2.856591577029839,-1.4081718476999008,5.205499171139225);

        AVL<TripData> expected = new AVL<>();
        expected.insert(expected1);
        expected.insert(expected2);
        expected.insert(expected3);
        expected.insert(expected4);
        expected.insert(expected5);

        Trip result = ex1.searchByVehID(structures.getVehicleTripsAVL(), 5).getTrips().findElement(new Trip(13));

        assertEquals(expected, result.getTripData());

    }

    @Test
    void searchByVehIDNotFound() {

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

        PairData result = ex1.searchByTripID(structures.getVehicleTripsAVL(), new Trip(1, 1, 1, new AVL<TripData>()));
        PairData expected = new PairData<>(new Trip(1), new Vehicle(1));

        assertEquals(expected, result);
    }

    @Test
    void searchByTripIDNotFound() {

        List<String[]> vehicleData = FileScanner.lerCSV("project-data/ex4-data/vehicles_data_test_1.csv");
        List<String[]> tripData = FileScanner.lerCSV("project-data/ex4-data/random_week_data_test_1.csv");

        EX1 ex1 = new EX1();

        Structures structures = ex1.getStructures(vehicleData, tripData);

        //Não existe nenhuma viagem com o ID 999

        assertNull(ex1.searchByTripID(structures.getVehicleTripsAVL(), new Trip(999)));
    }

}