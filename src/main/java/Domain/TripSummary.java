package Domain;

public class TripSummary implements Comparable<TripSummary> {

    int tripID;
    double latitudeStart;
    double longitudeStart;
    double latitudeEnd;
    double longitudeEnd;

    public TripSummary(int tripID ,double latitudeStart, double longitudeStart, double latitudeEnd, double longitudeEnd){
        this.tripID = tripID;
        this.latitudeStart = latitudeStart;
        this.longitudeStart = longitudeStart;
        this.latitudeEnd = latitudeEnd;
        this.longitudeEnd = longitudeEnd;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TripSummary that)) return false;
        return tripID == that.tripID && Double.compare(that.latitudeStart, latitudeStart) == 0 && Double.compare(that.longitudeStart, longitudeStart) == 0 && Double.compare(that.latitudeEnd, latitudeEnd) == 0 && Double.compare(that.longitudeEnd, longitudeEnd) == 0;
    }

    @Override
    public int hashCode() {
        return tripID;
    }

    @Override
    public int compareTo(TripSummary o) {
        return Integer.compare(this.getTripID(), o.getTripID());
    }
}
