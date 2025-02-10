package org.isaacwallace.cardealership.Customer.Presentation;

import org.isaacwallace.cardealership.Customer.Business.CustomerService;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerRequestModel;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("")
    public ResponseEntity<List<CustomerResponseModel>> GetCustomers() {
        return ResponseEntity.status(HttpStatus.OK).body(this.customerService.getAllEmployees());
    }

    @GetMapping("{customerid}")
    public ResponseEntity<CustomerResponseModel> GetCustomer(@PathVariable String customerid) {
        return ResponseEntity.status(HttpStatus.OK).body(this.customerService.getEmployeeById(customerid));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponseModel> AddCustomer(@RequestBody CustomerRequestModel customerRequestModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.customerService.addEmployee(customerRequestModel));
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity DeleteCustomer(@RequestBody String employeeId) {
        this.customerService.deleteEmployee(employeeId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @PutMapping(value = "{customerid}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponseModel> EditCustomer(@PathVariable String customerid, @RequestBody CustomerRequestModel customerRequestModel) {
        return ResponseEntity.status(HttpStatus.OK).body(this.customerService.editEmployee(customerid, customerRequestModel));
    }
}
