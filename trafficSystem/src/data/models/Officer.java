package data.models;

public class Officer {
    private int badgeNumber;
    private String officerName;
    private String rank;
    private Gender gender;

    public Officer(int badgeNumber) {
        this.badgeNumber = badgeNumber;
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
                ", officerName='" + (officerName != null ? officerName : "N/A") + '\'' +
                ", rank='" + (rank != null ? rank : "N/A") + '\'' +
                ", gender=" + (gender != null ? gender : "N/A") +
                '}';
    }
}
