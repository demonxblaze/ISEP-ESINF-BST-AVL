package Exercicios;

import Domain.EX4.PairData;
import Domain.EX4.Trip;
import Domain.EX4.VehicleTrips;
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
    public double getTripDistance(double latitudeStart, double longitudeStart, double latitudeEnd, double longitudeEnd){

        // Code extracted from https://www.geeksforgeeks.org/program-distance-two-points-earth/

        double lon1 = Math.toRadians(longitudeStart);
        double lon2 = Math.toRadians(longitudeEnd);
        double lat1 = Math.toRadians(latitudeStart);
        double lat2 = Math.toRadians(latitudeEnd);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        return(c * r);
    }

//    public AVL<TripApagar> getTripBiggestDistance(List<String[]> lines){
//        Set<TripApagar> setOfTrips = insertDataInSet(lines);
//
//        AVL<TripApagar> trips = new AVL<>();
//
//        for(TripApagar t : setOfTrips){
//            if(trips.findElement(t) == null){
//                trips.insert(t);
//            } else if (trips.findElement(t).getTripDistance() < t.getTripDistance()){
//                trips.remove(trips.findElement(t));
//                trips.insert(t);
//            }
//        }
//
//        return trips;
//    }

    public AVL<PairData<Integer, Trip>> getTripBiggestDistance(AVL<VehicleTrips> input) {
        AVL<PairData<Integer, Trip>> result = new AVL<>();

        return result;
    }
}
