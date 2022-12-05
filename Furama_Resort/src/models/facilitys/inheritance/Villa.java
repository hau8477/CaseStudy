package models.facilitys.inheritance;

import models.facilitys.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String floorNumbers;

    public Villa() {
    }

    public Villa(String nameService, String useArea, String rentCost, String maxPerson, String rentalType,
                 String roomStandard, String poolArea, String floorNumbers) {
        super(nameService, useArea, rentCost, maxPerson, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
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
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumbers=" + floorNumbers +
                '}';
    }
}
