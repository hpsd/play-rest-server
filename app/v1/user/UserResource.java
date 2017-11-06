package v1.user;

import java.util.ArrayList;
import java.util.List;

public class UserResource {

    private Long id;
    private String name;
    private String email;
    private String address1;
    private String address2;
    private String townCity;
    private Integer postCode;
    private String country;
    private List<String> telephoneList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(final Integer postCode) {
        this.postCode = postCode;
    }

    public String getTownCity() {
        return townCity;
    }

    public void setTownCity(final String townCity) {
        this.townCity = townCity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public List<String> getTelephoneList() {
        return telephoneList;
    }

    public void setTelephoneList(final List<String> telephoneList) {
        this.telephoneList = telephoneList;
    }
}