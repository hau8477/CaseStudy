package models.facilitys;

public abstract class Facility {
    private String nameService;
    private double useArea;
    private double rentCost;
    private int maxPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String nameService, double useArea, double rentCost, int maxPerson, String rentalType) {
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

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
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
