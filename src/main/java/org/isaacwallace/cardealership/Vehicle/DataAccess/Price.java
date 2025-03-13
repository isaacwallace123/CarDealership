package org.isaacwallace.cardealership.Vehicle.DataAccess;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.isaacwallace.cardealership.Common.CurrencyType;

@Data
@NoArgsConstructor
@Embeddable
public class Price {
    @Column(name = "\"value\"")
    private Double value;

    @Enumerated(EnumType.STRING)
    private CurrencyType currency;
}

