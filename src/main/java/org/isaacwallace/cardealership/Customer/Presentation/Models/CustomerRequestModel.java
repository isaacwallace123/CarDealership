package org.isaacwallace.cardealership.Customer.Presentation.Models;

import lombok.*;
import org.isaacwallace.cardealership.Customer.DataAccess.Address;
import org.springframework.hateoas.RepresentationModel;

import java.util.Date;

@Value
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerRequestModel extends RepresentationModel<CustomerRequestModel> {
    String first_name;
    String last_name;

    String email;

    String username;
    String password;

    Address address;
}
