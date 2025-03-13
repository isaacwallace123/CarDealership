package org.isaacwallace.cardealership.Vehicle.Presentation.Models;

import lombok.Data;
import org.isaacwallace.cardealership.Common.VehicleStatus;
import org.isaacwallace.cardealership.Common.VehicleUsage;
import org.isaacwallace.cardealership.Vehicle.DataAccess.Price;
import org.springframework.hateoas.RepresentationModel;

@Data
public class VehicleResponseModel extends RepresentationModel<VehicleResponseModel> {
    private String vehicleid;
    private String inventoryid;

    private VehicleStatus status;
    private VehicleUsage usage;

    private Integer year;
    private String make;
    private String model;

    private Price price;
}
