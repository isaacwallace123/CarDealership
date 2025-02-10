package org.isaacwallace.cardealership.Customer.Mapper;

import org.isaacwallace.cardealership.Customer.DataAccess.Customer;
import org.isaacwallace.cardealership.Customer.Presentation.CustomerController;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerResponseModel;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.hateoas.Link;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Mapper(componentModel = "spring")
public interface CustomerResponseMapper {
    @Mapping(expression = "java(customer.getCustomerIdentifier().getCustomerid())", target = "customerid")
    CustomerResponseModel entityToResponseModel(Customer customer);
    List<CustomerResponseModel> entityListToResponseModelList(List<Customer> customers);

    @AfterMapping
    default void addLinks(@MappingTarget CustomerResponseModel customerResponseModel, Customer customer) {
        Link selfLink = linkTo(methodOn(CustomerController.class).GetCustomer(customer.getCustomerIdentifier().getCustomerid())).withSelfRel();
        customerResponseModel.add(selfLink);

        Link allLink = linkTo(methodOn(CustomerController.class).GetCustomers()).withRel("customers");
        customerResponseModel.add(allLink);
    }
}
