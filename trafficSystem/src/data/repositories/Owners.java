package data.repositories;

import data.models.Owner;
import service.OwnerServices;

import java.util.List;

public class Owners implements OwnerServices {
    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public List<Owner> findAll() {
        return List.of();
    }

    @Override
    public Owner save(Owner owner) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
