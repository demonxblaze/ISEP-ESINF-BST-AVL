package Domain;

import java.util.ArrayList;
import java.util.List;

import Trees.AVL;

public class DayNumTrip implements Comparable<DayNumTrip> {

    private AVL<Trip> listOfTrips;
    double dayNumValue;

    public DayNumTrip(AVL<Trip> tripsAvl , double dayNumValue) {
        this.listOfTrips = tripsAvl;
        this.dayNumValue = dayNumValue;
    }

    @Override
    public int compareTo(DayNumTrip o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
