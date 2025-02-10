package org.isaacwallace.cardealership.Customer.DataAccess;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Address {
    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
}
