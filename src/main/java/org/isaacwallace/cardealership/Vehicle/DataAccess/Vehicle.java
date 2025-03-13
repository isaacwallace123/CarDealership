package org.isaacwallace.cardealership.Vehicle.DataAccess;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.isaacwallace.cardealership.Common.VehicleStatus;
import org.isaacwallace.cardealership.Common.VehicleUsage;
import org.isaacwallace.cardealership.Inventory.DataAccess.InventoryIdentifier;

@Entity
@Table(name="vehicles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private VehicleIdentifier vehicleIdentifier;

    @Embedded
    private InventoryIdentifier inventoryIdentifier;

    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "\"usage\"")
    private VehicleUsage usage;

    @Column(name = "\"year\"")
    private Integer year;
    private String make;
    private String model;

    @Embedded
    private Price price;
}
