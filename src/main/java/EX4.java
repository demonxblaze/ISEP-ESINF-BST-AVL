import Domain.Trip;
import Trees.AVL;

import java.util.List;

public class EX4 {

    private AVL<Trip> insertDataInTheTree(List<String[]> lines) {
        AVL<Trip> trips = new AVL<>();

        double latitudeStart = 0;
        double longitudeStart = 0;
        double latitudeEnd = 0;
        double longitudeEnd = 0;

        int tripID = -1;



        for (String[] s : lines) {



            if (tripID == -1) {
                tripID = Integer.parseInt(s[0]);
                latitudeStart = Double.parseDouble(s[1]);
                longitudeStart = Double.parseDouble(s[2]);

            } else if ( tripID != Integer.parseInt(s[0])) {
                trips.insert(new Trip(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));
                tripID = Integer.parseInt(s[0]);
                latitudeStart = Double.parseDouble(s[1]);
                longitudeStart = Double.parseDouble(s[2]);
                latitudeEnd =0;
                longitudeEnd = 0;

            }
            latitudeEnd = Double.parseDouble(s[1]);
            longitudeEnd = Double.parseDouble(s[2]);

        }

        trips.insert(new Trip(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));

        return trips;
}
