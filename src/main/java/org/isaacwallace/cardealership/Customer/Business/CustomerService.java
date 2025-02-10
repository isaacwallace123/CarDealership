package org.isaacwallace.cardealership.Customer.Business;

import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerRequestModel;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerResponseModel;

import java.util.List;

public interface CustomerService {
    public List<CustomerResponseModel> getAllEmployees();
    public CustomerResponseModel getEmployeeById(String employeeid);
    public CustomerResponseModel addEmployee(CustomerRequestModel employeeRequestModel);
    public CustomerResponseModel editEmployee(String employeeid, CustomerRequestModel employeeRequestModel);
    public void deleteEmployee(String employeeid);
}
