package dtos.request;

public class RegisterVehicleRequest {
    private final String name;
    private final String model;
    private final String color;
    private final String plateNumber;
    private final String ownerId;
    private final String ownerName;

    public RegisterVehicleRequest(String name, String model, String color, String plateNumber,
                                  String ownerId, String ownerName) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.plateNumber = plateNumber;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public String getColor() { return color; }
    public String getPlateNumber() { return plateNumber; }
    public String getOwnerId() { return ownerId; }
    public String getOwnerName() { return ownerName; }
}
