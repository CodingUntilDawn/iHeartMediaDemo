package iHeartMediaDemo;

public class StationModel {
    private String stationId;
    private String name;
    private boolean hdEnabled;
    private String callSign;

    public String getStationId(){
        return this.stationId;
    }

    public void setStationId(String stationId){
        this.stationId = stationId;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getHdEnabled(){
        return this.hdEnabled;
    }

    public void setHdEnabled(boolean hdEnabled){
        this.hdEnabled = hdEnabled;
    }

    public String getCallSign(){
        return this.callSign;
    }

    public void setCallSign(String callSign){
        this.callSign = callSign;
    }
}
