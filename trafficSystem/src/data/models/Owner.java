package data.models;

public class Owner {
    private String id;
    private String ownerName;
    private String address;
    private String phone;
    private Gender gender;
    private String email;



    public Owner(String id, String ownerName, String address, String phone, Gender gender, String email) {
        this.id = id;
        this.ownerName = ownerName;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                ", name='" + ownerName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
