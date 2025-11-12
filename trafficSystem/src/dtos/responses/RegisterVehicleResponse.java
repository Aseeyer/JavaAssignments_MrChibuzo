package dtos.responses;

public class RegisterVehicleResponse {
    private final int id;
    private final String plateNumber;
    private final String message;

    public RegisterVehicleResponse(int id, String plateNumber, String message) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.message = message;
    }

    public int getId() { return id; }
    public String getPlateNumber() { return plateNumber; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "RegisterVehicleResponse{id=" + id + ", plateNumber='" + plateNumber + "', message='" + message + "'}";
    }
}
