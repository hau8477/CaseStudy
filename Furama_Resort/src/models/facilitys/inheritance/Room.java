package models.facilitys.inheritance;

import models.facilitys.Facility;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String nameService, String useArea, String rentCost, String maxPerson, String rentalType,
                String freeServiceIncluded) {
        super(nameService, useArea, rentCost, maxPerson, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Facility{" + super.toString() +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
