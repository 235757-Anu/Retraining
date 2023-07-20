package org.example;

public class Address
{
    private int no;
    private String streetName;
    private String city;
    private String state;
    private long pinCode;

    public int getNo() {
        return no;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public Address(int no, String streetName, String city, String state, long pinCode) {
        this.no = no;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
}
