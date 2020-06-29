package sample;

public class User {
    private String firstname;
    private String secondname;
    private String middlename;
    private String country;
    private String city;
    private String email;
    private String password;
    private String gender;

    public User(String firstname, String secondname, String middlename,
                String country, String city, String email,
                String password, String gender) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.middlename = middlename;
        this.country = country;
        this.city = city;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public User() {}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
