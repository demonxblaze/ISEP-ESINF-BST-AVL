package Domain;

public class VehicleApagar {

    private int vehID;
    private String type;
    private String vehClass;
    private String engConfig;
    private String transmission;
    private String driveWheels;
    private int weight;


    public VehicleApagar(int vehID, String type, String vehClass, String engConfig, String transmission, String driveWheels, int weight) {
        setVehID(vehID);
        setType(type);
        setVehClass(vehClass);
        setEngConfig(engConfig);
        setTransmission(transmission);
        setDriveWheels(driveWheels);
        setWeight(weight);
    }

    public int getVehID() {
        return vehID;
    }

    public void setVehID(int vehID) {
        this.vehID = vehID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehClass() {
        return vehClass;
    }

    public void setVehClass(String vehClass) {
        this.vehClass = vehClass;
    }

    public String getEngConfig() {
        return engConfig;
    }

    public void setEngConfig(String engConfig) {
        this.engConfig = engConfig;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDriveWheels() {
        return driveWheels;
    }

    public void setDriveWheels(String driveWheels) {
        this.driveWheels = driveWheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
