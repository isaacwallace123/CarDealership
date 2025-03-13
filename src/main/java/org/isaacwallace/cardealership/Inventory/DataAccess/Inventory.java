package org.isaacwallace.cardealership.Inventory.DataAccess;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "inventories")
@AllArgsConstructor
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private InventoryIdentifier inventoryIdentifier;

    private String type;

    public Inventory() {
        this.inventoryIdentifier = new InventoryIdentifier();
    }

    public Inventory(String type) {
        this.inventoryIdentifier = new InventoryIdentifier();
        this.type = type;
    }
}
