package Domain.EX4;

import java.util.Objects;

/**
 * This class represents a trip data taken by a vehicle and contains various data points related to the trip.
 */
public class TripData implements Comparable<TripData> {
    double dayNum; // day number of the trip
    int timeStamp; // timestamp of the trip
    int latitude; // latitude of the vehicle during the trip
    int longitude; // longitude of the vehicle during the trip
    int vehicleSpeed; // speed of the vehicle during the trip
    int maf; // mass air flow of the vehicle during the trip
    int engineRPM; // engine RPM of the vehicle during the trip
    double absoluteLoad; // absolute load of the vehicle during the trip
    int outsideTemp; // outside temperature during the trip
    int fuelRate; // fuel rate of the vehicle during the trip

    int airConPowerKw; // power of the air conditioning system in kW during the trip
    int airConPowerWatt; // power of the air conditioning system in watts during the trip
    int heaterPowerWatt; // power of the heater system in watts during the trip
    int hvBatteryCurrent; // current of the high voltage battery during the trip

    int hvBatterySoc; // state of charge of the high voltage battery during the trip
    int hvBatteryVoltage; // voltage of the high voltage battery during the trip
    int shortTermFuelBank1; // short term fuel bank 1 during the trip
    int shortTermFuelBank2; // short term fuel bank 2 during the trip
    int longTermFuelBank1; // long term fuel bank 1 during the trip
    int longTermFuelBank2; // long term fuel bank 2 during the trip

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
    public TripData(double dayNum, int timeStamp, int latitude, int longitude, int vehicleSpeed, int maf, int engineRPM, double absoluteLoad, int outsideTemp, int fuelRate, int airConPowerKw, int airConPowerWatt, int heaterPowerWatt, int hvBatteryCurrent, int hvBatterySoc, int hvBatteryVoltage, int shortTermFuelBank1, int shortTermFuelBank2, int longTermFuelBank1, int longTermFuelBank2) {
        setDayNum(dayNum);
        setTimeStamp(timeStamp);
        setLatitude(latitude);
        setLongitude(longitude);
        setVehicleSpeed(vehicleSpeed);
        setMaf(maf);
        setEngineRPM(engineRPM);
        setAbsoluteLoad(absoluteLoad);
        setOutsideTemp(outsideTemp);
        setFuelRate(fuelRate);
        setAirConPowerKw(airConPowerKw);
        setAirConPowerWatt(airConPowerWatt);
        setHeaterPowerWatt(heaterPowerWatt);
        setHvBatteryCurrent(hvBatteryCurrent);
        setHvBatterySoc(hvBatterySoc);
        setHvBatteryVoltage(hvBatteryVoltage);
        setShortTermFuelBank1(shortTermFuelBank1);
        setShortTermFuelBank2(shortTermFuelBank2);
        setLongTermFuelBank1(longTermFuelBank1);
        setLongTermFuelBank2(longTermFuelBank2);
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
    public int getTimeStamp() {
        return timeStamp;
    }

    /**
     * Setter method for timeStamp.
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Getter method for latitude.
     * @return the latitude
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * Setter method for latitude.
     * @param latitude the latitude to set
     */
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter method for longitude.
     * @return the longitude
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * Setter method for longitude.
     * @param longitude the longitude to set
     */
    public void setLongitude(int longitude) {
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
    public int getEngineRPM() {
        return engineRPM;
    }

    /**
     * Setter method for engineRPM.
     * @param engineRPM the engineRPM to set
     */
    public void setEngineRPM(int engineRPM) {
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
    public int getOutsideTemp() {
        return outsideTemp;
    }

    /**
     * Setter method for outsideTemp.
     * @param outsideTemp the outsideTemp to set
     */
    public void setOutsideTemp(int outsideTemp) {
        this.outsideTemp = outsideTemp;
    }

    /**
     * Getter method for fuelRate.
     * @return the fuelRate
     */
    public int getFuelRate() {
        return fuelRate;
    }

    /**
     * Setter method for fuelRate.
     * @param fuelRate the fuelRate to set
     */
    public void setFuelRate(int fuelRate) {
        this.fuelRate = fuelRate;
    }

    /**
     * Getter method for airConPowerKw.
     * @return the airConPowerKw
     */
    public int getAirConPowerKw() {
        return airConPowerKw;
    }

    /**
     * Setter method for airConPowerKw.
     * @param airConPowerKw the airConPowerKw to set
     */
    public void setAirConPowerKw(int airConPowerKw) {
        this.airConPowerKw = airConPowerKw;
    }

    /**
     * Getter method for airConPowerWatt.
     * @return the airConPowerWatt
     */
    public int getAirConPowerWatt() {
        return airConPowerWatt;
    }

    /**
     * Setter method for airConPowerWatt.
     * @param airConPowerWatt the airConPowerWatt to set
     */
    public void setAirConPowerWatt(int airConPowerWatt) {
        this.airConPowerWatt = airConPowerWatt;
    }

    /**
     * Getter method for heaterPowerWatt.
     * @return the heaterPowerWatt
     */
    public int getHeaterPowerWatt() {
        return heaterPowerWatt;
    }

    /**
     * Setter method for heaterPowerWatt.
     * @param heaterPowerWatt the heaterPowerWatt to set
     */
    public void setHeaterPowerWatt(int heaterPowerWatt) {
        this.heaterPowerWatt = heaterPowerWatt;
    }

    /**
     * Getter method for hvBatteryCurrent.
     * @return the hvBatteryCurrent
     */
    public int getHvBatteryCurrent() {
        return hvBatteryCurrent;
    }

    /**
     * Setter method for hvBatteryCurrent.
     * @param hvBatteryCurrent the hvBatteryCurrent to set
     */
    public void setHvBatteryCurrent(int hvBatteryCurrent) {
        this.hvBatteryCurrent = hvBatteryCurrent;
    }

    /**
     * Getter method for hvBatterySoc.
     * @return the hvBatterySoc
     */
    public int getHvBatterySoc() {
        return hvBatterySoc;
    }

    /**
     * Setter method for hvBatterySoc.
     * @param hvBatterySoc the hvBatterySoc to set
     */
    public void setHvBatterySoc(int hvBatterySoc) {
        this.hvBatterySoc = hvBatterySoc;
    }

    /**
     * Getter method for hvBatteryVoltage.
     * @return the hvBatteryVoltage
     */
    public int getHvBatteryVoltage() {
        return hvBatteryVoltage;
    }

    /**
     * Setter method for hvBatteryVoltage.
     * @param hvBatteryVoltage the hvBatteryVoltage to set
     */
    public void setHvBatteryVoltage(int hvBatteryVoltage) {
        this.hvBatteryVoltage = hvBatteryVoltage;
    }

    /**
     * Getter method for shortTermFuelBank1.
     * @return the shortTermFuelBank1
     */
    public int getShortTermFuelBank1() {
        return shortTermFuelBank1;
    }

    /**
     * Setter method for shortTermFuelBank1.
     * @param shortTermFuelBank1 the shortTermFuelBank1 to set
     */
    public void setShortTermFuelBank1(int shortTermFuelBank1) {
        this.shortTermFuelBank1 = shortTermFuelBank1;
    }

    /**
     * Getter method for shortTermFuelBank2.
     * @return the shortTermFuelBank2
     */
    public int getShortTermFuelBank2() {
        return shortTermFuelBank2;
    }

    /**
     * Setter method for shortTermFuelBank2.
     * @param shortTermFuelBank2 the shortTermFuelBank2 to set
     */
    public void setShortTermFuelBank2(int shortTermFuelBank2) {
        this.shortTermFuelBank2 = shortTermFuelBank2;
    }

    /**
     * Getter method for longTermFuelBank1.
     * @return the longTermFuelBank1
     */
    public int getLongTermFuelBank1() {
        return longTermFuelBank1;
    }

    /**
     * Setter method for longTermFuelBank1.
     * @param longTermFuelBank1 the longTermFuelBank1 to set
     */
    public void setLongTermFuelBank1(int longTermFuelBank1) {
        this.longTermFuelBank1 = longTermFuelBank1;
    }

    /**
     * Getter method for longTermFuelBank2.
     * @return the longTermFuelBank2
     */
    public int getLongTermFuelBank2() {
        return longTermFuelBank2;
    }

    /**
     * Setter method for longTermFuelBank2.
     * @param longTermFuelBank2 the longTermFuelBank2 to set
     */
    public void setLongTermFuelBank2(int longTermFuelBank2) {
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