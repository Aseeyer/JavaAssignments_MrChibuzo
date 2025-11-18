package service;

import data.models.Gender;
import data.models.Officer;
import data.repositories.Officers;
import dtos.request.RegisterOfficerRequest;
import dtos.responses.RegisterOfficerResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OfficerServiceImplTest {

    private Officers officersRepository;
    private OfficerServiceImpl officerService;

    @BeforeEach
    void setUp() {
        officersRepository = new Officers();
        officerService = new OfficerServiceImpl(officersRepository);
    }

    @Test
    void registerOfficer_success() {
        RegisterOfficerRequest request = new RegisterOfficerRequest(1, "John Doe", "Inspector", Gender.MALE);
        RegisterOfficerResponse response = officerService.registerOfficer(request);

        assertEquals(1, response.getBadgeNumber());
        assertEquals("Officer registered successfully", response.getMessage());
        assertEquals(1, officerService.count());
    }

    @Test
    void registerOfficer_duplicateBadgeNumber() {
        RegisterOfficerRequest request1 = new RegisterOfficerRequest(1, "John Doe", "Inspector", Gender.MALE);
        RegisterOfficerRequest request2 = new RegisterOfficerRequest(1, "Jane Smith", "Sergeant", Gender.FEMALE);

        officerService.registerOfficer(request1);
        RegisterOfficerResponse response = officerService.registerOfficer(request2);

        assertEquals(1, response.getBadgeNumber());
        assertEquals("Officer already registered", response.getMessage());
        assertEquals(1, officerService.count());
    }

    @Test
    void findOfficerById_success() {
        RegisterOfficerRequest request = new RegisterOfficerRequest(2, "Jane Smith", "Sergeant", Gender.FEMALE);
        officerService.registerOfficer(request);

        Officer found = officerService.findOfficerById(2);
        assertNotNull(found);
        assertEquals("Jane Smith", found.getOfficerName());
    }

    @Test
    void deleteOfficerById_success() {
        RegisterOfficerRequest request = new RegisterOfficerRequest(3, "Mike Ross", "Lieutenant", Gender.MALE);
        officerService.registerOfficer(request);

        assertEquals(1, officerService.count());
        officerService.deleteOfficerById(3);
        assertEquals(0, officerService.count());
    }

    @Test
    void findAllOfficers_returnsList() {
        officerService.registerOfficer(new RegisterOfficerRequest(4, "Alice", "Captain", Gender.FEMALE));
        officerService.registerOfficer(new RegisterOfficerRequest(5, "Bob", "Lieutenant", Gender.MALE));

        List<Officer> all = officerService.findAllOfficers();
        assertEquals(2, all.size());
    }
}
