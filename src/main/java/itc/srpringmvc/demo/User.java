package itc.srpringmvc.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

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

        ageScale.add( "Ml(0-7)");
        ageScale.add("Ot (7-14)");
        ageScale.add( "YM (14-33)");
        ageScale.add("AM (33-59)");
        ageScale.add("OM (59-...)");

        rights.add("Read");
        rights.add("Write");
        rights.add("Update");
        rights.add("Delete");
    }

    private List<String> rights = new ArrayList<>();
    private List<String> choosenRights = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @NotNull(message = "Обязательное поле")
    @Size(min = 3, message = "Как минимум 3")
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

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public List<String> getAgeScale() {
        return ageScale;
    }

    public void setAgeScale(ArrayList<String> ageScale) {
        this.ageScale = ageScale;
    }

    private List<String> ageScale = new ArrayList<>();

    private String age;

    public void setAgeScale(List<String> ageScale) {
        this.ageScale = ageScale;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getRights() {
        return rights;
    }

    public void setRights(List<String> rights) {
        this.rights = rights;
    }

    public List<String> getChoosenRights() {
        return choosenRights;
    }

    public void setChoosenRights(List<String> choosenRights) {
        this.choosenRights = choosenRights;
    }
}
