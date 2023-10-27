package Domain.EX4;

import java.util.Objects;

/**
 * This class represents a trip data taken by a vehicle and contains various data points related to the trip.
 */
public class TripData implements Comparable<TripData> {
    double dayNum; // day number of the trip
    double timeStamp; // timestamp of the trip
    double latitude; // latitude of the vehicle during the trip
    double longitude; // longitude of the vehicle during the trip
    int vehicleSpeed; // speed of the vehicle during the trip
    int maf; // mass air flow of the vehicle during the trip
    double engineRPM; // engine RPM of the vehicle during the trip
    double absoluteLoad; // absolute load of the vehicle during the trip
    double outsideTemp; // outside temperature during the trip
    double fuelRate; // fuel rate of the vehicle during the trip

    double airConPowerKw; // power of the air conditioning system in kW during the trip
    double airConPowerWatt; // power of the air conditioning system in watts during the trip
    double heaterPowerWatt; // power of the heater system in watts during the trip
    double hvBatteryCurrent; // current of the high voltage battery during the trip

    double hvBatterySoc; // state of charge of the high voltage battery during the trip
    double hvBatteryVoltage; // voltage of the high voltage battery during the trip
    double shortTermFuelBank1; // short term fuel bank 1 during the trip
    double shortTermFuelBank2; // short term fuel bank 2 during the trip
    double longTermFuelBank1; // long term fuel bank 1 during the trip
    double longTermFuelBank2; // long term fuel bank 2 during the trip

    /**
     * Constructor for the TripData class.
     * @param dayNum day number of the trip
     * @param timeStamp timestamp of the trip
     * @param latitude latitude of the vehicle during the trip
     * @param longitude longitude of the vehicle during the trip
     * @param vehicleSpeed speed of the vehicle during the trip
     * @param maf mass air flow of the vehicle during the trip
     * @param engineRPM engine RPM of the vehicle during the trip
     * @param absoluteLoad absolute load of the vehicle during the trip
     * @param outsideTemp outside temperature during the trip
     * @param fuelRate fuel rate of the vehicle during the trip
     * @param airConPowerKw power of the air conditioning system in kW during the trip
     * @param airConPowerWatt power of the air conditioning system in watts during the trip
     * @param heaterPowerWatt power of the heater system in watts during the trip
     * @param hvBatteryCurrent current of the high voltage battery during the trip
     * @param hvBatterySoc state of charge of the high voltage battery during the trip
     * @param hvBatteryVoltage voltage of the high voltage battery during the trip
     * @param shortTermFuelBank1 short term fuel bank 1 during the trip
     * @param shortTermFuelBank2 short term fuel bank 2 during the trip
     * @param longTermFuelBank1 long term fuel bank 1 during the trip
     * @param longTermFuelBank2 long term fuel bank 2 during the trip
     */
    public TripData(double dayNum, double timeStamp, double latitude, double longitude, int vehicleSpeed, int maf, double engineRPM, double absoluteLoad, double outsideTemp, double fuelRate, double airConPowerKw, double airConPowerWatt, double heaterPowerWatt, double hvBatteryCurrent, double hvBatterySoc, double hvBatteryVoltage, double shortTermFuelBank1, double shortTermFuelBank2, double longTermFuelBank1, double longTermFuelBank2) {
        this.dayNum = dayNum;
        this.timeStamp = timeStamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.vehicleSpeed = vehicleSpeed;
        this.maf = maf;
        this.engineRPM = engineRPM;
        this.absoluteLoad = absoluteLoad;
        this.outsideTemp = outsideTemp;
        this.fuelRate = fuelRate;
        this.airConPowerKw = airConPowerKw;
        this.airConPowerWatt = airConPowerWatt;
        this.heaterPowerWatt = heaterPowerWatt;
        this.hvBatteryCurrent = hvBatteryCurrent;
        this.hvBatterySoc = hvBatterySoc;
        this.hvBatteryVoltage = hvBatteryVoltage;
        this.shortTermFuelBank1 = shortTermFuelBank1;
        this.shortTermFuelBank2 = shortTermFuelBank2;
        this.longTermFuelBank1 = longTermFuelBank1;
        this.longTermFuelBank2 = longTermFuelBank2;
    }

    /**
     * Getter method for dayNum.
     * @return the dayNum
     */
    public double getDayNum() {
        return dayNum;
    }

    /**
     * Setter method for dayNum.
     * @param dayNum the dayNum to set
     */
    public void setDayNum(double dayNum) {
        this.dayNum = dayNum;
    }

    /**
     * Getter method for timeStamp.
     * @return the timeStamp
     */
    public double getTimeStamp() {
        return timeStamp;
    }

    /**
     * Setter method for timeStamp.
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(double timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Getter method for latitude.
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Setter method for latitude.
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter method for longitude.
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Setter method for longitude.
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Getter method for vehicleSpeed.
     * @return the vehicleSpeed
     */
    public int getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * Setter method for vehicleSpeed.
     * @param vehicleSpeed the vehicleSpeed to set
     */
    public void setVehicleSpeed(int vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    /**
     * Getter method for maf.
     * @return the maf
     */
    public int getMaf() {
        return maf;
    }

    /**
     * Setter method for maf.
     * @param maf the maf to set
     */
    public void setMaf(int maf) {
        this.maf = maf;
    }

    /**
     * Getter method for engineRPM.
     * @return the engineRPM
     */
    public double getEngineRPM() {
        return engineRPM;
    }

    /**
     * Setter method for engineRPM.
     * @param engineRPM the engineRPM to set
     */
    public void setEngineRPM(double engineRPM) {
        this.engineRPM = engineRPM;
    }

    /**
     * Getter method for absoluteLoad.
     * @return the absoluteLoad
     */
    public double getAbsoluteLoad() {
        return absoluteLoad;
    }

    /**
     * Setter method for absoluteLoad.
     * @param absoluteLoad the absoluteLoad to set
     */
    public void setAbsoluteLoad(double absoluteLoad) {
        this.absoluteLoad = absoluteLoad;
    }

    /**
     * Getter method for outsideTemp.
     * @return the outsideTemp
     */
    public double getOutsideTemp() {
        return outsideTemp;
    }

    /**
     * Setter method for outsideTemp.
     * @param outsideTemp the outsideTemp to set
     */
    public void setOutsideTemp(double outsideTemp) {
        this.outsideTemp = outsideTemp;
    }

    /**
     * Getter method for fuelRate.
     * @return the fuelRate
     */
    public double getFuelRate() {
        return fuelRate;
    }

    /**
     * Setter method for fuelRate.
     * @param fuelRate the fuelRate to set
     */
    public void setFuelRate(double fuelRate) {
        this.fuelRate = fuelRate;
    }

    /**
     * Getter method for airConPowerKw.
     * @return the airConPowerKw
     */
    public double getAirConPowerKw() {
        return airConPowerKw;
    }

    /**
     * Setter method for airConPowerKw.
     * @param airConPowerKw the airConPowerKw to set
     */
    public void setAirConPowerKw(double airConPowerKw) {
        this.airConPowerKw = airConPowerKw;
    }

    /**
     * Getter method for airConPowerWatt.
     * @return the airConPowerWatt
     */
    public double getAirConPowerWatt() {
        return airConPowerWatt;
    }

    /**
     * Setter method for airConPowerWatt.
     * @param airConPowerWatt the airConPowerWatt to set
     */
    public void setAirConPowerWatt(double airConPowerWatt) {
        this.airConPowerWatt = airConPowerWatt;
    }

    /**
     * Getter method for heaterPowerWatt.
     * @return the heaterPowerWatt
     */
    public double getHeaterPowerWatt() {
        return heaterPowerWatt;
    }

    /**
     * Setter method for heaterPowerWatt.
     * @param heaterPowerWatt the heaterPowerWatt to set
     */
    public void setHeaterPowerWatt(double heaterPowerWatt) {
        this.heaterPowerWatt = heaterPowerWatt;
    }

    /**
     * Getter method for hvBatteryCurrent.
     * @return the hvBatteryCurrent
     */
    public double getHvBatteryCurrent() {
        return hvBatteryCurrent;
    }

    /**
     * Setter method for hvBatteryCurrent.
     * @param hvBatteryCurrent the hvBatteryCurrent to set
     */
    public void setHvBatteryCurrent(double hvBatteryCurrent) {
        this.hvBatteryCurrent = hvBatteryCurrent;
    }

    /**
     * Getter method for hvBatterySoc.
     * @return the hvBatterySoc
     */
    public double getHvBatterySoc() {
        return hvBatterySoc;
    }

    /**
     * Setter method for hvBatterySoc.
     * @param hvBatterySoc the hvBatterySoc to set
     */
    public void setHvBatterySoc(double hvBatterySoc) {
        this.hvBatterySoc = hvBatterySoc;
    }

    /**
     * Getter method for hvBatteryVoltage.
     * @return the hvBatteryVoltage
     */
    public double getHvBatteryVoltage() {
        return hvBatteryVoltage;
    }

    /**
     * Setter method for hvBatteryVoltage.
     * @param hvBatteryVoltage the hvBatteryVoltage to set
     */
    public void setHvBatteryVoltage(double hvBatteryVoltage) {
        this.hvBatteryVoltage = hvBatteryVoltage;
    }

    /**
     * Getter method for shortTermFuelBank1.
     * @return the shortTermFuelBank1
     */
    public double getShortTermFuelBank1() {
        return shortTermFuelBank1;
    }

    /**
     * Setter method for shortTermFuelBank1.
     * @param shortTermFuelBank1 the shortTermFuelBank1 to set
     */
    public void setShortTermFuelBank1(double shortTermFuelBank1) {
        this.shortTermFuelBank1 = shortTermFuelBank1;
    }

    /**
     * Getter method for shortTermFuelBank2.
     * @return the shortTermFuelBank2
     */
    public double getShortTermFuelBank2() {
        return shortTermFuelBank2;
    }

    /**
     * Setter method for shortTermFuelBank2.
     * @param shortTermFuelBank2 the shortTermFuelBank2 to set
     */
    public void setShortTermFuelBank2(double shortTermFuelBank2) {
        this.shortTermFuelBank2 = shortTermFuelBank2;
    }

    /**
     * Getter method for longTermFuelBank1.
     * @return the longTermFuelBank1
     */
    public double getLongTermFuelBank1() {
        return longTermFuelBank1;
    }

    /**
     * Setter method for longTermFuelBank1.
     * @param longTermFuelBank1 the longTermFuelBank1 to set
     */
    public void setLongTermFuelBank1(double longTermFuelBank1) {
        this.longTermFuelBank1 = longTermFuelBank1;
    }

    /**
     * Getter method for longTermFuelBank2.
     * @return the longTermFuelBank2
     */
    public double getLongTermFuelBank2() {
        return longTermFuelBank2;
    }

    /**
     * Setter method for longTermFuelBank2.
     * @param longTermFuelBank2 the longTermFuelBank2 to set
     */
    public void setLongTermFuelBank2(double longTermFuelBank2) {
        this.longTermFuelBank2 = longTermFuelBank2;
    }

    /**
     * Overrides the equals method to compare two Trip objects.
     * @param o the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripData trip = (TripData) o;
        return Double.compare(dayNum, trip.dayNum) == 0 && timeStamp == trip.timeStamp && latitude == trip.latitude && longitude == trip.longitude && vehicleSpeed == trip.vehicleSpeed && maf == trip.maf && engineRPM == trip.engineRPM && Double.compare(absoluteLoad, trip.absoluteLoad) == 0 && outsideTemp == trip.outsideTemp && fuelRate == trip.fuelRate && airConPowerKw == trip.airConPowerKw && airConPowerWatt == trip.airConPowerWatt && heaterPowerWatt == trip.heaterPowerWatt && hvBatteryCurrent == trip.hvBatteryCurrent && hvBatterySoc == trip.hvBatterySoc && hvBatteryVoltage == trip.hvBatteryVoltage && shortTermFuelBank1 == trip.shortTermFuelBank1 && shortTermFuelBank2 == trip.shortTermFuelBank2 && longTermFuelBank1 == trip.longTermFuelBank1 && longTermFuelBank2 == trip.longTermFuelBank2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayNum, timeStamp, latitude, longitude, vehicleSpeed, maf, engineRPM, absoluteLoad, outsideTemp, fuelRate, airConPowerKw, airConPowerWatt, heaterPowerWatt, hvBatteryCurrent, hvBatterySoc, hvBatteryVoltage, shortTermFuelBank1, shortTermFuelBank2, longTermFuelBank1, longTermFuelBank2);
    }

    @Override
    public int compareTo(TripData o) {
        return 0;
    }
}