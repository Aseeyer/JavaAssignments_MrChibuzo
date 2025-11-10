package data.models;

import java.util.ArrayList;
import java.util.List;

public class Officer {
    private int badgeNumber;
    private String officerName;
    private String rank;
    private Gender gender;

    public Officer(int badgeNumber, String officerName, String rank, List<Ticket> tickets) {
        this.badgeNumber = badgeNumber;
        this.officerName = officerName;
        this.rank = rank;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Officer{" +
                "badgeNumber=" + badgeNumber +
                ", officerName='" + officerName + '\'' +
                ", rank='" + rank +
                '}';
    }

}
