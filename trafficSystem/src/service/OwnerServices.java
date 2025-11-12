package service;

import dtos.request.RegisterOwnerRequest;
import dtos.responses.RegisterOwnerResponse;
import data.models.Owner;

import java.util.List;

public interface OwnerServices {
    Owner findById(Long id);
    List<Owner> findAll();
    Owner save(Owner owner);
    void delete(Long id);
}
