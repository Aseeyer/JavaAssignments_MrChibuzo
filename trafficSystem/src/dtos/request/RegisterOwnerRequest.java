package dtos.request;

import data.models.Gender;

public class RegisterOwnerRequest {
    private final String id;
    private final String ownerName;
    private final String address;
    private final String phone;
    private final Gender gender;
    private final String email;

    public RegisterOwnerRequest(String id, String ownerName, String address, String phone, Gender gender, String email) {
        this.id = id;
        this.ownerName = ownerName;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
