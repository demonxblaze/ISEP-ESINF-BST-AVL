import java.util.*;

import Domain.Trip;
import Scanners.FileScanner;
import Trees.AVL;

public class EX3 {

    private AVL<Trip> insertTripsInTheTree(List<String[]> lines) {
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

    public AVL<Trip> getTrips(Set<Trip> trips, List<String[]> list){

        AVL<Trip> avl = insertTripsInTheTree(list);

        AVL<Trip> tripsFounded = new AVL<>();

        for(Trip t : trips){
            tripsFounded.insert(avl.findElement(t));
        }

        return tripsFounded;

    }
    public AVL<Trip> getTrips(int min, int max, List<String[]> list){

        AVL<Trip> avl = insertTripsInTheTree(list);

        AVL<Trip> tripsFounded = new AVL<>();

        while (min <= max){
            Trip temp = avl.findElement(new Trip(min, 0, 0, 0, 0));
            if(temp!=null){
                tripsFounded.insert(temp);
            }
            min++;
        }

        return tripsFounded;

    }



}
