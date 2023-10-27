package Exercicios;

import java.util.*;

import Domain.TripApagar;
import Trees.AVL;

public class EX3 {

    private AVL<TripApagar> insertTripsInTheTree(List<String[]> lines) {
        AVL<TripApagar> trips = new AVL<>();


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
                trips.insert(new TripApagar(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));
                tripID = Integer.parseInt(s[0]);
                latitudeStart = Double.parseDouble(s[1]);
                longitudeStart = Double.parseDouble(s[2]);
                latitudeEnd =0;
                longitudeEnd = 0;

            }
            latitudeEnd = Double.parseDouble(s[1]);
            longitudeEnd = Double.parseDouble(s[2]);

        }

        trips.insert(new TripApagar(tripID, latitudeStart, longitudeStart, latitudeEnd, longitudeEnd));

        return trips;
    }

    public AVL<TripApagar> getTrips(Set<TripApagar> trips, List<String[]> list){

        AVL<TripApagar> avl = insertTripsInTheTree(list);

        AVL<TripApagar> tripsFounded = new AVL<>();

        for(TripApagar t : trips){
            tripsFounded.insert(avl.findElement(t));
        }

        return tripsFounded;

    }

    public AVL<TripApagar> getTrips(int min, int max, List<String[]> list){

        AVL<TripApagar> avl = insertTripsInTheTree(list);


        TripApagar minTrip= new TripApagar(min,0,0,0,0);
        TripApagar maxTrip= new TripApagar(max,0,0,0,0);

        return avl.findBetween(minTrip,maxTrip);

    }



}
