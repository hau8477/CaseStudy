package models.facilitys;

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
    public String toString() {
        return "nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentCost=" + rentCost +
                ", maxPerson=" + maxPerson +
                ", rentalType='" + rentalType + '\'';
    }


}
