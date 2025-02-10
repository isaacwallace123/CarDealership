package org.isaacwallace.cardealership.Customer.Business;

import org.isaacwallace.cardealership.Customer.DataAccess.Customer;
import org.isaacwallace.cardealership.Customer.DataAccess.CustomerIdentifier;
import org.isaacwallace.cardealership.Customer.DataAccess.CustomerRepository;
import org.isaacwallace.cardealership.Customer.Mapper.CustomerRequestMapper;
import org.isaacwallace.cardealership.Customer.Mapper.CustomerResponseMapper;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerRequestModel;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerResponseModel;
import org.isaacwallace.cardealership.Utils.Exceptions.InUseException;
import org.isaacwallace.cardealership.Utils.Exceptions.InvalidInputException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerResponseMapper customerResponseMapper;
    private final CustomerRequestMapper customerRequestMapper;

    public CustomerImpl(CustomerRepository customerRepository, CustomerResponseMapper customerResponseMapper, CustomerRequestMapper customerRequestMapper) {
        this.customerRepository = customerRepository;
        this.customerResponseMapper = customerResponseMapper;
        this.customerRequestMapper = customerRequestMapper;
    }

    public List<CustomerResponseModel> getAllEmployees() {
        return this.customerResponseMapper.entityListToResponseModelList(this.customerRepository.findAll());
    }

    public CustomerResponseModel getEmployeeById(String employeeid) {
        Customer customer = this.customerRepository.findCustomerByCustomerIdentifier_Customerid(employeeid);

        if (customer == null) {
            throw new InvalidInputException("Unknown customerid: " + employeeid);
        }

        return this.customerResponseMapper.entityToResponseModel(customer);
    }

    public CustomerResponseModel addEmployee(CustomerRequestModel customerRequestModel) {
        Customer newCustomer = this.customerRequestMapper.requestModelToEntity(customerRequestModel, new CustomerIdentifier());

        return customerResponseMapper.entityToResponseModel(newCustomer);
    }

    public CustomerResponseModel editEmployee(String customerId, CustomerRequestModel customerRequestModel) {
        Customer customer = this.customerRepository.findCustomerByCustomerIdentifier_Customerid(customerId);

        if (customer == null) {
            throw new InvalidInputException("Unknown customerid: " + customerId);
        }

        Customer updatedEmployee = this.customerRequestMapper.requestModelToEntity(customerRequestModel, customer.getCustomerIdentifier());

        this.customerRepository.save(updatedEmployee);

        return this.customerResponseMapper.entityToResponseModel(updatedEmployee);
    }

    public void deleteEmployee(String customerid) {
        Customer customer = this.customerRepository.findCustomerByCustomerIdentifier_Customerid(customerid);

        if (customer == null) {
            throw new InvalidInputException("Unknown customerid: " + customerid);
        }

        try {
            this.customerRepository.delete(customer);
        } catch(DataIntegrityViolationException exception) {
            throw new InUseException("Customer is in use by another entity, currently cannot delete.");
        }
    }
}
