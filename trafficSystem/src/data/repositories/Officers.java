package data.repositories;

import data.models.Officer;
import exceptions.IdNotFoundException;
import exceptions.InvalidObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Officers implements OfficerRepository {
    private int count;
    private final List<Officer> officers = new ArrayList<>();

    @Override
    public Officer save(Officer officer) {
        Objects.requireNonNull(officer, "officer must not be null");
        officers.add(officer);
        count++;
        return officer;
    }

    @Override
    public Officer findById(int badgeNumber) {
        for (Officer officer : officers) {
            if (officer.getBadgeNumber() == badgeNumber) {
                return officer;
            }
        }
        throw new IdNotFoundException("Officer with id " + badgeNumber + " not found");
    }

    @Override
    public List<Officer> findAll() {
        return new ArrayList<>(officers);
    }

    @Override
    public void deleteById(int badgeNumber) {
        for (int i = 0; i < officers.size(); i++) {
            if (officers.get(i).getBadgeNumber() == badgeNumber) {
                officers.remove(i);
                count--;
                return;
            }
        }
        throw new IdNotFoundException("Officer with id " + badgeNumber + " not found");
    }

    @Override
    public int getSize() {
        return officers.size();
    }

    @Override
    public void deleteAll() {
        officers.clear();
        count = 0;
    }

    @Override
    public Officer delete(Officer officer) {
        for (int i = 0; i < officers.size(); i++) {
            Officer found = officers.get(i);
            if (found.equals(officer)) {
                officers.remove(i);
                count--;
                return officer;
            }
        }
        throw new InvalidObject("Officer not found for deletion");
    }

    @Override
    public long count() {
        return count;
    }
}
