package service;

import dtos.request.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;
import data.models.Vehicle;

import java.util.List;

public interface VehicleService {
    RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request);
    Vehicle findVehicleById(int id);
    List<Vehicle> listAllVehicles();
    void deleteVehicleById(int id);
}
