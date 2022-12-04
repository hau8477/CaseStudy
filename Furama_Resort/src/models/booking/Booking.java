package models.booking;

public class Booking {
    private String bookingID;
    private String startDay;
    private String endDay;
    private String customerID;
    private String nameService;

    public Booking() {
    }

    public Booking(String bookingID, String startDay, String endDay, String customerID, String nameService) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.nameService = nameService;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerID='" + customerID + '\'' +
                ", nameService='" + nameService + '\'' +
                '}';
    }
}
