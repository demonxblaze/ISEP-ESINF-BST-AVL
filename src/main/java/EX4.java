import Domain.Trip;
import Trees.AVL;

import java.util.List;

public class EX4 {

    private AVL<Trip> insertDataInTree(List<String[]> lines) {
        AVL<Trip> trips = new AVL<>();
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
                trips.insert(new Trip(vehID, tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));
                tripID = Integer.parseInt(line[1]);
                latitudeStart = Double.parseDouble(line[2]);
                longitudeStart = Double.parseDouble(line[3]);
            }

            latitudeEnd = Double.parseDouble(line[2]);
            longitudeEnd = Double.parseDouble(line[3]);

        }

        trips.insert(new Trip(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));

        return trips;
    }
}
