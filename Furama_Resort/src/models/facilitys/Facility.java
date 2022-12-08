package models.facilitys;

import java.util.Objects;

public abstract class Facility {
    private String serviceID;
    private String nameService;
    private String useArea;
    private String rentCost;
    private String maxPerson;
    private String rentalType;

    protected Facility() {
    }

    protected Facility(String serviceID, String nameService,
                       String useArea, String rentCost, String maxPerson, String rentalType) {
        this.serviceID = serviceID;
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentCost = rentCost;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    protected Facility(String[] array) {
        this.serviceID = array[0];
        this.nameService = array[1];
        this.useArea = array[2];
        this.rentCost = array[3];
        this.maxPerson = array[4];
        this.rentalType = array[5];
    }

    protected String formatCSVFacility() {
        return serviceID + "," + nameService + "," + useArea + ","
                + rentCost + "," + maxPerson + "," + rentalType;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
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
        return Objects.equals(nameService, facility.nameService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameService);
    }



    @Override
    public String toString() {
        return "Facility{" +
                "serviceID='" + serviceID + '\'' +
                ", nameService='" + nameService + '\'' +
                ", useArea='" + useArea + '\'' +
                ", rentCost='" + rentCost + '\'' +
                ", maxPerson='" + maxPerson + '\'' +
                ", rentalType='" + rentalType + '\'';
    }
}
