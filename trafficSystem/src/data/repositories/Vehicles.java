package data.repositories;

import data.models.Vehicle;
import exceptions.IdNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehiclesRepository{
    private int count;
    private final List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        count++;
        return vehicle;
    }

    @Override
    public int getSize() {
        return vehicles.size();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public Vehicle findById(int id) {
        for(int count = 0; count < vehicles.size(); count++){
            Vehicle vehicle = vehicles.get(count);
            if(vehicle.getId() == id){
                return vehicle;
            }
        }
        throw new IdNotFoundException("Vehicle with id " + id + " not found");
    }

    @Override
    public List<Vehicle> findAll() {
        List<Vehicle> Vehicles = new ArrayList<>();
        for(int count = 0; count <  vehicles.size(); count++){
            Vehicle vehicle = vehicles.get(count);
            Vehicles.add(vehicle);
        }
        return Vehicles;
    }

    @Override
    public void deleteById(int id) {
        for(int count = 0; count < vehicles.size(); count++){
            if(vehicles.get(count).getId() == id){
                vehicles.remove(count);
                return;
            }
        }
        throw new IdNotFoundException("Vehicle with id " + id + " not found");
    }

    @Override
    public void deleteAll() {
        for(int count = vehicles.size() - 1; count >= 0; count--) vehicles.remove(count);
    }

    @Override
    public Vehicle delete(Vehicle vehicle) {
        for(int count = 0; count < vehicles.size(); count++){
            Vehicle vehicle1 = vehicles.get(count);
            if(vehicle1.equals(vehicle)){
                vehicles.remove(count);
                return vehicle1;
            }
        }
        return null;
    }

    @Override
    public long count() {
        return count;
    }
}