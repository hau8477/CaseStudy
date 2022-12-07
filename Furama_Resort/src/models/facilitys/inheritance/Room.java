package models.facilitys.inheritance;

import models.facilitys.Facility;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceID, String nameService, String useArea,
                String rentCost, String maxPerson, String rentalType, String freeServiceIncluded) {
        super(serviceID, nameService, useArea, rentCost, maxPerson, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String[] array){
        super(array);
        this.freeServiceIncluded = array[6];
    }

    public String formatCSV(){
        return super.formatCSV() + "," + freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return super.toString() +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
