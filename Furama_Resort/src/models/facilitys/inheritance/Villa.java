package models.facilitys.inheritance;

import models.facilitys.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String floorNumbers;

    public Villa() {
    }

    public Villa(String serviceID, String nameService, String useArea, String rentCost, String maxPerson, String rentalType, String roomStandard, String poolArea, String floorNumbers) {
        super(serviceID, nameService, useArea, rentCost, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
    }

    public Villa(String[] array){
        super(array);
        this.roomStandard = array[6];
        this.poolArea = array[7];
        this.floorNumbers = array[8];
    }

    public String formatCSV(){
        return super.formatCSV() + "," + roomStandard + "," + poolArea + "," + floorNumbers;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(String floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    @Override
    public String toString() {
        return super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floorNumbers='" + floorNumbers + '\'' +
                '}';
    }
}
