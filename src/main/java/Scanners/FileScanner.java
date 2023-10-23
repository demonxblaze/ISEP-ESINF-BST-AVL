package Scanners;

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

//Q: why for an input of 9000 lines it add like 400000 lines to the list?
//A: because the file has 9000 lines but each line has 4 lines, so it adds 36000 lines to the list
//Q: why does it add 4 lines to the list?

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
}
