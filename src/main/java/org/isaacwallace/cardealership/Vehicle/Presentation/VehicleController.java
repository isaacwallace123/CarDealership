package org.isaacwallace.cardealership.Vehicle.Presentation;

import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerResponseModel;
import org.isaacwallace.cardealership.Vehicle.Business.VehicleService;
import org.isaacwallace.cardealership.Vehicle.Presentation.Models.VehicleResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("")
    public ResponseEntity<List<VehicleResponseModel>> GetVehicles() {
        return ResponseEntity.status(HttpStatus.OK).body(this.vehicleService.getAllVehicles());
    }

    @GetMapping("{vehicleid}")
    public ResponseEntity<VehicleResponseModel> GetVehicle(@PathVariable String vehicleid) {
        return ResponseEntity.status(HttpStatus.OK).body(this.vehicleService.getVehicleById(vehicleid));
    }
}
