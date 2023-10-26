import Domain.Trip;
import Trees.AVL;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EX4 {

    private Set<Trip> insertDataInSet(List<String[]> lines) {
        Set<Trip> trips = new LinkedHashSet<>();
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
                trips.add(new Trip(vehID, tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));
                tripID = Integer.parseInt(line[1]);
                latitudeStart = Double.parseDouble(line[2]);
                longitudeStart = Double.parseDouble(line[3]);
            }

            latitudeEnd = Double.parseDouble(line[2]);
            longitudeEnd = Double.parseDouble(line[3]);

        }

        trips.add(new Trip(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));

        return trips;
    }

    public AVL<Trip> getTripBiggestDistance(List<String[]> lines){
        Set<Trip> setOfTrips = insertDataInSet(lines);
        
        AVL<Trip> trips = new AVL<>();
        
        for(Trip t : setOfTrips){
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
