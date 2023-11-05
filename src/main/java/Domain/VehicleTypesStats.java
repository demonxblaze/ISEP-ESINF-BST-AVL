package Domain;

import java.util.Objects;

public class VehicleTypesStats {
     private double PHEVCurrentSpeed;
     private double PHEVSpeedCount, HEVSpeedCount,ICESpeedCount;
     private  double PHEVLoadCount, HEVLoadCount,ICELoadCount;
     private double PHEVOATCount, HEVOATCount,ICEOATCount;

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
        this.HEVCurrentLoad=0;
        this.HEVCurrentOAT=0;
        this.HEVCurrentSpeed=0;
        this.PHEVCurrentLoad=0;
        this.PHEVCurrentOAT=0;
        this.PHEVCurrentSpeed=0;
        this.ICECurrentLoad=0;
        this.ICECurrentOAT=0;
        this.ICECurrentSpeed=0;
        this.PHEVSpeedCount=0;
        this.HEVSpeedCount=0;
        this.ICESpeedCount=0;
        this.PHEVLoadCount=0;
        this.HEVLoadCount=0;
        this.ICELoadCount=0;
        this.PHEVOATCount=0;
        this.HEVOATCount=0;
        this.ICEOATCount=0;


    }
    public void checkPHEV(double speed, double load, double oat){
        //in my if i want to check if speed is NaN:
        //

        if (!Double.isNaN(speed)) checkPHEVSpeed(speed);
        if (!Double.isNaN(load)) checkPHEVLoad(load);
        if (!Double.isNaN(oat)) checkPHEVOAT(oat);

    }
    public void checkHEV(double speed, double load, double oat){

       if (!Double.isNaN(speed)) checkHEVSpeed(speed);
        if (!Double.isNaN(load))  checkHEVLoad(load);
        if (!Double.isNaN(oat)) checkHEVOAT(oat);
    }
    public void checkICE(double speed, double load, double oat){

        if (!Double.isNaN(speed))  checkICESpeed(speed);
        if (!Double.isNaN(load)) checkICELoad(load);
        if (!Double.isNaN(oat)) checkICEOAT(oat);
    }

    private void checkPHEVSpeed(double speed){
        PHEVSpeedCount++;
        PHEVCurrentSpeed+=speed;
        if(speed>this.PHEVMaxSpeed){
            setPHEVMaxSpeed(speed);
        }
        if(speed<this.PHEVMinSpeed){
            setPHEVMinSpeed(speed);
            
        }
        setPHEVAvgSpeed(PHEVCurrentSpeed/PHEVSpeedCount);

    }
    private void checkHEVSpeed(double speed){
       HEVSpeedCount++;
         HEVCurrentSpeed+=speed;
        if(speed>this.HEVMaxSpeed){
            setHEVMaxSpeed(speed);
        }
        if(speed<this.HEVMinSpeed){
            setHEVMinSpeed(speed);
        }
        setHEVAvgSpeed(HEVCurrentSpeed/HEVSpeedCount);
    }
    private void checkICESpeed(double speed){
       ICESpeedCount++;
        ICECurrentSpeed+=speed;
        if(speed>this.ICEMaxSpeed){
            setICEMaxSpeed(speed);
        }
        if(speed<this.ICEMinSpeed){
            setICEMinSpeed(speed);
        }
        setICEAvgSpeed(ICECurrentSpeed/ ICESpeedCount);
    }
    private void checkPHEVLoad(double load){
        PHEVLoadCount++;
        PHEVCurrentLoad+=load;
        if(load>this.PHEVMaxLoad){
            setPHEVMaxLoad(load);
        }
        if(load<this.PHEVMinLoad){
            setPHEVMinLoad(load);
        }
        setPHEVAvgLoad(PHEVCurrentLoad/PHEVLoadCount);
    }
    private void checkHEVLoad(double load){
        HEVLoadCount++;
        HEVCurrentLoad+=load;
        if(load>this.HEVMaxLoad){
            setHEVMaxLoad(load);
        }
        if(load<this.HEVMinLoad){
            setHEVMinLoad(load);
        }
        setHEVAvgLoad(HEVCurrentLoad/HEVLoadCount);
    }
    public void checkICELoad(double load){
        ICELoadCount++;
        ICECurrentLoad+=load;
        
        if(load>this.ICEMaxLoad){
            setICEMaxLoad(load);
        }
        if(load<this.ICEMinLoad){
            setICEMinLoad(load);
        }
        setICEAvgLoad(ICECurrentLoad/ICELoadCount);
    }   
    private void checkPHEVOAT(double oat){
        PHEVOATCount++;
        PHEVCurrentOAT+=oat;
        if(oat>this.PHEVMaxOAT){
            setPHEVMaxOAT(oat);
        }
        if(oat<this.PHEVMinOAT){
            setPHEVMinOAT(oat);
        }
        setPHEVAvgOAT(PHEVCurrentOAT/PHEVOATCount);
    }
    private void checkHEVOAT(double oat){
        HEVOATCount++;
        HEVCurrentOAT+=oat;
        if(oat>this.HEVMaxOAT){
            setHEVMaxOAT(oat);
        }
        if(oat<this.HEVMinOAT){
            setHEVMinOAT(oat);
        }
        setHEVAvgOAT(HEVCurrentOAT/HEVOATCount);
    }
    private void checkICEOAT(double oat){
        ICEOATCount++;
        ICECurrentOAT+=oat;
        if(oat>this.ICEMaxOAT){
            setICEMaxOAT(oat);
        }
        if(oat<this.ICEMinOAT){
            setICEMinOAT(oat);
        }
        setICEAvgOAT(ICECurrentOAT/ICEOATCount);
    }

   

    public double getPHEVMaxSpeed() {
        return PHEVMaxSpeed;
    }

    public void setPHEVMaxSpeed(double PHEVMaxSpeed) {
        this.PHEVMaxSpeed = PHEVMaxSpeed;
        
        
    }

    public double getPHEVMinSpeed() {
        return PHEVMinSpeed;

    }

    public void setPHEVMinSpeed(double PHEVMinSpeed) {
            this.PHEVMinSpeed = PHEVMinSpeed;     
    }

    public double getPHEVAvgSpeed() {
        return PHEVAvgSpeed;
    }

    public void setPHEVAvgSpeed(double PHEVAvgSpeed) {
        this.PHEVAvgSpeed = PHEVAvgSpeed;
        
    }

    public double getPHEVMaxLoad() {
        return PHEVMaxLoad;
    }

    public void setPHEVMaxLoad(double PHEVMaxLoad) {
        this.PHEVMaxLoad = PHEVMaxLoad;
    }

    public double getPHEVMinLoad() {
        return PHEVMinLoad;
    }

    public void setPHEVMinLoad(double PHEVMinLoad) {
        this.PHEVMinLoad = PHEVMinLoad;
    }

    public double getPHEVAvgLoad() {
        return PHEVAvgLoad;
    }

    public void setPHEVAvgLoad(double PHEVAvgLoad) {
        this.PHEVAvgLoad = PHEVAvgLoad;
    }

    public double getPHEVMaxOAT() {
        return PHEVMaxOAT;
    }

    public void setPHEVMaxOAT(double PHEVMaxOAT) {
        this.PHEVMaxOAT = PHEVMaxOAT;
    }

    public double getPHEVMinOAT() {
        return PHEVMinOAT;
    }

    public void setPHEVMinOAT(double PHEVMinOAT) {
        this.PHEVMinOAT = PHEVMinOAT;
    }

    public double getPHEVAvgOAT() {
        return PHEVAvgOAT;
    }

    public void setPHEVAvgOAT(double PHEVAvgOAT) {
        this.PHEVAvgOAT = PHEVAvgOAT;
    }

    public double getHEVMaxSpeed() {
        return HEVMaxSpeed;
    }

    public void setHEVMaxSpeed(double HEVMaxSpeed) {
        this.HEVMaxSpeed = HEVMaxSpeed;
    }

    public double getHEVMinSpeed() {
        return HEVMinSpeed;
    }

    public void setHEVMinSpeed(double HEVMinSpeed) {
        this.HEVMinSpeed = HEVMinSpeed;
    }

    public double getHEVAvgSpeed() {
        return HEVAvgSpeed;
    }

    public void setHEVAvgSpeed(double HEVAvgSpeed) {
        this.HEVAvgSpeed = HEVAvgSpeed;
    }

    public double getHEVMaxLoad() {
        return HEVMaxLoad;
    }

    public void setHEVMaxLoad(double HEVMaxLoad) {
        this.HEVMaxLoad = HEVMaxLoad;
    }

    public double getHEVMinLoad() {
        return HEVMinLoad;
    }

    public void setHEVMinLoad(double HEVMinLoad) {
        this.HEVMinLoad = HEVMinLoad;
    }

    public double getHEVAvgLoad() {
        return HEVAvgLoad;
    }

    public void setHEVAvgLoad(double HEVAvgLoad) {
        this.HEVAvgLoad = HEVAvgLoad;
    }

    public double getHEVMaxOAT() {
        return HEVMaxOAT;
    }

    public void setHEVMaxOAT(double HEVMaxOAT) {
        this.HEVMaxOAT = HEVMaxOAT;
    }

    public double getHEVMinOAT() {
        return HEVMinOAT;
    }

    public void setHEVMinOAT(double HEVMinOAT) {
        this.HEVMinOAT = HEVMinOAT;
    }

    public double getHEVAvgOAT() {
        return HEVAvgOAT;
    }

    public void setHEVAvgOAT(double HEVAvgOAT) {
        this.HEVAvgOAT = HEVAvgOAT;
    }

    public double getICEMaxSpeed() {
        return ICEMaxSpeed;
    }

    public void setICEMaxSpeed(double ICEMaxSpeed) {
        this.ICEMaxSpeed = ICEMaxSpeed;
    }

    public double getICEMinSpeed() {
        return ICEMinSpeed;
    }

    public void setICEMinSpeed(double ICEMinSpeed) {
        this.ICEMinSpeed = ICEMinSpeed;
    }

    public double getICEAvgSpeed() {
        return ICEAvgSpeed;
    }

    public void setICEAvgSpeed(double ICEAvgSpeed) {
        this.ICEAvgSpeed = ICEAvgSpeed;
    }

    public double getICEMaxLoad() {
        return ICEMaxLoad;
    }

    public void setICEMaxLoad(double ICEMaxLoad) {
        this.ICEMaxLoad = ICEMaxLoad;
    }

    public double getICEMinLoad() {
        return ICEMinLoad;
    }

    public void setICEMinLoad(double ICEMinLoad) {
        this.ICEMinLoad = ICEMinLoad;
    }

    public double getICEAvgLoad() {
        return ICEAvgLoad;
    }

    public void setICEAvgLoad(double ICEAvgLoad) {
        this.ICEAvgLoad = ICEAvgLoad;
    }

    public double getICEMaxOAT() {
        return ICEMaxOAT;
    }

    public void setICEMaxOAT(double ICEMaxOAT) {
        this.ICEMaxOAT = ICEMaxOAT;
    }

    public double getICEMinOAT() {
        return ICEMinOAT;
    }

    public void setICEMinOAT(double ICEMinOAT) {
        this.ICEMinOAT = ICEMinOAT;
    }

    public double getICEAvgOAT() {
        return ICEAvgOAT;
    }

    public void setICEAvgOAT(double ICEAvgOAT) {
        this.ICEAvgOAT = ICEAvgOAT;
    }

    @Override
    public String toString() {
        return "VehicleTypesStats{" +
                "\nPHEVCurrentSpeed=" + PHEVCurrentSpeed +
                "\n, PHEVMaxSpeed=" + PHEVMaxSpeed +
                "\n, PHEVMinSpeed=" + PHEVMinSpeed +
                "\n, PHEVAvgSpeed=" + PHEVAvgSpeed +
                "\n, PHEVCurrentLoad=" + PHEVCurrentLoad +
                "\n, PHEVMaxLoad=" + PHEVMaxLoad +
                "\n, PHEVMinLoad=" + PHEVMinLoad +
                "\n, PHEVAvgLoad=" + PHEVAvgLoad +
                "\n, PHEVCurrentOAT=" + PHEVCurrentOAT +
                "\n, PHEVMaxOAT=" + PHEVMaxOAT +
                "\n, PHEVMinOAT=" + PHEVMinOAT +
                "\n, PHEVAvgOAT=" + PHEVAvgOAT +
                "\n, HEVCurrentSpeed=" + HEVCurrentSpeed +
                "\n, HEVMaxSpeed=" + HEVMaxSpeed +
                "\n, HEVMinSpeed=" + HEVMinSpeed +
                "\n, HEVAvgSpeed=" + HEVAvgSpeed +
                "\n, HEVCurrentLoad=" + HEVCurrentLoad +
                "\n, HEVMaxLoad=" + HEVMaxLoad +
                "\n, HEVMinLoad=" + HEVMinLoad +
                "\n, HEVAvgLoad=" + HEVAvgLoad +
                "\n, HEVCurrentOAT=" + HEVCurrentOAT +
                "\n, HEVMaxOAT=" + HEVMaxOAT +
                "\n, HEVMinOAT=" + HEVMinOAT +
                "\n, HEVAvgOAT=" + HEVAvgOAT +
                "\n, ICECurrentSpeed=" + ICECurrentSpeed +
                "\n, ICEMaxSpeed=" + ICEMaxSpeed +
                "\n, ICEMinSpeed=" + ICEMinSpeed +
                "\n, ICEAvgSpeed=" + ICEAvgSpeed +
                "\n, ICECurrentLoad=" + ICECurrentLoad +
                "\n, ICEMaxLoad=" + ICEMaxLoad +
                "\n, ICEMinLoad=" + ICEMinLoad +
                "\n, ICEAvgLoad=" + ICEAvgLoad +
                "\n, ICECurrentOAT=" + ICECurrentOAT +
                "\n, ICEMaxOAT=" + ICEMaxOAT +
                "\n, ICEMinOAT=" + ICEMinOAT +
                "\n, ICEAvgOAT=" + ICEAvgOAT +
                "\n, PHEVSpeedCount=" + PHEVSpeedCount +
                "\n, HEVSpeedCount=" + HEVSpeedCount +
                "\n, ICESpeedCount=" + ICESpeedCount +
                "\n, PHEVLoadCount=" + PHEVLoadCount +
                "\n, HEVLoadCount=" + HEVLoadCount +
                "\n, ICELoadCount=" + ICELoadCount +
                "\n, PHEVOATCount=" + PHEVOATCount +
                "\n, HEVOATCount=" + HEVOATCount +
                "\n, ICEOATCount=" + ICEOATCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleTypesStats that = (VehicleTypesStats) o;
        return Double.compare(PHEVSpeedCount, that.PHEVSpeedCount) == 0 && Double.compare(HEVSpeedCount, that.HEVSpeedCount) == 0 && Double.compare(ICESpeedCount, that.ICESpeedCount) == 0 && Double.compare(PHEVLoadCount, that.PHEVLoadCount) == 0 && Double.compare(HEVLoadCount, that.HEVLoadCount) == 0 && Double.compare(ICELoadCount, that.ICELoadCount) == 0 && Double.compare(PHEVOATCount, that.PHEVOATCount) == 0 && Double.compare(HEVOATCount, that.HEVOATCount) == 0 && Double.compare(ICEOATCount, that.ICEOATCount) == 0 && Double.compare(PHEVMaxSpeed, that.PHEVMaxSpeed) == 0 && Double.compare(PHEVMinSpeed, that.PHEVMinSpeed) == 0 && Double.compare(PHEVAvgSpeed, that.PHEVAvgSpeed) == 0 && Double.compare(PHEVMaxLoad, that.PHEVMaxLoad) == 0 && Double.compare(PHEVMinLoad, that.PHEVMinLoad) == 0 && Double.compare(PHEVAvgLoad, that.PHEVAvgLoad) == 0 && Double.compare(PHEVMaxOAT, that.PHEVMaxOAT) == 0 && Double.compare(PHEVMinOAT, that.PHEVMinOAT) == 0 && Double.compare(PHEVAvgOAT, that.PHEVAvgOAT) == 0 && Double.compare(HEVMaxSpeed, that.HEVMaxSpeed) == 0 && Double.compare(HEVMinSpeed, that.HEVMinSpeed) == 0 && Double.compare(HEVAvgSpeed, that.HEVAvgSpeed) == 0 && Double.compare(HEVMaxLoad, that.HEVMaxLoad) == 0 && Double.compare(HEVMinLoad, that.HEVMinLoad) == 0 && Double.compare(HEVAvgLoad, that.HEVAvgLoad) == 0 && Double.compare(HEVMaxOAT, that.HEVMaxOAT) == 0 && Double.compare(HEVMinOAT, that.HEVMinOAT) == 0 && Double.compare(HEVAvgOAT, that.HEVAvgOAT) == 0 && Double.compare(ICEMaxSpeed, that.ICEMaxSpeed) == 0 && Double.compare(ICEMinSpeed, that.ICEMinSpeed) == 0 && Double.compare(ICEAvgSpeed, that.ICEAvgSpeed) == 0 && Double.compare(ICEMaxLoad, that.ICEMaxLoad) == 0 && Double.compare(ICEMinLoad, that.ICEMinLoad) == 0 && Double.compare(ICEAvgLoad, that.ICEAvgLoad) == 0 && Double.compare(ICEMaxOAT, that.ICEMaxOAT) == 0 && Double.compare(ICEMinOAT, that.ICEMinOAT) == 0 && Double.compare(ICEAvgOAT, that.ICEAvgOAT) == 0;
    }

    public void setPHEVCurrentSpeed(double PHEVCurrentSpeed) {
        this.PHEVCurrentSpeed = PHEVCurrentSpeed;
    }

    public void setPHEVSpeedCount(double PHEVSpeedCount) {
        this.PHEVSpeedCount = PHEVSpeedCount;
    }

    public void setHEVSpeedCount(double HEVSpeedCount) {
        this.HEVSpeedCount = HEVSpeedCount;
    }

    public void setICESpeedCount(double ICESpeedCount) {
        this.ICESpeedCount = ICESpeedCount;
    }

    public void setPHEVLoadCount(double PHEVLoadCount) {
        this.PHEVLoadCount = PHEVLoadCount;
    }

    public void setHEVLoadCount(double HEVLoadCount) {
        this.HEVLoadCount = HEVLoadCount;
    }

    public void setICELoadCount(double ICELoadCount) {
        this.ICELoadCount = ICELoadCount;
    }

    public void setPHEVOATCount(double PHEVOATCount) {
        this.PHEVOATCount = PHEVOATCount;
    }

    public void setHEVOATCount(double HEVOATCount) {
        this.HEVOATCount = HEVOATCount;
    }

    public void setICEOATCount(double ICEOATCount) {
        this.ICEOATCount = ICEOATCount;
    }

    public void setPHEVCurrentLoad(double PHEVCurrentLoad) {
        this.PHEVCurrentLoad = PHEVCurrentLoad;
    }

    public void setPHEVCurrentOAT(double PHEVCurrentOAT) {
        this.PHEVCurrentOAT = PHEVCurrentOAT;
    }

    public void setHEVCurrentSpeed(double HEVCurrentSpeed) {
        this.HEVCurrentSpeed = HEVCurrentSpeed;
    }

    public void setHEVCurrentLoad(double HEVCurrentLoad) {
        this.HEVCurrentLoad = HEVCurrentLoad;
    }

    public void setHEVCurrentOAT(double HEVCurrentOAT) {
        this.HEVCurrentOAT = HEVCurrentOAT;
    }

    public void setICECurrentSpeed(double ICECurrentSpeed) {
        this.ICECurrentSpeed = ICECurrentSpeed;
    }

    public void setICECurrentLoad(double ICECurrentLoad) {
        this.ICECurrentLoad = ICECurrentLoad;
    }

    public void setICECurrentOAT(double ICECurrentOAT) {
        this.ICECurrentOAT = ICECurrentOAT;
    }
}
