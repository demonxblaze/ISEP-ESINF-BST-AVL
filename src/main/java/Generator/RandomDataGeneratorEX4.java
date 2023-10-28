package Generator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomDataGeneratorEX4 {
    static int maxTimestamp = 10000;
    static int timestampStep = 1000;

    public static void main(String[] args) {
        String vehicleCsvFile = "vehicles_data_test_.csv";
        String tripCsvFile = "random_week_data_test.csv";
        int numVehicles = 5;
        int tripsPerVehicle = 3;


        try {
            // Generate vehicle data
            FileWriter vehicleWriter = new FileWriter(vehicleCsvFile);
            String[] vehicleHeader = {
                    "VehId", "Vehicle Type", "Vehicle Class", "Engine Configuration & Displacement",
                    "Transmission", "Drive Wheels", "Generalized_Weight"
            };
            writeRow(vehicleWriter, vehicleHeader);
            generateVehicleData(vehicleWriter, numVehicles);
            vehicleWriter.close();
            System.out.println("Vehicle data has been generated and saved to " + vehicleCsvFile);

            // Generate trip data
            FileWriter tripWriter = new FileWriter(tripCsvFile);
            String[] tripHeader = {
                    "DayNum", "VehId", "Trip", "Timestamp(ms)", "Latitude[deg]", "Longitude[deg]",
                    "Vehicle Speed[km/h]", "MAF[g/sec]", "Engine RPM[RPM]", "Absolute Load[%]",
                    "OAT[DegC]", "Fuel Rate[L/hr]", "Air Conditioning Power[kW]",
                    "Air Conditioning Power[Watts]", "Heater Power[Watts]",
                    "HV Battery Current[A]", "HV Battery SOC[%]", "HV Battery Voltage[V]",
                    "Short Term Fuel Trim Bank 1[%]", "Short Term Fuel Trim Bank 2[%]",
                    "Long Term Fuel Trim Bank 1[%]", "Long Term Fuel Trim Bank 2[%]"
            };
            writeRow(tripWriter, tripHeader);
            generateTripData(tripWriter, numVehicles, tripsPerVehicle);
            tripWriter.close();
            System.out.println("Random trip data has been generated and saved to " + tripCsvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeRow(FileWriter writer, String[] data) throws IOException {
        String line = String.join(",", data) + "\n";
        writer.write(line);
    }

    private static void generateVehicleData(FileWriter writer, int numVehicles) throws IOException {
        Random rand = new Random();
        for (int vehId = 1; vehId <= numVehicles; vehId++) {
            String[] row = {
                    String.valueOf(vehId), // VehId
                    (rand.nextBoolean() ? "PHEV" : "EV"), // Vehicle Type
                    "Car", // Vehicle Class
                    "4-GAS/ELECTRIC " + (1.4 + rand.nextDouble()) + "L", // Engine Configuration & Displacement
                    "NO DATA", // Transmission
                    "FWD", // Drive Wheels
                    String.valueOf(3500 + rand.nextInt(500)) // Generalized_Weight
            };
            writeRow(writer, row);
        }
    }

    private static void generateTripData(FileWriter writer, int numVehicles, int tripsPerVehicle) throws IOException {
        Random rand = new Random();
        for (int vehId = 1; vehId <= numVehicles; vehId++) {
            for (int trip = 1; trip <= tripsPerVehicle; trip++) {
                for (int timestamp = 0; timestamp < maxTimestamp; timestamp += timestampStep) {
                    double latitude = 42.0 + rand.nextDouble() * 0.5;
                    double longitude = -83.8 + rand.nextDouble() * 0.1;
                    double speed = 40 + rand.nextDouble() * 80;
                    double maf = rand.nextDouble() * 10;
                    int engineRPM = 1000 + rand.nextInt(3000);
                    double absoluteLoad = rand.nextDouble() * 100;
                    double oat = -10 + rand.nextDouble() * 40;
                    double fuelRate = rand.nextDouble() * 10;
                    double acPowerKW = 1000 + rand.nextDouble() * 1000;
                    double acPowerWatts = 1000 + rand.nextDouble() * 1000;
                    double heaterPowerWatts = 1000 + rand.nextDouble() * 1000;
                    double hvBatteryCurrent = -30 + rand.nextDouble() * 60;
                    double hvBatterySOC = rand.nextDouble() * 100;
                    double hvBatteryVoltage = 350 + rand.nextDouble() * 50;
                    double shortTermTrim1 = -5 + rand.nextDouble() * 10;
                    double shortTermTrim2 = -5 + rand.nextDouble() * 10;
                    double longTermTrim1 = -10 + rand.nextDouble() * 20;
                    double longTermTrim2 = -10 + rand.nextDouble() * 20;

                    String[] row = {
                            String.valueOf(rand.nextDouble() * 10), // DayNum
                            String.valueOf(vehId), // VehId
                            String.valueOf(trip), // Trip
                            String.valueOf(timestamp), // Timestamp(ms)
                            String.valueOf(latitude), // Latitude[deg]
                            String.valueOf(longitude), // Longitude[deg]
                            String.valueOf(speed), // Vehicle Speed[km/h]
                            String.valueOf(maf), // MAF[g/sec]
                            String.valueOf(engineRPM), // Engine RPM[RPM]
                            String.valueOf(absoluteLoad), // Absolute Load[%]
                            String.valueOf(oat), // OAT[DegC]
                            String.valueOf(fuelRate), // Fuel Rate[L/hr]
                            String.valueOf(acPowerKW), // Air Conditioning Power[kW]
                            String.valueOf(acPowerWatts), // Air Conditioning Power[Watts]
                            String.valueOf(heaterPowerWatts), // Heater Power[Watts]
                            String.valueOf(hvBatteryCurrent), // HV Battery Current[A]
                            String.valueOf(hvBatterySOC), // HV Battery SOC[%]
                            String.valueOf(hvBatteryVoltage), // HV Battery Voltage[V]
                            String.valueOf(shortTermTrim1), // Short Term Fuel Trim Bank 1[%]
                            String.valueOf(shortTermTrim2), // Short Term Fuel Trim Bank 2[%]
                            String.valueOf(longTermTrim1), // Long Term Fuel Trim Bank 1[%]
                            String.valueOf(longTermTrim2) // Long Term Fuel Trim Bank 2[%]
                    };

                    writeRow(writer, row);
                }
            }
        }
    }
}
