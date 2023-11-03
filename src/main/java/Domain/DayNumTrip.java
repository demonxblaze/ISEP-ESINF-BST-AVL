package Domain;


import Trees.AVL;

public class DayNumTrip implements Comparable<DayNumTrip> {

    private AVL<Trip> listOfTrips;
    double dayNumValue;

    public DayNumTrip(double dayNumValue ,AVL<Trip> tripsAvl ) {
        this.listOfTrips = tripsAvl;
        this.dayNumValue = dayNumValue;
    }

    @Override
    public int compareTo(DayNumTrip o) {
        return Double.compare(this.dayNumValue, o.dayNumValue);
    }

    public AVL<Trip> getTrips() {
        return listOfTrips;
    }

    @Override
    public String toString() {
        return "DayNumTrip{" +
                "listOfTrips=" + listOfTrips.toString() +
                ", dayNumValue=" + dayNumValue +
                '}';
    }
}
