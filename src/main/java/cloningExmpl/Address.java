package cloningExmpl;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
