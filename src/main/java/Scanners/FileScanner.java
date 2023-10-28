package Scanners;

import Domain.EX4.Trip;
import Domain.EX4.TripData;
import Domain.EX4.Vehicle;
import Trees.AVL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface FileScanner {

    static List<String[]> lerCSV(String fileName) {

        // Lista de arrays de Strings
        List<String[]> lines = new ArrayList<>();


        // Tenta ler o ficheiro CSV
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    lines.add(data);
                }
            }
        } catch (IOException e) { // Caso não consiga ler o ficheiro
            System.err.println("Ficherio em formato inválido, tente o formato CSV " + e.getMessage());
        }

        return lines;
    }
    static List<String[]> lerTrips (String fileName) {

        // Lista de arrays de Strings
        List<String[]> lines = new ArrayList<>();

        // Tenta ler o ficheiro CSV
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    String[] refinedData = new String[3];
                    refinedData[0] = data[2]; //TripID
                    refinedData[1] = data[4]; //Latitude
                    refinedData[2] = data[5]; //Longitude
                    lines.add(refinedData);
                }
            }
        } catch (IOException e) { // Caso não consiga ler o ficheiro
            System.err.println("Ficherio em formato inválido, tente o formato CSV " + e.getMessage());
        }

        return lines;


    }

    static List<String[]> lerVeichleID_Trips(String fileName) {

        List<String[]> output = new ArrayList<>(); // Lista de arrays de Strings

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { // Tenta ler o ficheiro CSV

            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                    String[] trimmedData = new String[4];

                    trimmedData[0] = data[1]; //VehicleID
                    trimmedData[1] = data[2]; //TripID
                    trimmedData[2] = data[4]; //Latitude
                    trimmedData[3] = data[5]; //Longitude
                    output.add(trimmedData);
                }
            }
        } catch (IOException e) { // Caso não consiga ler o ficheiro
            System.err.println("Ficherio em formato inválido, tente o formato CSV " + e.getMessage());
        }

        return output;
    }



    static List<Trip> getTripsList(String filename) {
        List<String[]> lines;
        List<Trip> trips = new ArrayList<>();
        lines = FileScanner.lerTrips(filename);

        AVL<TripData> tempTripAVL = new AVL<>();
        for (String[] line : lines) {
            for (String s : line) {
                if (s.equals("NaN")) s = "0";
            }
            TripData temp = new TripData(Double.parseDouble(line[0]), Double.parseDouble(line [3]), Double.parseDouble(line[4]),
                    Double.parseDouble(line[5]), Double.parseDouble(line[6]), Double.parseDouble(line[7]),
                    Double.parseDouble(line[8]), Double.parseDouble(line[9]), Double.parseDouble(line[10]),
                    Double.parseDouble(line[11]), Double.parseDouble(line[12]), Double.parseDouble(line[13]),
                    Double.parseDouble(line[14]), Double.parseDouble(line[15]), Double.parseDouble(line[16]),
                    Double.parseDouble(line[17]), Double.parseDouble(line[18]), Double.parseDouble(line[19]),
                    Double.parseDouble(line[20]), Double.parseDouble(line[21]));

            tempTripAVL.insert(temp);

            if(lines.indexOf(line) > 0 && !lines.get(lines.indexOf(line) - 1)[2].equals(line[2])) {
                Trip trip = new Trip(Integer.parseInt(line[1]),Integer.parseInt(line[2]), tempTripAVL);
                trips.add(trip);
                tempTripAVL = new AVL<>();
            }
        }

        return trips;
    }

}
