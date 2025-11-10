package data.repositories;

import data.models.Vehicle;
import java.util.List;

public interface VehiclesRepository {
    Vehicle save(Vehicle vehicle);

    int getSize();

    Vehicle findById(int id);
    List<Vehicle> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Vehicle vehicle);
    long count();

}