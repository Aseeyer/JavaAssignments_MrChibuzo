package service;

import dtos.request.RegisterOfficerRequest;
import dtos.responses.RegisterOfficerResponse;
import data.models.Officer;
import java.util.List;

public interface OfficerService {
    RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request);
    Officer findOfficerById(int badgeNumber);
    List<Officer> findAllOfficers();
    void deleteOfficerById(int badgeNumber);
    long count();
}
