package itc.srpringmvc.demo;

import itc.srpringmvc.demo.validation.PasswordWithoutLetter;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class User {
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    private LinkedHashMap<String, String> countryOptions;

    public User() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("GE", "Georgia");
        countryOptions.put("RU", "Russia");
        countryOptions.put("SB", "Serbia");
        countryOptions.put("GR", "Greece");

        ageScale.add("Ml (0-7)");
        ageScale.add("Ot (7-14)");
        ageScale.add("YM (14-33)");
        ageScale.add("AM (33-59)");
        ageScale.add("OM (59-...)");

        rights.add("Read");
        rights.add("Write");
        rights.add("Update");
        rights.add("Delete");
    }

    private List<String> rights = new ArrayList<>();

    @NotEmpty(message = "choose permissions")
    private List<String> choosenRights = new ArrayList<>();

    @Min(value = 2, message = "are you kidding me?")
    @Max(value = 10000000, message = "too big")
    private Integer salary;

    @NotNull
    @Size(min = 2, max = 15)
    private String lastName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    @PasswordWithoutLetter(value = 'Z')
    private String password;

    @NotNull(message = "choose your age")
    private String age;

    @NotNull
    @Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:" +
            "[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:" +
            "[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:" +
            "(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\" +
            "[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])", message = "no, pleeeease!")
    private String eMail;

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}
