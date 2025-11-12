package dtos.request;

import data.models.Gender;

public class RegisterOfficerRequest {
    private final int badgeNumber;
    private final String officerName;
    private final String rank;
    private final Gender gender;

    public RegisterOfficerRequest(int badgeNumber, String officerName, String rank, Gender gender) {
        this.badgeNumber = badgeNumber;
        this.officerName = officerName;
        this.rank = rank;
        this.gender = gender;
    }

    public int getBadgeNumber() { return badgeNumber; }
    public String getOfficerName() { return officerName; }
    public String getRank() { return rank; }
    public Gender getGender() { return gender; }
}
