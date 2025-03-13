package org.isaacwallace.cardealership.Vehicle.DataAccess;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.util.UUID;

@Embeddable
@Getter
public class VehicleIdentifier {
    @Column(name = "vehicleid")
    private String vehicleid;

    public VehicleIdentifier() {
        this.vehicleid = UUID.randomUUID().toString();
    }

    public VehicleIdentifier(String vehicleid) {
        this.vehicleid = vehicleid;
    }
}