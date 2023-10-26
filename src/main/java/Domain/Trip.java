package Domain;

public class Trip implements Comparable<Trip>{

    double dayNum;
    int vehID;
    int tripID;
    double timestamp;
    double latitudeStart;
    double longitudeStart;
    double latitudeEnd;
    double longitudeEnd;
    double speed;
    String maf;
    String rpm;
    String load;
    String outsideAirTemp;
    String fuelRate;
    String aCPowerKW;
    String aCpowerW;
    String heaterPower;
    String hvCurrentBattery;
    String hvBatterySOC;
    String hvBatteryVoltage;
    String shortFuelOnePc;
    String shortFuelTwoPc;
    String longFuelOnePc;
    String longFuelTwoPc;

    public Trip(int tripID,  double latitudeStart, double longitudeStart, double latitudeEnd, double longitudeEnd){
        setTripID(tripID);
        setLatitudeStart(latitudeStart);
        setLongitudeStart(longitudeStart);
        setLatitudeEnd(latitudeEnd);
        setLongitudeEnd(longitudeEnd);
        setVehID(-1);
    }

    public Trip(int vehID, int tripID, double latitudeStart, double longitudeStart, double latitudeEnd, double longitudeEnd) {
        setVehID(vehID);
        setTripID(tripID);
        setLatitudeStart(latitudeStart);
        setLongitudeStart(longitudeStart);
        setLatitudeEnd(latitudeEnd);
        setLongitudeEnd(longitudeEnd);
    }

    public Trip(double dayNum, int vehID, int tripID, double timestamp, double latitudeStart, double longitudeStart,
                double latitudeEnd, double longitudeEnd, double speed, String maf, String rpm, String load,
                String outsideAirTemp, String fuelRate, String aCPowerKW, String aCpowerW, String heaterPower,
                String hvCurrentBattery, String hvBatterySOC, String hvBatteryVoltage, String shortFuelOnePc,
                String shortFuelTwoPc, String longFuelOnePc, String longFuelTwoPc) {
        setDayNum(dayNum);
        setVehID(vehID);
        setTripID(tripID);
        setTimestamp(timestamp);
        setLatitudeStart(latitudeStart);
        setLongitudeStart(longitudeStart);
        setLatitudeEnd(latitudeEnd);
        setLongitudeEnd(longitudeEnd);
        setSpeed(speed);
        setMaf(maf);
        setRpm(rpm);
        setLoad(load);
        setOutsideAirTemp(outsideAirTemp);
        setFuelRate(fuelRate);
        setaCPowerKW(aCPowerKW);
        setaCpowerW(aCpowerW);
        setHeaterPower(heaterPower);
        setHvCurrentBattery(hvCurrentBattery);
        setHvBatterySOC(hvBatterySOC);
        setHvBatteryVoltage(hvBatteryVoltage);
        setShortFuelOnePc(shortFuelOnePc);
        setShortFuelTwoPc(shortFuelTwoPc);
        setLongFuelOnePc(longFuelOnePc);
        setLongFuelTwoPc(longFuelTwoPc);
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }


    public double getDayNum() {
        return dayNum;
    }

    public void setDayNum(double dayNum) {
        this.dayNum = dayNum;
    }

    public int getVehID() {
        return vehID;
    }

    public void setVehID(int vehID) {
        this.vehID = vehID;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getMaf() {
        return maf;
    }

    public void setMaf(String maf) {
        this.maf = maf;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getOutsideAirTemp() {
        return outsideAirTemp;
    }

    public void setOutsideAirTemp(String outsideAirTemp) {
        this.outsideAirTemp = outsideAirTemp;
    }

    public String getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(String fuelRate) {
        this.fuelRate = fuelRate;
    }

    public String getaCPowerKW() {
        return aCPowerKW;
    }

    public void setaCPowerKW(String aCPowerKW) {
        this.aCPowerKW = aCPowerKW;
    }

    public String getaCpowerW() {
        return aCpowerW;
    }

    public void setaCpowerW(String aCpowerW) {
        this.aCpowerW = aCpowerW;
    }

    public String getHeaterPower() {
        return heaterPower;
    }

    public void setHeaterPower(String heaterPower) {
        this.heaterPower = heaterPower;
    }

    public String getHvCurrentBattery() {
        return hvCurrentBattery;
    }

    public void setHvCurrentBattery(String hvCurrentBattery) {
        this.hvCurrentBattery = hvCurrentBattery;
    }

    public String getHvBatterySOC() {
        return hvBatterySOC;
    }

    public void setHvBatterySOC(String hvBatterySOC) {
        this.hvBatterySOC = hvBatterySOC;
    }

    public String getHvBatteryVoltage() {
        return hvBatteryVoltage;
    }

    public void setHvBatteryVoltage(String hvBatteryVoltage) {
        this.hvBatteryVoltage = hvBatteryVoltage;
    }

    public String getShortFuelOnePc() {
        return shortFuelOnePc;
    }

    public void setShortFuelOnePc(String shortFuelOnePc) {
        this.shortFuelOnePc = shortFuelOnePc;
    }

    public String getShortFuelTwoPc() {
        return shortFuelTwoPc;
    }

    public void setShortFuelTwoPc(String shortFuelTwoPc) {
        this.shortFuelTwoPc = shortFuelTwoPc;
    }

    public String getLongFuelOnePc() {
        return longFuelOnePc;
    }

    public void setLongFuelOnePc(String longFuelOnePc) {
        this.longFuelOnePc = longFuelOnePc;
    }

    public String getLongFuelTwoPc() {
        return longFuelTwoPc;
    }

    public void setLongFuelTwoPc(String longFuelTwoPc) {
        this.longFuelTwoPc = longFuelTwoPc;
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

    public double getTripDistance(){

        // Code extracted from https://www.geeksforgeeks.org/program-distance-two-points-earth/

        double lon1 = Math.toRadians(longitudeStart);
        double lon2 = Math.toRadians(longitudeEnd);
        double lat1 = Math.toRadians(latitudeStart);
        double lat2 = Math.toRadians(latitudeEnd);

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
        if (vehID >= 0){
            return this.vehID == trip.vehID;
        }
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
