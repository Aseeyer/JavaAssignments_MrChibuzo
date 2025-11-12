package data.repositories;

import data.models.Owner;

import java.util.List;

public interface OwnerRepository {
    Owner findById(Long id);
    List<Owner> findAll();
    Owner save(Owner owner);
    void delete(Long id);
}

