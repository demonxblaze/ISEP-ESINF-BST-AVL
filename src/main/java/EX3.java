import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import Domain.Trip;
import Scanners.FileScanner;
import Trees.AVL;

public class EX3 {

    public AVL<Trip> getTrips(List<String[]> lines) {
        AVL<Trip> trips = new AVL<>();

        Iterator<String[]> iterator = lines.iterator();
        double latitudeStart = 0;
        double longitudeStart = 0;
        double latitudeEnd = 0;
        double longitudeEnd = 0;

        int tripID = -1;
        while (iterator.hasNext()) {

            if (tripID == -1) {
                tripID = Integer.parseInt(((String[]) iterator.next())[1]);
                latitudeStart = Double.parseDouble(((String[]) iterator.next())[2]);
                longitudeStart = Double.parseDouble(((String[]) iterator.next())[3]);

            } else if ( tripID != Integer.parseInt(((String[]) iterator.next())[1])) {
                trips.insert(new Trip(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));
                tripID = Integer.parseInt(((String[]) iterator.next())[1]);

            }
            latitudeEnd = Double.parseDouble(((String[]) iterator.next())[2]);
            longitudeEnd = Double.parseDouble(((String[]) iterator.next())[3]);



        }
        return trips;
    }

    public static void main(String[] args) {
        EX3 ex3 = new EX3();
        List<String[]> lines = FileScanner.lerTrips("project-data/VEData/VED_180404_week.csv");
        AVL<Trip> trips = ex3.getTrips(lines);
        System.out.println(trips.toString());
    }
}
