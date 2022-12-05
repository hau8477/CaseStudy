package models.facilitys;

import java.util.Objects;

public abstract class Facility {
    private String nameService;
    private String useArea;
    private String rentCost;
    private String maxPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String nameService, String useArea, String rentCost, String maxPerson, String rentalType) {
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentCost = rentCost;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUseArea() {
        return useArea;
    }

    public void setUseArea(String useArea) {
        this.useArea = useArea;
    }

    public String getRentCost() {
        return rentCost;
    }

    public void setRentCost(String rentCost) {
        this.rentCost = rentCost;
    }

    public String getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(String maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(nameService, facility.nameService) && Objects.equals(useArea, facility.useArea)
                && Objects.equals(rentCost, facility.rentCost) && Objects.equals(maxPerson, facility.maxPerson)
                && Objects.equals(rentalType, facility.rentalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameService, useArea, rentCost, maxPerson, rentalType);
    }

    @Override
    public String toString() {
        return "nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentCost=" + rentCost +
                ", maxPerson=" + maxPerson +
                ", rentalType='" + rentalType + '\'';
    }

}
