package org.isaacwallace.cardealership.Customer.Business;

import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerRequestModel;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerResponseModel;

import java.util.List;

public interface CustomerService {
    public List<CustomerResponseModel> getAllCustomers();
    public CustomerResponseModel getCustomerById(String customerid);
    public CustomerResponseModel addCustomer(CustomerRequestModel customerRequestModel);
    public CustomerResponseModel editCustomer(String customerid, CustomerRequestModel customerRequestModel);
    public void deleteCustomer(String customerid);
}
