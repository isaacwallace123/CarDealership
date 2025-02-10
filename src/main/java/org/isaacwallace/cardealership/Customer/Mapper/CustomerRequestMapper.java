package org.isaacwallace.cardealership.Customer.Mapper;

import org.isaacwallace.cardealership.Customer.DataAccess.Customer;
import org.isaacwallace.cardealership.Customer.DataAccess.CustomerIdentifier;
import org.isaacwallace.cardealership.Customer.Presentation.Models.CustomerRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerRequestMapper {
    @Mapping(target = "id", ignore = true)
    Customer requestModelToEntity(CustomerRequestModel customerRequestModel, CustomerIdentifier customerIdentifier);
}
