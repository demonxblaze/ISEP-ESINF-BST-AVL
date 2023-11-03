package Exercicios;

import Domain.TripSummary;
import Trees.AVL;
import Trees.KDTree;

import java.awt.geom.Point2D;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EX5 {


    public Set<TripSummary> findTheClosest(AVL<TripSummary> trips, Map<String, KDTree<Integer>> tripsKD, Point2D.Double origem, Point2D.Double destino) {
        Set<TripSummary> tripsFounded = new HashSet<>();

        Integer closestStart = tripsKD.get("START").findNearestNeighbour(origem.getX(), origem.getY());
        Integer closestEnd = tripsKD.get("END").findNearestNeighbour(destino.getX(), destino.getY());

        if (closestEnd == null || closestStart == null)
            return tripsFounded;

        if (!closestEnd.equals(closestStart)) {

            TripSummary bestStart = trips.findElement(new TripSummary(closestStart, 0, 0, 0, 0));
            TripSummary bestEnd = trips.findElement(new TripSummary(closestEnd, 0, 0, 0, 0));

            tripsFounded.add(bestStart);
            tripsFounded.add(bestEnd);

        } else {

            TripSummary bestTrip = trips.findElement(new TripSummary(closestStart, 0, 0, 0, 0));
            tripsFounded.add(bestTrip);
        }

        return tripsFounded;

    }


}
