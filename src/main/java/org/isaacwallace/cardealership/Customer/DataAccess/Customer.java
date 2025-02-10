package org.isaacwallace.cardealership.Customer.DataAccess;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private CustomerIdentifier customerIdentifier;

    private String first_name;
    private String last_name;
    private String email;

    private String username;
    private String password;

    @Embedded
    private Address address;

    @Embedded
    private PhoneNumber phoneNumber;
}
