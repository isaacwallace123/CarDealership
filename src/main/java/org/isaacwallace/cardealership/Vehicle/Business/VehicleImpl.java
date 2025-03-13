package org.isaacwallace.cardealership.Vehicle.Business;

import org.isaacwallace.cardealership.Utils.Exceptions.InvalidInputException;
import org.isaacwallace.cardealership.Vehicle.DataAccess.Vehicle;
import org.isaacwallace.cardealership.Vehicle.DataAccess.VehicleRepository;
import org.isaacwallace.cardealership.Vehicle.Mapper.VehicleRequestMapper;
import org.isaacwallace.cardealership.Vehicle.Mapper.VehicleResponseMapper;
import org.isaacwallace.cardealership.Vehicle.Presentation.Models.VehicleResponseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;
    private final VehicleRequestMapper vehicleRequestMapper;
    private final VehicleResponseMapper vehicleResponseMapper;

    public VehicleImpl(VehicleRepository vehicleRepository, VehicleRequestMapper vehicleRequestMapper, VehicleResponseMapper vehicleResponseMapper) {
        this.vehicleRepository = vehicleRepository;
        this.vehicleRequestMapper = vehicleRequestMapper;
        this.vehicleResponseMapper = vehicleResponseMapper;
    }

    public List<VehicleResponseModel> getAllVehicles() {
        return this.vehicleResponseMapper.entityListToResponseModelList(this.vehicleRepository.findAll());
    }

    public VehicleResponseModel getVehicleById(String vehicleid) {
        Vehicle vehicle = this.vehicleRepository.findVehicleByVehicleIdentifier_Vehicleid(vehicleid);

        if (vehicle == null) {
            throw new InvalidInputException("Unknown vehicleid: " + vehicleid);
        }

        return this.vehicleResponseMapper.entityToResponseModel(vehicle);
    }
}
