package org.isaacwallace.cardealership.Vehicle.Mapper;

import org.isaacwallace.cardealership.Vehicle.DataAccess.Vehicle;
import org.isaacwallace.cardealership.Vehicle.Presentation.Models.VehicleRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehicleRequestMapper {
    @Mapping(target = "id", ignore = true)
    Vehicle requestModelToEntity(VehicleRequestModel vehicleRequestModel);
}
