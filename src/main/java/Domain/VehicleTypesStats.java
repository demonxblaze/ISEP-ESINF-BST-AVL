package Domain;

public class VehicleTypesStats {
     private double PHEVCurrentSpeed;
    private double PHEVMaxSpeed;
    private double PHEVMinSpeed;
    private double PHEVAvgSpeed;
    private double PHEVCurrentLoad;
    private double PHEVMaxLoad;
    private double PHEVMinLoad;
    private double PHEVAvgLoad;
    private double PHEVCurrentOAT;
    private double PHEVMaxOAT;
    private double PHEVMinOAT;
    private double PHEVAvgOAT;
    private int PHEVCount;

    private double HEVCurrentSpeed;
    private double HEVMaxSpeed;
    private double HEVMinSpeed;
    private double HEVAvgSpeed;
    private double HEVCurrentLoad;
    private double HEVMaxLoad;
    private double HEVMinLoad;
    private double HEVAvgLoad;
    private double HEVCurrentOAT;
    private double HEVMaxOAT;
    private double HEVMinOAT;
    private double HEVAvgOAT;
    private int HEVCount;

private double ICECurrentSpeed;
    private double ICEMaxSpeed;
    private double ICEMinSpeed;
    private double ICEAvgSpeed;
    private double ICECurrentLoad;
    private double ICEMaxLoad;
    private double ICEMinLoad;
    private double ICEAvgLoad;
    private double ICECurrentOAT;
    private double ICEMaxOAT;
    private double ICEMinOAT;
    private double ICEAvgOAT;
    private int ICECount;


    public VehicleTypesStats(){
        this.PHEVMaxSpeed = 0;
        this.PHEVMinSpeed = 0;
        this.PHEVAvgSpeed = 0;
        this.PHEVMaxLoad = 0;
        this.PHEVMinLoad = 0;
        this.PHEVAvgLoad = 0;
        this.PHEVMaxOAT = 0;
        this.PHEVMinOAT = 0;
        this.PHEVAvgOAT = 0;
        this.HEVMaxSpeed = 0;
        this.HEVMinSpeed = 0;
        this.HEVAvgSpeed = 0;
        this.HEVMaxLoad = 0;
        this.HEVMinLoad = 0;
        this.HEVAvgLoad = 0;
        this.HEVMaxOAT = 0;
        this.HEVMinOAT = 0;
        this.HEVAvgOAT = 0;
        this.ICEMaxSpeed = 0;
        this.ICEMinSpeed = 0;
        this.ICEAvgSpeed = 0;
        this.ICEMaxLoad = 0;
        this.ICEMinLoad = 0;
        this.ICEAvgLoad = 0;
        this.ICEMaxOAT = 0;
        this.ICEMinOAT = 0;
        this.ICEAvgOAT = 0;
        this.PHEVCount=0;
        this.HEVCount=0;
        this.ICECount=0;
        this.HEVCurrentLoad=0;
        this.HEVCurrentOAT=0;
        this.HEVCurrentSpeed=0;
        this.PHEVCurrentLoad=0;
        this.PHEVCurrentOAT=0;
        this.PHEVCurrentSpeed=0;
        this.ICECurrentLoad=0;
        this.ICECurrentOAT=0;
        this.ICECurrentSpeed=0;

    }

    public void checkPHEVSpeed(double speed){
        PHEVCurrentSpeed+=speed;
        PHEVCount++;
       
        if(speed>this.PHEVMaxSpeed){
            setPHEVMaxSpeed(speed);
        }
        if(speed<this.PHEVMinSpeed){
            setPHEVMinSpeed(speed);
            
        }
        setPHEVAvgSpeed(PHEVCurrentSpeed/PHEVCount);

    }
    public void checkHEVSpeed(double speed){
        HEVCount++;
        if(speed>this.HEVMaxSpeed){
            setHEVMaxSpeed(speed);
        }
        if(speed<this.HEVMinSpeed){
            setHEVMinSpeed(speed);
        }
        setHEVAvgSpeed(HEVCurrentSpeed/HEVCount);
    }
    public void checkICESpeed(double speed){
        ICECount++;
        if(speed>this.ICEMaxSpeed){
            setICEMaxSpeed(speed);
        }
        if(speed<this.ICEMinSpeed){
            setICEMinSpeed(speed);
        }
        setICEAvgSpeed(ICECurrentSpeed/ICECount);
    }
    public void checkPHEVLoad(double load){
        PHEVCount++;
        if(load>this.PHEVMaxLoad){
            setPHEVMaxLoad(load);
        }
        if(load<this.PHEVMinLoad){
            setPHEVMinLoad(load);
        }
        setPHEVAvgLoad(PHEVCurrentLoad/PHEVCount);
    }
    public void checkHEVLoad(double load){
        HEVCount++;
        if(load>this.HEVMaxLoad){
            setHEVMaxLoad(load);
        }
        if(load<this.HEVMinLoad){
            setHEVMinLoad(load);
        }
        setHEVAvgLoad(HEVCurrentLoad/HEVCount);
    }
    public void checkICELoad(double load){
        ICECount++;
        if(load>this.ICEMaxLoad){
            setICEMaxLoad(load);
        }
        if(load<this.ICEMinLoad){
            setICEMinLoad(load);
        }
        setICEAvgLoad(ICECurrentLoad/ICECount);
    }   
    public void checkPHEVOAT(double oat){
        PHEVCount++;
        if(oat>this.PHEVMaxOAT){
            setPHEVMaxOAT(oat);
        }
        if(oat<this.PHEVMinOAT){
            setPHEVMinOAT(oat);
        }
        setPHEVAvgOAT(PHEVCurrentOAT/PHEVCount);
    }
    public void checkHEVOAT(double oat){
        HEVCount++;
        if(oat>this.HEVMaxOAT){
            setHEVMaxOAT(oat);
        }
        if(oat<this.HEVMinOAT){
            setHEVMinOAT(oat);
        }
        setHEVAvgOAT(HEVCurrentOAT/HEVCount);
    }
    public void checkICEOAT(double oat){
        ICECount++;
        if(oat>this.ICEMaxOAT){
            setICEMaxOAT(oat);
        }
        if(oat<this.ICEMinOAT){
            setICEMinOAT(oat);
        }
        setICEAvgOAT(ICECurrentOAT/ICECount);
    }

   

    public double getPHEVMaxSpeed() {
        return PHEVMaxSpeed;
    }

    private void setPHEVMaxSpeed(double PHEVMaxSpeed) {
        this.PHEVMaxSpeed = PHEVMaxSpeed;
        
        
    }

    public double getPHEVMinSpeed() {
        return PHEVMinSpeed;

    }

    private void setPHEVMinSpeed(double PHEVMinSpeed) {
            this.PHEVMinSpeed = PHEVMinSpeed;     
    }

    public double getPHEVAvgSpeed() {
        return PHEVAvgSpeed;
    }

    private void setPHEVAvgSpeed(double PHEVAvgSpeed) {
        this.PHEVAvgSpeed = PHEVAvgSpeed;
        
    }

    public double getPHEVMaxLoad() {
        return PHEVMaxLoad;
    }

    private void setPHEVMaxLoad(double PHEVMaxLoad) {
        this.PHEVMaxLoad = PHEVMaxLoad;
    }

    public double getPHEVMinLoad() {
        return PHEVMinLoad;
    }

    private void setPHEVMinLoad(double PHEVMinLoad) {
        this.PHEVMinLoad = PHEVMinLoad;
    }

    public double getPHEVAvgLoad() {
        return PHEVAvgLoad;
    }

    private void setPHEVAvgLoad(double PHEVAvgLoad) {
        this.PHEVAvgLoad = PHEVAvgLoad;
    }

    public double getPHEVMaxOAT() {
        return PHEVMaxOAT;
    }

    private void setPHEVMaxOAT(double PHEVMaxOAT) {
        this.PHEVMaxOAT = PHEVMaxOAT;
    }

    public double getPHEVMinOAT() {
        return PHEVMinOAT;
    }

    private void setPHEVMinOAT(double PHEVMinOAT) {
        this.PHEVMinOAT = PHEVMinOAT;
    }

    public double getPHEVAvgOAT() {
        return PHEVAvgOAT;
    }

    private void setPHEVAvgOAT(double PHEVAvgOAT) {
        this.PHEVAvgOAT = PHEVAvgOAT;
    }

    public double getHEVMaxSpeed() {
        return HEVMaxSpeed;
    }

    private void setHEVMaxSpeed(double HEVMaxSpeed) {
        this.HEVMaxSpeed = HEVMaxSpeed;
    }

    public double getHEVMinSpeed() {
        return HEVMinSpeed;
    }

    private void setHEVMinSpeed(double HEVMinSpeed) {
        this.HEVMinSpeed = HEVMinSpeed;
    }

    public double getHEVAvgSpeed() {
        return HEVAvgSpeed;
    }

    private void setHEVAvgSpeed(double HEVAvgSpeed) {
        this.HEVAvgSpeed = HEVAvgSpeed;
    }

    public double getHEVMaxLoad() {
        return HEVMaxLoad;
    }

    private void setHEVMaxLoad(double HEVMaxLoad) {
        this.HEVMaxLoad = HEVMaxLoad;
    }

    public double getHEVMinLoad() {
        return HEVMinLoad;
    }

    private void setHEVMinLoad(double HEVMinLoad) {
        this.HEVMinLoad = HEVMinLoad;
    }

    public double getHEVAvgLoad() {
        return HEVAvgLoad;
    }

    private void setHEVAvgLoad(double HEVAvgLoad) {
        this.HEVAvgLoad = HEVAvgLoad;
    }

    public double getHEVMaxOAT() {
        return HEVMaxOAT;
    }

    private void setHEVMaxOAT(double HEVMaxOAT) {
        this.HEVMaxOAT = HEVMaxOAT;
    }

    public double getHEVMinOAT() {
        return HEVMinOAT;
    }

    private void setHEVMinOAT(double HEVMinOAT) {
        this.HEVMinOAT = HEVMinOAT;
    }

    public double getHEVAvgOAT() {
        return HEVAvgOAT;
    }

    private void setHEVAvgOAT(double HEVAvgOAT) {
        this.HEVAvgOAT = HEVAvgOAT;
    }

    public double getICEMaxSpeed() {
        return ICEMaxSpeed;
    }

    private void setICEMaxSpeed(double ICEMaxSpeed) {
        this.ICEMaxSpeed = ICEMaxSpeed;
    }

    public double getICEMinSpeed() {
        return ICEMinSpeed;
    }

    private void setICEMinSpeed(double ICEMinSpeed) {
        this.ICEMinSpeed = ICEMinSpeed;
    }

    public double getICEAvgSpeed() {
        return ICEAvgSpeed;
    }

    private void setICEAvgSpeed(double ICEAvgSpeed) {
        this.ICEAvgSpeed = ICEAvgSpeed;
    }

    public double getICEMaxLoad() {
        return ICEMaxLoad;
    }

    private void setICEMaxLoad(double ICEMaxLoad) {
        this.ICEMaxLoad = ICEMaxLoad;
    }

    public double getICEMinLoad() {
        return ICEMinLoad;
    }

    private void setICEMinLoad(double ICEMinLoad) {
        this.ICEMinLoad = ICEMinLoad;
    }

    public double getICEAvgLoad() {
        return ICEAvgLoad;
    }

    private void setICEAvgLoad(double ICEAvgLoad) {
        this.ICEAvgLoad = ICEAvgLoad;
    }

    public double getICEMaxOAT() {
        return ICEMaxOAT;
    }

    private void setICEMaxOAT(double ICEMaxOAT) {
        this.ICEMaxOAT = ICEMaxOAT;
    }

    public double getICEMinOAT() {
        return ICEMinOAT;
    }

    private void setICEMinOAT(double ICEMinOAT) {
        this.ICEMinOAT = ICEMinOAT;
    }

    public double getICEAvgOAT() {
        return ICEAvgOAT;
    }

    private void setICEAvgOAT(double ICEAvgOAT) {
        this.ICEAvgOAT = ICEAvgOAT;
    }
}
