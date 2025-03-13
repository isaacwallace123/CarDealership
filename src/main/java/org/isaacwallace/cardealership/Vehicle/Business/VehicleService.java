package org.isaacwallace.cardealership.Vehicle.Business;

import org.isaacwallace.cardealership.Vehicle.Presentation.Models.VehicleRequestModel;
import org.isaacwallace.cardealership.Vehicle.Presentation.Models.VehicleResponseModel;

import java.util.List;

public interface VehicleService {
    public List<VehicleResponseModel> getAllVehicles();
    public VehicleResponseModel getVehicleById(String vehicleid);
    /*public VehicleResponseModel addVehicle(VehicleRequestModel vehicleRequestModel);
    public VehicleResponseModel editVehicle(String vehicleid, VehicleRequestModel vehicleRequestModel);
    public void deleteVehicle(String vehicleid);*/
}
