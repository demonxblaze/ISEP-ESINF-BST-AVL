package Exercicios;

import java.util.*;

import Domain.Trip;
import Domain.TripSummary;
import Domain.VehicleTrips;
import Trees.AVL;

public class EX3 {



    public AVL<TripSummary> getTrips(Set<Integer> tripIDs, int min, int max, AVL<TripSummary> tripsAVL) {
        AVL<TripSummary> tripsFounded = new AVL<>();
        if (tripIDs!=null) {
            for (Integer i : tripIDs) {
                TripSummary temp = tripsAVL.findElement( new TripSummary(i,0,0,0,0));
                if (temp != null) tripsFounded.insert(temp);
            }
            if (tripsFounded.isEmpty()) {
                return null;
            } else {
                return tripsFounded;
            }
        }else{

            TripSummary minTrip= new TripSummary(min,0,0,0,0);
            TripSummary maxTrip= new TripSummary(max,0,0,0,0);
            tripsFounded = tripsAVL.findBetween(minTrip, maxTrip);

            if (tripsFounded.isEmpty()) {
                return null;
            } else {
                return tripsFounded;
            }
        }


    }




}
