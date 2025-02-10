package org.isaacwallace.cardealership.Customer.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findCustomerByCustomerIdentifier_Customerid(String customerid);
}
