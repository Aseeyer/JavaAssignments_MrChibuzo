package service;

import data.models.Vehicle;
import data.repositories.VehiclesRepository;
import data.repositories.Vehicles;
import dtos.request.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceImplTest {

    private Vehicles vehiclesRepository;
    private VehicleServiceImpl vehicleService;

    @BeforeEach
    void setUp() {
        vehiclesRepository = new Vehicles();
        vehicleService = new VehicleServiceImpl(vehiclesRepository);
    }

    @Test
    void registerVehicle_success() {
        RegisterVehicleRequest request = new RegisterVehicleRequest(
                "Toyota", "Camry", "Black", "ABC123", "owner1", "John Doe"
        );

        RegisterVehicleResponse response = vehicleService.registerVehicle(request);

        assertTrue(response.getId() > 0);
        assertEquals("ABC123", response.getPlateNumber());
        assertEquals("Vehicle registered successfully", response.getMessage());
        assertEquals(1, vehicleService.listAllVehicles().size());
    }

    @Test
    void registerVehicle_duplicatePlate() {
        RegisterVehicleRequest request1 = new RegisterVehicleRequest("Toyota", "Camry", "Black", "ABC123", "owner1", "John Doe");
        RegisterVehicleRequest request2 = new RegisterVehicleRequest("Honda", "Civic", "White", "ABC123", "owner2", "Jane Doe");

        vehicleService.registerVehicle(request1);
        RegisterVehicleResponse response2 = vehicleService.registerVehicle(request2);

        assertEquals(-1, response2.getId());
        assertEquals("Plate number already registered", response2.getMessage());
        assertEquals(1, vehicleService.listAllVehicles().size());
    }

    @Test
    void findVehicleById_success() {
        RegisterVehicleRequest request = new RegisterVehicleRequest("Ford", "Focus", "Red", "XYZ789", "owner3", "Alice");
        vehicleService.registerVehicle(request);

        Vehicle vehicle = vehicleService.findVehicleById(1);
        assertNotNull(vehicle);
        assertEquals("Ford", vehicle.getName());
    }

    @Test
    void deleteVehicleById_success() {
        RegisterVehicleRequest request = new RegisterVehicleRequest("Nissan", "Altima", "Blue", "LMN456", "owner4", "Bob");
        vehicleService.registerVehicle(request);

        assertEquals(1, vehicleService.listAllVehicles().size());
        vehicleService.deleteVehicleById(1);
        assertEquals(0, vehicleService.listAllVehicles().size());
    }

    @Test
    void listAllVehicles_returnsList() {
        vehicleService.registerVehicle(new RegisterVehicleRequest("Toyota", "Corolla", "Grey", "AAA111", "owner5", "Carol"));
        vehicleService.registerVehicle(new RegisterVehicleRequest("Honda", "Civic", "Black", "BBB222", "owner6", "Dave"));

        List<Vehicle> vehicles = vehicleService.listAllVehicles();
        assertEquals(2, vehicles.size());
    }
}
