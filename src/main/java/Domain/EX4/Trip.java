package Domain.EX4;

import Trees.AVL;
import java.util.Objects;


public class Trip implements Comparable<Trip> {
    int tripID;
    AVL<TripData> tripData;


    public Trip(int tripID, AVL<TripData> tripData) {
        this.tripID = tripID;
        this.tripData = tripData;
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public void addTripData(TripData tripData){
        this.tripData.insert(tripData);
    }

    public void removeTripData(TripData tripData){
        this.tripData.remove(tripData);
    }

    public AVL<TripData> getTripData() {
        return tripData;
    }

    public void setTripData(AVL<TripData> tripData) {
        this.tripData = tripData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return tripID == trip.tripID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripID);
    }

    @Override
    public int compareTo(Trip o) {
        return 0;
    }
}
