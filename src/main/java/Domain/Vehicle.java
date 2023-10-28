package Domain;

import java.util.Objects;

/**
 * Represents a vehicle with its unique ID, type, class, engine configuration, transmission, drive wheels, and weight.
 */
public class Vehicle implements Comparable<Vehicle> {
    int vehID;
    String vehicleType;
    String vehicleClass;
    String engineConfiguration;
    String transmission;
    String driveWheels;
    int weight;

    /**
     * Constructs a new Vehicle object with the given parameters.
     *
     * @param vehID the unique ID of the vehicle
     * @param vehicleType the type of the vehicle
     * @param vehicleClass the class of the vehicle
     * @param engineConfiguration the engine configuration of the vehicle
     * @param transmission the transmission of the vehicle
     * @param driveWheels the drive wheels of the vehicle
     * @param weight the weight of the vehicle
     */
    public Vehicle(int vehID, String vehicleType, String vehicleClass, String engineConfiguration, String transmission, String driveWheels, int weight) {
        setVehID(vehID);
        setVehicleType(vehicleType);
        setVehicleClass(vehicleClass);
        setEngineConfiguration(engineConfiguration);
        setTransmission(transmission);
        setDriveWheels(driveWheels);
        setWeight(weight);
    }

    public Vehicle(int vehID) {
        setVehID(vehID);
    }

    /**
     * Returns the unique ID of the vehicle.
     *
     * @return the unique ID of the vehicle
     */
    public int getVehID() {
        return vehID;
    }

    /**
     * Sets the unique ID of the vehicle.
     *
     * @param vehID the unique ID of the vehicle
     */
    public void setVehID(int vehID) {
        this.vehID = vehID;
    }

    /**
     * Returns the type of the vehicle.
     *
     * @return the type of the vehicle
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the type of the vehicle.
     *
     * @param vehicleType the type of the vehicle
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Returns the class of the vehicle.
     *
     * @return the class of the vehicle
     */
    public String getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Sets the class of the vehicle.
     *
     * @param vehicleClass the class of the vehicle
     */
    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    /**
     * Returns the engine configuration of the vehicle.
     *
     * @return the engine configuration of the vehicle
     */
    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    /**
     * Sets the engine configuration of the vehicle.
     *
     * @param engineConfiguration the engine configuration of the vehicle
     */
    public void setEngineConfiguration(String engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    /**
     * Returns the transmission of the vehicle.
     *
     * @return the transmission of the vehicle
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * Sets the transmission of the vehicle.
     *
     * @param transmission the transmission of the vehicle
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /**
     * Returns the drive wheels of the vehicle.
     *
     * @return the drive wheels of the vehicle
     */
    public String getDriveWheels() {
        return driveWheels;
    }

    /**
     * Sets the drive wheels of the vehicle.
     *
     * @param driveWheels the drive wheels of the vehicle
     */
    public void setDriveWheels(String driveWheels) {
        this.driveWheels = driveWheels;
    }

    /**
     * Returns the weight of the vehicle.
     *
     * @return the weight of the vehicle
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the vehicle.
     *
     * @param weight the weight of the vehicle
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the object to compare to
     * @return true if this object is the same as the o argument; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehID == vehicle.vehID;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(vehID);
    }

    public int compareTo(Vehicle v) {
        return this.vehID - v.vehID;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehID=" + vehID +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", engineConfiguration='" + engineConfiguration + '\'' +
                ", transmission='" + transmission + '\'' +
                ", driveWheels='" + driveWheels + '\'' +
                ", weight=" + weight +
                '}';
    }
}