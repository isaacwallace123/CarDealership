package org.isaacwallace.cardealership.Customer.Presentation.Models;

import lombok.Data;
import org.isaacwallace.cardealership.Customer.DataAccess.Address;
import org.isaacwallace.cardealership.Customer.DataAccess.PhoneNumber;
import org.springframework.hateoas.RepresentationModel;

@Data
public class CustomerResponseModel extends RepresentationModel<CustomerResponseModel> {
    private String customerid;

    private String first_name;
    private String last_name;

    private String username;
    private String email;

    private Address address;
    private PhoneNumber phoneNumber;
}
