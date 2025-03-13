package org.isaacwallace.cardealership.Vehicle.Mapper;

import org.isaacwallace.cardealership.Vehicle.DataAccess.Vehicle;
import org.isaacwallace.cardealership.Vehicle.Presentation.Models.VehicleResponseModel;
import org.isaacwallace.cardealership.Vehicle.Presentation.VehicleController;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.hateoas.Link;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Mapper(componentModel = "spring")
public interface VehicleResponseMapper {
    @Mapping(expression = "java(vehicle.getVehicleIdentifier().getVehicleid())", target = "vehicleid")
    VehicleResponseModel entityToResponseModel(Vehicle vehicle);
    List<VehicleResponseModel> entityListToResponseModelList(List<Vehicle> vehicles);

    @AfterMapping
    default void addLinks(@MappingTarget VehicleResponseModel vehicleResponseModel, Vehicle vehicle) {
        Link selfLink = linkTo(methodOn(VehicleController.class).GetVehicle(vehicle.getVehicleIdentifier().getVehicleid())).withSelfRel();
        vehicleResponseModel.add(selfLink);
    }
}
