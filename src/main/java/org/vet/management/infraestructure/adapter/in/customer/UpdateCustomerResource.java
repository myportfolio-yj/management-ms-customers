package org.vet.management.infraestructure.adapter.in.customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.customer.IUpdateCustomer;
import org.vet.management.domain.model.Customer;
import org.vet.management.domain.service.CustomerService;

public class UpdateCustomerResource implements IUpdateCustomer {
  @Inject
  CustomerService customerService;
  @Override
  public Response putAddress(String idCustomer, Customer customer) {
    return Response.ok(customerService.updateCustomer(idCustomer, customer)).build();
  }
}
