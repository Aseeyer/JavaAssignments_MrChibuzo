package utils;

import data.models.Officer;
import data.models.Owner;
import data.models.Vehicle;
import dtos.request.RegisterOfficerRequest;
import dtos.request.RegisterVehicleRequest;

public class Mapper {

    public static Vehicle toVehicle(RegisterVehicleRequest request) {
        if (request == null) return null;
        Owner owner = null;
        if (request.getOwnerId() != null || request.getOwnerName() != null) {
            owner = new Owner(
                    request.getOwnerId() != null ? request.getOwnerId() : "",
                    request.getOwnerName(),
                    null,
                    null,
                    null,
                    null
            );
        }
        return new Vehicle(0, request.getName(), request.getModel(), null, request.getColor(), request.getPlateNumber(), owner);
    }


    public static Officer toOfficer(RegisterOfficerRequest request) {
        if (request == null) return null;

        Officer officer = new Officer(request.getBadgeNumber());
        officer.setOfficerName(request.getOfficerName());
        officer.setRank(request.getRank());
        officer.setGender(request.getGender());
        return officer;
    }
}
