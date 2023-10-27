package Exercicios;

import Domain.TripApagar;
import Trees.AVL;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EX4 {

    private Set<TripApagar> insertDataInSet(List<String[]> lines) {
        Set<TripApagar> trips = new LinkedHashSet<>();
        boolean firstRow = true;

        double latitudeStart = 0;
        double longitudeStart = 0;
        double latitudeEnd  = 0;
        double longitudeEnd = 0;
        int tripID = 0;
        int vehID = 0;


        for (String[] line : lines) {

            if (firstRow) {
                firstRow = false;

                vehID = Integer.parseInt(line[0]);
                tripID = Integer.parseInt(line[1]);
                latitudeStart = Double.parseDouble(line[2]);
                longitudeStart = Double.parseDouble(line[3]);
            }

            if (tripID != Integer.parseInt(line[1])) {
                trips.add(new TripApagar(vehID, tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));
                tripID = Integer.parseInt(line[1]);
                latitudeStart = Double.parseDouble(line[2]);
                longitudeStart = Double.parseDouble(line[3]);
            }

            latitudeEnd = Double.parseDouble(line[2]);
            longitudeEnd = Double.parseDouble(line[3]);

        }

        trips.add(new TripApagar(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));

        return trips;
    }

    public AVL<TripApagar> getTripBiggestDistance(List<String[]> lines){
        Set<TripApagar> setOfTrips = insertDataInSet(lines);
        
        AVL<TripApagar> trips = new AVL<>();
        
        for(TripApagar t : setOfTrips){
            if(trips.findElement(t) == null){
                trips.insert(t);
            } else if (trips.findElement(t).getTripDistance() < t.getTripDistance()){
                trips.remove(trips.findElement(t));
                trips.insert(t);
            }
        }

        return trips;
    }
}
