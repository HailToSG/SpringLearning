package itc.srpringmvc.demo;

import java.util.LinkedHashMap;

public class User {
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    private LinkedHashMap<String ,String > countryOptions;

    public User(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("GE", "Georgia");
        countryOptions.put("RU", "Russia");
        countryOptions.put("SB", "Serbia");
        countryOptions.put("GR", "Greece");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;
}
