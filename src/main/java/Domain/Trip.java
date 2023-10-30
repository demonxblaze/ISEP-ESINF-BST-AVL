package Domain;

import Trees.AVL;
import java.util.Objects;


public class Trip implements Comparable<Trip> {

    int vehID;
    int tripID;
    AVL<TripData> tripData;


    public Trip(int vehid, int tripID, AVL<TripData> tripData) {
        this.vehID = vehid;
        this.tripID = tripID;
        this.tripData = tripData;
    }

    public int getVehid() {
        return vehID;
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
    public double getTripDistanceEuclidean(){
        TripData firstTripData = tripData.findMin();
        TripData lastTripData = tripData.findMax();

        double x1 = firstTripData.getLatitude();
        double y1 = firstTripData.getLongitude();
        double x2 = lastTripData.getLatitude();
        double y2 = lastTripData.getLongitude();

        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));


    }
    public double getTripDistanceHaversine(){
        TripData firstTripData = tripData.findMin();
        TripData lastTripData = tripData.findMax();

        double lon1 = Math.toRadians(firstTripData.getLongitude());
        double lon2 = Math.toRadians(lastTripData.getLongitude());
        double lat1 = Math.toRadians(firstTripData.getLatitude());
        double lat2 = Math.toRadians(lastTripData.getLatitude());

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        return(c * r);
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
        if (o.getVehid()==-1){
            return Integer.compare(this.getTripID(), o.getTripID());
        }

        if (this.getTripDistanceEuclidean() > o.getTripDistanceEuclidean())
            return 1;
        else if (this.getTripDistanceEuclidean() < o.getTripDistanceEuclidean())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "vehID=" + vehID +
                ", tripID=" + tripID +
                ", tripData=" + tripData +
                '}';
    }
}