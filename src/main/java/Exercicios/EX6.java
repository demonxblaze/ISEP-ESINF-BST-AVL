package Exercicios;

import Domain.Trip;
import Trees.KDTree;

import java.awt.geom.Point2D;
import java.util.*;

public class EX6 {
    public Set<Trip> getTopTrips(int N, KDTree<Trip> beginTripsTree, KDTree<Trip> endTripsTree, Point2D point1, Point2D point2){

        TreeSet<Trip> tripsResult = new TreeSet<>(new Comparator<Trip>() {
            @Override
            public int compare(Trip o1, Trip o2) {
                return (int) (o2.getTripDistanceEuclidean() - o1.getTripDistanceEuclidean());
            }
        });

        List<Trip> beginSet =  beginTripsTree.findInRange(point1.getX(), point2.getX(), point1.getY(), point2.getY());
        List<Trip> endSet =  endTripsTree.findInRange(point1.getX(), point2.getX(), point1.getY(), point2.getY());



        for (Trip trip : beginSet) {
            if (endSet.contains(trip)) {
                tripsResult.add(trip);
            }
        }


        while (tripsResult.size() > N) {
            tripsResult.pollLast();
        }




        return tripsResult;

    }
}
