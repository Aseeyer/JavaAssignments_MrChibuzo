package dtos.responses;

public class RegisterOfficerResponse {
    private final int badgeNumber;
    private final String message;

    public RegisterOfficerResponse(int badgeNumber, String message) {
        this.badgeNumber = badgeNumber;
        this.message = message;
    }

    public int getBadgeNumber() { return badgeNumber; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "RegisterOfficerResponse{" +
                "badgeNumber=" + badgeNumber +
                ", message='" + message + '\'' +
                '}';
    }
}
