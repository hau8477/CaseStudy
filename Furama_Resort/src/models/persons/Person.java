package models.persons;

public abstract class Person {
    private String fullName;
    private String dayOfBirth;
    private String gender;
    private String citizenID;
    private String phoneNumber;
    private String email;

    protected Person() {
    }

    protected Person(String fullName, String dayOfBirth, String gender,
                  String citizenID, String phoneNumber, String email) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.citizenID = citizenID;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAll(String fullName, String dayOfBirth,
                       String gender, String citizenID, String phoneNumber, String email){
        this.setFullName(fullName);
        this.setDayOfBirth(dayOfBirth);
        this.setGender(gender);
        this.citizenID = citizenID;
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);

    }

    @Override
    public String toString() {
        return "fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", citizenID='" + citizenID + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' ;
    }
}
