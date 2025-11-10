package data.repositories;

import data.models.Vehicle;
import exceptions.IdNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehiclesRepository {
    private int count = 0;
    private final List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public Vehicle save(Vehicle vehicle) {
        generateId(vehicle);
        vehicles.add(vehicle);
        return vehicle;
    }

    private void generateId(Vehicle vehicle) {
        count++;
        vehicle.setId(count);
    }

    @Override
    public int getSize() {
        return vehicles.size();
    }

    @Override
    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }

    @Override
    public Vehicle findById(int id) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IdNotFoundException("Vehicle with id " + id + " not found"));
    }

    @Override
    public List<Vehicle> findAll() {
        return new ArrayList<>(vehicles);
    }

    @Override
    public void deleteById(int id) {
        boolean removed = vehicles.removeIf(vehicle -> vehicle.getId() == id);
        if (!removed) {
            throw new IdNotFoundException("Vehicle with id " + id + " not found");
        }
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
        count = 0;
    }

    @Override
    public Vehicle delete(Vehicle vehicle) {
        boolean removed = vehicles.remove(vehicle);
        return removed ? vehicle : null;
    }

    @Override
    public long count() {
        return vehicles.size();
    }
}
