package webdemo.Services;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by exastax-03 on 7/14/2017.
 */
public class MyAddress {

    @Id
    private String id;

    @Indexed
    private String Address;
    private String City;
    private String State;
    private String Zipcode;

    public MyAddress(String id, String address, String city, String state, String zipcode) {
        this.id = id;
        Address = address;
        City = city;
        State = state;
        Zipcode = zipcode;
    }

    public MyAddress() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }
}
