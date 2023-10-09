package org.vet.management.infraestructure.adapter.in.customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.customer.ICreateCustomer;
import org.vet.management.domain.model.Customer;
import org.vet.management.domain.service.CustomerService;
import org.vet.management.domain.service.DocumentService;

public class CreateCustomerResource implements ICreateCustomer {
  @Inject
  CustomerService customerService;
  @Override
  public Response postCustomer(Customer customer) {
    return Response.ok(customerService.createCustomer(customer)).build();
  }
}
