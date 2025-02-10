package org.isaacwallace.cardealership.Customer.DataAccess;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.isaacwallace.cardealership.Common.PhoneType;

@Data
@NoArgsConstructor
@Embeddable
public class PhoneNumber {
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;
}
