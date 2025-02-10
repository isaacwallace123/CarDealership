package org.isaacwallace.cardealership.Customer.DataAccess;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.util.UUID;

@Embeddable
@Getter
public class CustomerIdentifier {
    @Column(name = "customerid")
    private String customerid;

    public CustomerIdentifier() {
        this.customerid = UUID.randomUUID().toString();
    }

    public CustomerIdentifier(String customerid) {
        this.customerid = customerid;
    }
}