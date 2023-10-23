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


/*
    public static void main(String[] args) {
       EX3 ex3 = new EX3();
      List<String[]> lines = FileScanner.lerTrips("project-data/VEData/VED_180404_week.csv");
        // List<String[]> lines = FileScanner.lerTrips("project-data/ex3-data/ex3-example1.csv");

       Set<Trip> tripsToFind = new HashSet<>();
       tripsToFind.add(new Trip(2213, 0, 0, 0, 0));
       //tripsToFind.add(new Trip(583, 0, 0, 0, 0));
       tripsToFind.add(new Trip(2294, 0, 0, 0, 0));


      // AVL<Trip> trips = ex3.getTrips(tripsToFind, lines);
       AVL<Trip> trips = ex3.insertTripsInTheTree( lines);
       System.out.println(trips.toString());
        System.out.println("--------------------------------------------------");

        AVL<Trip> trips2 = ex3.getTrips(1300, 1400, lines);
        System.out.println(trips2);

    }*/
}
