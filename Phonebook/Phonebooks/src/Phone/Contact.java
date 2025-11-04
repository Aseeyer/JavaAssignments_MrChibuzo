package Phone;

import java.util.*;

public class Contact {
    private final String id;
    private String firstName;
    private String lastName;
    private final List<String> phonesNumbers = new ArrayList<>();
    private String email;
    private String address;
    private final Map<String, String> customFields = new HashMap<>();

    public Contact(String firstName, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String  getId() {
        return id;
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
    public List<String> getPhonesNumbers() {
        return phonesNumbers;
    }

    public void addPhonesNumber(String phone) {
        phonesNumbers.add(phone);
    }
    public void removePhonesNumber(String phone) {
        phonesNumbers.remove(phone);
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String getPrimaryPhone(){
        return phonesNumbers.isEmpty() ? null : phonesNumbers.get(0);
    }



}
