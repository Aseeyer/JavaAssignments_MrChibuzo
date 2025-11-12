package service;

import data.models.Officer;
import data.repositories.OfficerRepository;
import dtos.request.RegisterOfficerRequest;
import dtos.responses.RegisterOfficerResponse;
import utils.Mapper;

import java.util.List;
import java.util.Objects;

public class OfficerServiceImpl implements OfficerService {

    private final OfficerRepository repository;

    public OfficerServiceImpl(OfficerRepository repository) {
        this.repository = Objects.requireNonNull(repository, "repository must not be null");
    }

    @Override
    public RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request) {
        validateRequest(request);
        Officer officer = Mapper.toOfficer(request);

        boolean exists = repository.findAll().stream()
                .anyMatch(existing -> existing.getBadgeNumber() == officer.getBadgeNumber());
        if (exists) {
            return new RegisterOfficerResponse(officer.getBadgeNumber(), "Officer already registered");
        }

        repository.save(officer);
        return new RegisterOfficerResponse(officer.getBadgeNumber(), "Officer registered successfully");
    }

    private void validateRequest(RegisterOfficerRequest request) {
        if (request == null) throw new IllegalArgumentException("Request must not be null");
        if (request.getOfficerName() == null || request.getOfficerName().trim().isEmpty())
            throw new IllegalArgumentException("Officer name is required");
        if (request.getRank() == null || request.getRank().trim().isEmpty())
            throw new IllegalArgumentException("Officer rank is required");
    }

    @Override
    public Officer findOfficerById(int badgeNumber) {
        return repository.findById(badgeNumber);
    }

    @Override
    public List<Officer> findAllOfficers() {
        return repository.findAll();
    }

    @Override
    public void deleteOfficerById(int badgeNumber) {
        repository.deleteById(badgeNumber);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
