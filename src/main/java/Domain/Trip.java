package Domain;

public class Trip implements Comparable<Trip>{
    
    //double dayNum;
    //int vehID;

    int tripID;
    //double timestamp;
    double latitudeStart;
    double longitudeStart;
    double latitudeEnd;
    double longitudeEnd;

    public Trip(int tripID,  double latitudeStart, double longitudeStart, double latitudeEnd, double longitudeEnd){
        setTripID(tripID);
        setLatitudeStart(latitudeStart);
        setLongitudeStart(longitudeStart);
        setLatitudeEnd(latitudeEnd);
        setLongitudeEnd(longitudeEnd);

    }


    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }



    public double getLatitudeStart() {
        return latitudeStart;
    }

    public void setLatitudeStart(double latitudeStart) {
        this.latitudeStart = latitudeStart;
    }

    public double getLongitudeStart() {
        return longitudeStart;
    }

    public void setLongitudeStart(double longitudeStart) {
        this.longitudeStart = longitudeStart;
    }

    public double getLatitudeEnd() {
        return latitudeEnd;
    }

    public void setLatitudeEnd(double latitudeEnd) {
        this.latitudeEnd = latitudeEnd;
    }

    public double getLongitudeEnd() {
        return longitudeEnd;
    }

    public void setLongitudeEnd(double longitudeEnd) {
        this.longitudeEnd = longitudeEnd;
    }

    @Override
    public int hashCode() {
        return tripID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        if (this == obj)
            return true;
        Trip trip = (Trip) obj;
        return this.tripID == trip.tripID && this.latitudeStart == trip.latitudeStart && this.longitudeStart == trip.longitudeStart && this.latitudeEnd == trip.latitudeEnd && this.longitudeEnd == trip.longitudeEnd;
    }


    @Override
    public int compareTo(Trip o) {
        if (this.tripID > o.tripID)
            return 1;
        if (this.tripID < o.tripID)
            return -1;
        return 0;
    }
    @Override
    public String toString() {
        return "Trip: " + tripID + " Start: " + latitudeStart + " " + longitudeStart + " End: " + latitudeEnd + " " + longitudeEnd;
    }
}
