package org.isaacwallace.cardealership.Vehicle.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    Vehicle findVehicleByVehicleIdentifier_Vehicleid(String vehicleid);
}
