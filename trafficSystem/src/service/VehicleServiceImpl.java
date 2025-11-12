package service;

import data.models.Vehicle;
import data.repositories.VehiclesRepository;
import dtos.request.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;
import utils.Mapper;

import java.util.List;
import java.util.Objects;

public class VehicleServiceImpl implements VehicleService {

    private final VehiclesRepository repository;

    public VehicleServiceImpl(VehiclesRepository repository) {
        this.repository = Objects.requireNonNull(repository, "repository must not be null");
    }

    @Override
    public RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request) {
        validateRegisterRequest(request);
        Vehicle toSave = Mapper.toVehicle(request);

        boolean plateExists = repository.findAll()
                .stream()
                .anyMatch(vehicle -> vehicle.getPlateNumber() != null && vehicle.getPlateNumber().equalsIgnoreCase(toSave.getPlateNumber()));
        if (plateExists) {
            return new RegisterVehicleResponse(-1, toSave.getPlateNumber(), "Plate number already registered");
        }

        Vehicle saved = repository.save(toSave);
        String msg = "Vehicle registered successfully";
        return new RegisterVehicleResponse(saved.getId(), saved.getPlateNumber(), msg);
    }

    private void validateRegisterRequest(RegisterVehicleRequest request) {
        if (request == null) throw new IllegalArgumentException("request must not be null");
        if (request.getName() == null || request.getName().trim().isEmpty())
            throw new IllegalArgumentException("vehicle name is required");
        if (request.getPlateNumber() == null || request.getPlateNumber().trim().isEmpty())
            throw new IllegalArgumentException("plate number is required");
    }

    @Override
    public Vehicle findVehicleById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Vehicle> listAllVehicles() {
        return repository.findAll();
    }

    @Override
    public void deleteVehicleById(int id) {
        repository.deleteById(id);
    }
}
