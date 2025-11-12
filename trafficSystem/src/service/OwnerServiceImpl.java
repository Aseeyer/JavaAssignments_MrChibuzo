package service;

import data.models.Owner;
import data.repositories.OwnerRepository;

import java.util.List;

public class OwnerServiceImpl implements OwnerServices {
    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner save(Owner owner) {
        if (owner.getOwnerName() == null || owner.getOwnerName().isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be empty");
        }
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Long id) {
        ownerRepository.delete(id);
    }
}

